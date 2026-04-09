package E863_GlobosConJugadoresMixtos;

import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        JugadorHumano jugadorHumano = new JugadorHumano();
        JugadorCPU jugadorCPU = new JugadorCPU();
        String jugadores = "";
        int cantidadInflar = 0;
        int ronda = 1;
        String ganador = "";
        char j1 ; char j2 ; char j3 ; char j4 ; char j5 ;
        int[] puntosXJugador = new int[5];
        int[] cantidadSopliJugador = new int[5];
        int[] ultimaCantidadSoplada =  new int[5];
        int numJugadores;

        do {
            System.out.println("Cuantos jugadores quieres: ");
            numJugadores = sc.nextInt();
        }while (numJugadores > 5 || numJugadores == 0);


        ArrayList<String> jugadoresList = new ArrayList<>() ;
        for (int i = 0; i < numJugadores; i++) jugadoresList.add("");

        if (jugadoresList.size() >= 2) {jugadoresList.set(0,"Iker"); jugadoresList.set(1,"Ibrahim");}
        if (jugadoresList.size() >= 3) {jugadoresList.set(2,"Lucia");}
        if (jugadoresList.size() >= 4) {jugadoresList.set(3,"Marcos");}
        if (jugadoresList.size() >= 5) {jugadoresList.set(4,"Alain");}

        switch (numJugadores){
            case 2: jugadores = "HH";
            break;
            case 3: jugadores = "HHC";
            break;
            case 4: jugadores = "HHCC";
            break;
            case 5: jugadores = "CCCCC";
            break;
        }

        for (int i = 0; i < 5; i++) {
            Globo globo = new Globo();
            globo.pasarPuntos(puntosXJugador);
            globo.pasarCantidadSoplidos(cantidadSopliJugador);
            globo.pasarUltimaCantidadSoplada(ultimaCantidadSoplada);
            do {
                System.out.printf("\nRonda %d", ronda);

                System.out.printf("\nTurno de %s", globo.getJugador());


                if (jugadores.charAt(globo.getJugador()-1) == 'H') cantidadInflar = jugadorHumano.determinarSoplo(ultimaCantidadSoplada, globo.getJugador()-1);
                else {cantidadInflar = jugadorCPU.determinarSoplo(ultimaCantidadSoplada, globo.getJugador()-1);}


                globo.sumarSoplidos(cantidadInflar);
                globo.actualizarUltimaCantidadSoplada(cantidadInflar);
                globo.inflar(cantidadInflar);

                System.out.println();

                if (globo.seHaExplotado()) {
                    System.out.printf("\n%d HA EXPLOTADO EL GLOBO\n",(globo.getJugador()));
                    globo.aumentarPuntos();

                    for (int j = 0; j < jugadoresList.size(); j++) {
                        System.out.printf("\n|Aire soplado Jugador %s : %d |", jugadoresList.get(j), globo.getCantidadSoplido(j));
                    }
                    System.out.printf("\n\n");
                    for (int j = 0; j < jugadoresList.size(); j++) {
                        System.out.printf("| %s : %d |", jugadoresList.get(j), globo.getPoints(j));
                    }
                    System.out.println();
                }
                globo.cambiarJugador(numJugadores);
            }while (!(globo.seHaExplotado()));
            ronda = globo.aumentarRonda(ronda);

            if (ronda == 6){
                ganador = globo.getWinner();
            }
        }
        System.out.printf("\nHa ganado %s", ganador);

    }
}
