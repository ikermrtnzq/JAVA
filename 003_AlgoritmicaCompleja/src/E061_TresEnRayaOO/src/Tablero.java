public class Tablero {
    private static int[][] matriz = new int[3][3];
    private static int jugadorActual = 1;

    public static void dibujar() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == 0) System.out.printf(" - ");
                else if (matriz[i][j] == 1) System.out.printf(" X ");
                else if (matriz[i][j] == 2) System.out.printf(" 0 ");
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

    public static void cambiarTurno() {
        if (jugadorActual == 1) jugadorActual = 2;
        else jugadorActual = 1;
    }

    public static int buscarGanador() {
        int ganador = -1;
        if ((matriz[0][0] == matriz[0][1] && matriz[0][1] == matriz[0][2]) && (matriz[0][0] != 0 && matriz[0][1] != 0 && matriz[0][2] != 0) ){
            if (matriz[0][0] == 1) ganador =  1;
            else if (matriz[0][0] == 2) ganador =   2;
        }
        if ((matriz[1][0] == matriz[1][1] && matriz[1][1] == matriz[1][2])&&(matriz[1][0] != 0 && matriz[1][1] != 0 && matriz[1][2] != 0)){
            if (matriz[1][0] == 1) ganador =  1;
            else if (matriz[1][0] == 2) ganador =  2;
        }
        if ((matriz[2][0] == matriz[2][1] && matriz[2][1] == matriz[2][2])&&(matriz[2][0] != 0 && matriz[2][1] != 0 && matriz[2][2] != 0)){
            if (matriz[2][0] == 1) ganador =  1;
            else if (matriz[2][0] == 2) ganador =  2;
        }
        if ((matriz[0][0] == matriz[1][0] && matriz[1][0] == matriz[2][0])&&(matriz[0][0] != 0 && matriz[1][0] != 0 && matriz[2][0] != 0)){
            if (matriz[0][0] == 1) ganador =  1;
            else if (matriz[0][0] == 2) ganador =  2;
        }
        if ((matriz[0][1] == matriz[1][1] && matriz[1][1] == matriz[2][1])&&(matriz[0][1] != 0 && matriz[1][1] != 0 && matriz[2][1] != 0)){
            if (matriz[0][1] == 1) ganador =  1;
            else if (matriz[0][1] == 2) ganador =  2;
        }
        if ((matriz[0][2] == matriz[1][2] && matriz[1][2] == matriz[2][2])&&(matriz[0][2] != 0 && matriz[1][2] != 0 && matriz[2][2] != 0)){
            if (matriz[0][2] == 1) ganador =  1;
            else if (matriz[0][2] == 2) ganador =  2;
        }
        if ((matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2])&&(matriz[0][0] != 0 && matriz[1][1] != 0 && matriz[2][2] != 0)){
            if (matriz[1][1] == 1) ganador =  1;
            else if (matriz[1][1] == 2) ganador =  2;
        }
        if ((matriz[0][2] == matriz[1][1] && matriz[1][1] == matriz[2][0])&&(matriz[0][2] != 0 && matriz[1][1] != 0 && matriz[2][0] != 0)){
            if (matriz[1][1] == 1) ganador = 1;
            else if (matriz[1][1] == 2)ganador = 2;
        }
        return ganador;
    }
}