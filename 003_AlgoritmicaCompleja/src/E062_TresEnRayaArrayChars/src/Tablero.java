
public class Tablero {
    private static char[][] matriz = {
            {'-','-','-' },
            {'-','-','-' },
            {'-','-','-' }
    };
    private static int jugadorActual = 1;

    public static void dibujar() {
        System.out.println("  0 1 2");
        for (int fil = 0; fil < matriz.length; fil++) {
            System.out.print(fil + " ");
            for (int col = 0; col < matriz[fil].length; col++) {
                System.out.print(" " + matriz[fil][col]);
            }
            System.out.println();
        }
    }

    public static boolean validarCoordenadas(int fil, int col) {
        return (matriz[fil][col] == '-' && fil >= 0 && fil < 3 && col >= 0 && col < 3);
    }

    public static void marcar(int fil, int col) {
        matriz[fil][col] = (jugadorActual == 1) ? 'X' : 'O';
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
            if (
                    matriz[fil][0] != '-' // La posición es de "alguien".
                        &&
                    matriz[fil][0] == matriz[fil][1] && matriz[fil][1] == matriz[fil][2] // Los tres valores son iguales.
            ) {
                return (matriz[fil][0] != 'O') ?  1: 2; // Ha ganado ese "alguien".
            }
        }

        // Comprobación de columnas.
        for (int col = 0; col < 3; col++) {
            if (
                    matriz[0][col] != '-' // La posición es de "alguien".
                        &&
                    matriz[0][col] == matriz[1][col] && matriz[1][col] == matriz[2][col] // Los tres valores son iguales.
            ) {
                return (matriz[0][col] != 'O') ?  1: 2; // Ha ganado ese "alguien".
            }
        }

        // Comprobación de diagonales.
        if (
                matriz[1][1] != '-' // Posición del medio ocupada.
                    &&
                matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2] // Diagonal "\", tres valores iguales.
        ) {
            return (matriz[1][1] != 'O') ? 1: 2; // Devolvemos la posición del medio.
        }
        if (
                matriz[1][1] != '-' // Posición del medio ocupada.
                        &&
                matriz[0][2] == matriz[1][1] && matriz[1][1] == matriz[2][0] // Diagonal "/", tres valores iguales.
        ) {
            return (matriz[1][1] != 'O') ? 1: 2; // Devolvemos la posición del medio.
        }

        // Comprobación de empate.
        for (int fil = 0; fil < matriz.length; fil++) {
            for (int col = 0; col < matriz[fil].length; col++) {
                if (matriz[fil][col] == '-') {
                    return -1; // Si encontramos una posición libre, el juego sigue.
                }
            }
        }

        return 0; // Si no, hay empate.
    }
}
