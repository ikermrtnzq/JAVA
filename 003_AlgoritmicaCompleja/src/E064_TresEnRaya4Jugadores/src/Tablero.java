
public class Tablero {
    private static int[][] matriz = new int[3][3];
    private static int jugadorActual = 1;

    public static void dibujar() {
        System.out.println("  0 1 2");
        for (int fil = 0; fil < matriz.length; fil++) {
            System.out.print(fil + " ");
            for (int col = 0; col < matriz[fil].length; col++) {
                System.out.print(switch (matriz[fil][col]) {
                    case 1 -> "X ";
                    case 2 -> "O ";
                    case 3 -> "* ";
                    case 4 -> "# ";
                    default -> "· "; // Caso 0.
                });
            }
            System.out.println();
        }
    }

    public static void marcar(int fil, int col) {
        matriz[fil][col] = jugadorActual;
    }

    public static int getJugadorActual() {
        return jugadorActual;
    }

    public static void alternarJugador() {
        if (jugadorActual == 4) jugadorActual = 1;
        jugadorActual++;


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
            if (
                    matriz[fil][0] != 0 // La posición es de "alguien".
                        &&
                    matriz[fil][0] == matriz[fil][1] && matriz[fil][1] == matriz[fil][2] // Los tres valores son iguales.
            ) {
                return matriz[fil][0]; // Ha ganado ese "alguien".
            }
        }

        // Comprobación de columnas.
        for (int col = 0; col < 3; col++) {
            if (
                    matriz[0][col] != 0 // La posición es de "alguien".
                        &&
                    matriz[0][col] == matriz[1][col] && matriz[1][col] == matriz[2][col] // Los tres valores son iguales.
            ) {
                return matriz[0][col]; // Ha ganado ese "alguien".
            }
        }

        // Comprobación de diagonales.
        if (
                matriz[1][1] != 0 // Posición del medio ocupada.
                    &&
                matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2] // Diagonal "\", tres valores iguales.
        ) {
            return matriz[1][1]; // Devolvemos la posición del medio (por ejemplo).
        }
        if (
                matriz[1][1] != 0 // Posición del medio ocupada.
                        &&
                matriz[0][2] == matriz[1][1] && matriz[1][1] == matriz[2][0] // Diagonal "/", tres valores iguales.
        ) {
            return matriz[1][1]; // Devolvemos la posición del medio (por ejemplo).
        }

        // Comprobación de si el juego continúa.
        for (int fil = 0; fil < 3; fil++) {
            for (int col = 0; col < 3; col++) {
                if (matriz[fil][col] == 0) {
                    return -1; // Si encontramos una posición libre, el juego sigue.
                }
            }
        }

        return 0; // Si no, hay empate.
    }
}
