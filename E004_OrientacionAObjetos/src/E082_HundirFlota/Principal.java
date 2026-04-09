package E082_HundirFlota;
import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Flota flota1 = new Flota();
        Flota flota2 = new Flota();
        int fila;
        int columna;

        flota1.generarTablero(1);
        flota2.generarTablero(2);

        do {
            System.out.printf("\nTu tablero Jugador %d", flota1.getJugador());
            if (flota1.getJugador() == 1) flota1.mostrarTableroBarcos();
            else flota2.mostrarTableroBarcos();

            System.out.printf("\nEl tablero de tu oponente (Jugador %d)", (flota1.getJugador() == 1) ? 2 : 1);
            if (flota1.getJugador() == 1) flota2.mostrarTablero();
            else flota1.mostrarTablero();
            do {
                System.out.printf("\nJugador %s Introduzca la fila a atacar: ", flota1.getJugador());
                fila = sc.nextInt();

                System.out.printf("\nJugador %s Introduzca la columna a atacar: ", flota1.getJugador());
                columna = sc.nextInt();

                if(flota1.casillaYaUsada(fila, columna)) System.out.printf("\n\nCoordenadas ya usadas ");


            }while ((flota1.getJugador() == 1)? flota2.casillaYaUsada(fila,columna) :flota1.casillaYaUsada(fila, columna));

            if (flota1.getJugador() == 1) System.out.printf("\n%s",flota2.comprobarSiSeHaTocadoBarco(fila, columna));
            else if (flota1.getJugador() == 2) System.out.printf("\n%s",flota1.comprobarSiSeHaTocadoBarco(fila, columna));

            if (flota1.getJugador() == 1) System.out.printf("\n%s",flota2.barcoHundido(fila, columna));
            else if (flota1.getJugador() == 2) System.out.printf("\n%s",flota1.barcoHundido(fila, columna));

            flota1.cambiarTurno();
        }while (!(flota1.getWins() == 14 || flota2.getWins() == 14));
    }
}
