package E066_ConectaCuatro;

public class Tableros {
    private static int[][] tablero = new int[6][7];
    private static int[] casillasFilas = new int[7];

    public static void dibujar() {
        System.out.printf(" Este es el tablero: \n\n");
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.printf(" %s  ", tablero[i][j] == 1 ? "X" : tablero[i][j] == 2 ? "O" : "·");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
        System.out.printf(" 0   1   2   3   4   5   6  \n\n");
    }

    public static int calcularPosicion(int fila){
        int posicion = 0;
        switch (casillasFilas[fila]) {
            case 0-> posicion = 5;
            case 1-> posicion = 4;
            case 2-> posicion = 3;
            case 3-> posicion = 2;
            case 4-> posicion = 1;
            case 5-> posicion = 0;
        }
        return posicion;
    }

    public static void aumentarPosicion(int fila){
        switch (fila) {
            case 0-> casillasFilas[0]++;
            case 1-> casillasFilas[1]++;
            case 2-> casillasFilas[2]++;
            case 3-> casillasFilas[3]++;
            case 4-> casillasFilas[4]++;
            case 5-> casillasFilas[5]++;
            case 6-> casillasFilas[6]++;
        }
    }

    public static void marcarCasilla(int posicion, int fila, int jugador) {
        tablero[posicion][fila] = jugador;
    }

    public static int buscarGanador() {
        int ganador = -1;

        // Verificamos columnas
        for (int i = 0; i < tablero[0].length; i++) {
            for (int j = 0; j < tablero.length - 3; j++) {
                if ((tablero[j][i] == tablero[j + 1][i] && tablero[j + 1][i] == tablero[j + 2][i] && tablero[j + 2][i] == tablero[j + 3][i]) && tablero[j][i] != 0) {
                    return tablero[j][i];
                }
            }
        }

        // Verificamos filas
        for (int j = 0; j < tablero.length; j++) {
            for (int i = 0; i < tablero[0].length - 3; i++) {
                if ((tablero[j][i] == tablero[j][i + 1] && tablero[j][i + 1] == tablero[j][i + 2] && tablero[j][i + 2] == tablero[j][i + 3]) && tablero[j][i] != 0) {
                    return tablero[j][i];
                }
            }
        }

        for (int i = 0; i < tablero.length - 3; i++) {
            for (int j = 0; j < tablero[0].length - 3; j++) {
                if ((tablero[i][j] == tablero[i + 1][j + 1] && tablero[i + 1][j + 1] == tablero[i + 2][j + 2] && tablero[i + 2][j + 2] == tablero[i + 3][j + 3]) && tablero[i][j] != 0 ) {
                    return tablero[i][j];
                }
            }
            for (int j = 3; j < tablero[0].length; j++) {
                if ((tablero[i][j] == tablero[i + 1][j - 1] && tablero[i + 1][j - 1] == tablero[i + 2][j - 2] && tablero[i + 2][j - 2] == tablero[i + 3][j - 3]) && tablero[i][j] != 0 ) {
                    return tablero[i][j];
                }
            }
        }
        return ganador;
    }

    public static int cambiarJugador( int jugador){
        return (jugador == 1) ? 2 : 1 ;
    }
}
