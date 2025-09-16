import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        do {
            Tablero.dibujar();

            System.out.format("J%d: Introduzca coordenadas:\n", Tablero.getJugadorActual());
            System.out.print("Fila: ");
            int fil = teclado.nextInt();
            System.out.print("Columna: ");
            int col = teclado.nextInt();

            Tablero.marcar(fil, col);

            Tablero.alternarJugador();
        } while (Tablero.buscarGanador() == -1);

        Tablero.dibujar();

        int ganador = Tablero.buscarGanador();
        if (ganador == 0) System.out.println("Ha habido empate.");
        else              System.out.printf("Ha ganado el J%d.", ganador);

        teclado.close();
    }
}