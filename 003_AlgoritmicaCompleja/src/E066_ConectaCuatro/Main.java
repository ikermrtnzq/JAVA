package E066_ConectaCuatro;
import java.util.Scanner;
public class Main {
    private static int jugador = 1;
    private static int ganador = -1;

    public static void main(String[] args) {
        int posicion = 0;
        Scanner sc = new Scanner(System.in);
        int fila;

        do {

            Tableros.dibujar();

            do {
                System.out.printf(" Indique la fila que desees: ");
                fila = sc.nextInt();
            }while (fila < 0 || fila > 6);

            posicion = Tableros.calcularPosicion(fila);

            Tableros.marcarCasilla(posicion, fila, jugador);

            Tableros.aumentarPosicion(fila);

             ganador = Tableros.buscarGanador();

            jugador = Tableros.cambiarJugador(jugador);

        }while (ganador == -1);

        Tableros.dibujar();
        System.out.printf(" Enhorabuenaa, ha ganado el jugador %d", ganador);
    }
}
