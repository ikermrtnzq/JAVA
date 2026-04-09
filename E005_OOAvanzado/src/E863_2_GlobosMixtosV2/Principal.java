package E863_2_GlobosMixtosV2;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    private static int buscarGanadorFinal(int [] rondasGanadas) {
        int rondasMaximas = 0;
        int jugadorConMasRondas = Integer.MIN_VALUE;
        boolean hayEmpate = false;

        // Validamos el jugador con más rondas ganadas
        for (int i = 0; i < rondasGanadas.length; i++) {
            if (rondasGanadas[i] > rondasMaximas) {
                rondasMaximas = rondasGanadas[i];
                jugadorConMasRondas = i;
                // Si hay un jugador con más rondas no hay empate
                hayEmpate = false;
            } else if (rondasGanadas[i] == rondasMaximas) {
                // Si hay un jugador con las mismas rondas que las rondas máximas de momento hay empate
                hayEmpate = true;
            }
        }

        return hayEmpate ? -1 : jugadorConMasRondas;
    }

    private static void mostarResultadoRonda(int [] rondasGanadas, ArrayList<Jugador> jugadores){
        System.out.println("\n[ Resultado de las rondas ]: ");
        for (int i = 0; i < rondasGanadas.length; i++) {
            System.out.println("* " + jugadores.get(i).getNombre() + ": " + rondasGanadas[i] + " rondas ganadas");
        }
    }

    public static void jugarPartida(int numeroRondas, ArrayList<Jugador> jugadores) {
        Globo[] globos = new Globo[numeroRondas];
        int[] rondasGanadas = new int[jugadores.size()];

        for (int rondaActual = 0; rondaActual < numeroRondas; rondaActual++) {
            globos[rondaActual] = new Globo();
            Globo globo = globos[rondaActual];

            System.out.println("\n------------------------------------------");
            System.out.format("\n[+] ¡Ronda %d!\n", rondaActual + 1);

            int turno = 0;

            while (!globo.explotado()) {
                Jugador jugadorActual = jugadores.get(turno);

                // Y, en su lugar, poner una sola que haga lo mismo y con esta estructura:
                // (Sí, habrá que quitar el método actual determinarSoplo y poner otro en su lugar.)
                // jugadorActual.loquesea(globo);
                jugadorActual.realizarTurno(globo);

                System.out.format("\n[+] Estado del globo: %s\n\n", globo);

                if (globo.explotado()) {
                    System.out.println("\n¡💥 El globo ha explotado 💥!");
                    // El ganador de la ronda es el siguiente, "lo hare de forma ciclica"
                    int ganador = (turno + 1) % jugadores.size();
                    rondasGanadas[ganador]++;

                    mostarResultadoRonda(rondasGanadas, jugadores);
                }

                // Rotamos el turno al siguiente jugador
                turno = (turno + 1) % jugadores.size();
            }
        }

        System.out.println("\n¡Fin del juego!");

        System.out.print("Estado de los globos: [");
        for (Globo globoo : globos) {
            if (globoo.explotado()) System.out.print(" 💥");
            else System.out.print(" 🎈");
        }
        System.out.print(" ]");

        int ganadorFinal = buscarGanadorFinal(rondasGanadas);

        if (ganadorFinal == -1) {
            System.out.println("\n¡Vaya, Empate entre los jugadores con mas rondas ganadas!");
        } else {
            System.out.printf("\n¡Enhorabuena, el ganador es: %s!\n", jugadores.get(ganadorFinal).getNombre());
        }

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char respuesta;

        while (true) {
            System.out.print("\n¿Deseas jugar una nueva partida (s/n)?: ");
            respuesta = teclado.next().toLowerCase().charAt(0);

            if (respuesta == 'n') {
                System.out.println("Esperamos verte en la próxima!");
                break;
            } else if (respuesta != 's') {
                System.out.println("[-] Debes escribir 's' para continuar y 'n' para salir!");
                continue;
            }

            System.out.print("¿Cuántas rondas vais a jugar? (1-5): ");
            int numeroRondas = teclado.nextInt();

            if (numeroRondas <= 0 || numeroRondas > 5) {
                System.out.println("[-] El número de rondas debe estar entre 1 y 5");
                continue;
            }

            System.out.print("¿Cuantos jugadores vais a ser?: ");
            int numJugadores = teclado.nextInt();

            ArrayList<Jugador> jugadores = new ArrayList<>();

            for (int i = 0; i < numJugadores; i++) {
                System.out.print("\n¿Deseas añadir un jugador Humano o un Bot? (H/B): ");
                char r = Character.toUpperCase(teclado.next().charAt(0));
                boolean humano = (r == 'H');

                System.out.print(humano ? "¿Como te vas a llamar?" : "¿Como vas a llamar al bot?: ");
                String nombre = teclado.next();
                jugadores.add(humano ? new JugadorHumano(nombre) : new JugadorCPU(nombre));
            }

            jugarPartida(numeroRondas, jugadores);
        }
    }
}