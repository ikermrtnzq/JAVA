
public class Tablero {
    private static boolean[][] matriz1 = new boolean[3][3];
    private static boolean[][] matriz2 = new boolean[3][3];
    private static int jugadorActual = 1;

    public static void dibujar() {
        System.out.println("   0 1 2");
        for (int fil = 0; fil < matriz1.length; fil++) {
            System.out.print(fil + "  ");
            for (int col = 0; col < matriz1[fil].length; col++) {
                if (matriz1[fil][col])System.out.printf("X ");
                else if (matriz2[fil][col])System.out.printf("O ");
                else System.out.printf("- ");
            }
            System.out.println();
        }
    }

    //public static boolean validarCoordenadas(int fil, int col) {
      //  if (jugadorActual == 1) return(!matriz1[fil][col] && fil >= 0 && fil < 3 && col >= 0 && col < 3);
        //else if (jugadorActual == 2) return(!matriz2[fil][col] && fil >= 0 && fil < 3 && col >= 0 && col < 3);
    //}

    public static void marcar(int fil, int col) {
        if (jugadorActual == 1) matriz1[fil][col] = true;
        else if (jugadorActual == 2) matriz2[fil][col] = true;
    }

    public static int getJugadorActual() {
        return jugadorActual;
    }

    public static void alternarJugador() {
        jugadorActual = (jugadorActual == 1) ? 2 : 1;

        // Otra opción (peor):
        //if (jugadorActual == 1) jugadorActual = 2;
        //else                    jugadorActual = 1;

        // Una tercera opción (igualmente válida; y mejor si hay más de dos jugadores):
        // jugadorActual = (jugadorActual) % 2 + 1;
    }

    public static int buscarGanador() {
        // (Otra opción de resolverlo es hacer 8 if-s. Quizá sea más simple.)

        // Comprobación de filas.
        for (int fil = 0; fil < 3; fil++) {
            if (matriz1[fil][0] && matriz1[fil][0] == matriz1[fil][1] && matriz1[fil][1] == matriz1[fil][2])return  1; // Ha ganado ese "alguien".
        }
        for (int fil = 0; fil < 3; fil++) {
            if (matriz2[fil][0] && matriz2[fil][0] == matriz2[fil][1] && matriz2[fil][1] == matriz2[fil][2]) return  2; // Ha ganado ese "alguien".
        }

        // Comprobación de columnas.
        for (int col = 0; col < 3; col++) {
            if (matriz1[0][col] && matriz1[0][col] == matriz1[1][col] && matriz1[1][col] == matriz1[2][col]) return 1; // Ha ganado ese "alguien"
        }
        for (int col = 0; col < 3; col++) {
            if (matriz2[0][col] && matriz2[0][col] == matriz2[1][col] && matriz2[1][col] == matriz2[2][col]) return 2; // Ha ganado ese "alguien".
        }

        // Comprobación de diagonales.
        if (matriz1[1][1] && matriz1[0][0] == matriz1[1][1] && matriz1[1][1] == matriz1[2][2]) return 1;
        if (matriz2[1][1] && matriz2[0][0] == matriz2[1][1] && matriz2[1][1] == matriz2[2][2]) return 2;

        if (matriz1[1][1] && matriz1[0][2] == matriz1[1][1] && matriz1[1][1] == matriz1[2][0]) return 1;
        if (matriz2[1][1] && matriz2[0][2] == matriz2[1][1] && matriz2[1][1] == matriz2[2][0]) return 2;

        // Comprobación de empate.
        for (int fil = 0; fil < matriz1.length; fil++) {
            for (int col = 0; col < matriz1[fil].length; col++) {
                if (matriz1[fil][col]) return -1; // Si encontramos una posición libre, el juego sigue.
            }
        }
        for (int fil = 0; fil < matriz2.length; fil++) {
            for (int col = 0; col < matriz2[fil].length; col++) {
                if (matriz2[fil][col]) return -1; // Si encontramos una posición libre, el juego sigue.
            }
        }

        return 0; // Si no, hay empate.
    }
}
