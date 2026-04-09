package E082_HundirFlota;

public class Flota {
    private final boolean[][] tablero = new boolean[10][10];
    private boolean[][] casillasYaUsadas = new boolean[10][10];
    private int[][] tableroParaPruebas = new int[10][10];
    private static int jugador = 1;
    private int[] numPartesBarco = new int[4];
    private int puntos = 0;
    private final String azul = "\u001B[34m";
    private final String rosa = "\u001B[95m";
    private final String reset = "\u001B[0m";
    private final String rojo = "\u001B[31m";

    public void generarTablero(int jugador) {
        generarBarcosde2(jugador);
        generarBarcosde3(jugador);
        generarBarcosde4(jugador);
        generarBarcosde5(jugador);
    }

    private void generarBarcosde2(int jugador){
        if (jugador == 1) {
            tablero[2][3] = true;
            tablero[2][4] = true;
            tableroParaPruebas[2][3] = 2;
            tableroParaPruebas[2][4] = 2;
        }else if (jugador == 2) {
            tablero[0][3] = true;
            tablero[0][4] = true;
            tableroParaPruebas[0][3] = 2;
            tableroParaPruebas[0][4] = 2;
        }
    }
    private void generarBarcosde3(int jugador){
        if (jugador == 1) {
            tablero[3][9] = true;
            tablero[2][9] = true;
            tablero[4][9] = true;
            tableroParaPruebas[3][9] = 3;
            tableroParaPruebas[2][9] = 3;
            tableroParaPruebas[4][9] = 3;
        }else if (jugador == 2) {
            tablero[9][9] = true;
            tablero[9][8] = true;
            tablero[9][7] = true;
            tableroParaPruebas[9][9] = 3;
            tableroParaPruebas[9][8] = 3;
            tableroParaPruebas[9][7] = 3;
        }
    }
    private void generarBarcosde4(int jugador){
        if (jugador == 1) {
            tablero[9][1] = true;
            tablero[9][2] = true;
            tablero[9][3] = true;
            tablero[9][4] = true;
            tableroParaPruebas[9][1] = 4;
            tableroParaPruebas[9][2] = 4;
            tableroParaPruebas[9][3] = 4;
            tableroParaPruebas[9][4] = 4;
        } else if (jugador == 2) {
            tablero[2][3] = true;
            tablero[2][4] = true;
            tablero[2][5] = true;
            tablero[2][6] = true;
            tableroParaPruebas[2][3] = 4;
            tableroParaPruebas[2][4] = 4;
            tableroParaPruebas[2][5] = 4;
            tableroParaPruebas[2][6] = 4;
        }
    }
    private void generarBarcosde5(int jugador){
        if (jugador == 1) {
            tablero[0][4] = true;
            tablero[0][5] = true;
            tablero[0][6] = true;
            tablero[0][7] = true;
            tablero[0][8] = true;
            tableroParaPruebas[0][4] = 5;
            tableroParaPruebas[0][5] = 5;
            tableroParaPruebas[0][6] = 5;
            tableroParaPruebas[0][7] = 5;
            tableroParaPruebas[0][8] = 5;
        } else if (jugador == 2) {
            tablero[0][0] = true;
            tablero[1][0] = true;
            tablero[2][0] = true;
            tablero[3][0] = true;
            tablero[4][0] = true;
            tableroParaPruebas[0][0] = 5;
            tableroParaPruebas[1][0] = 5;
            tableroParaPruebas[2][0] = 5;
            tableroParaPruebas[3][0] = 5;
            tableroParaPruebas[4][0] = 5;
        }
    }

    public void mostrarTablero() {
        System.out.printf("\n");
        System.out.println("  0  1  2  3  4  5  6  7  8  9");
        for (int i = 0; i < casillasYaUsadas.length; i++) {
            System.out.printf("%d", i);
            for (int j = 0; j < casillasYaUsadas[0].length; j++) {
                if (casillasYaUsadas[i][j] && tablero[i][j]) System.out.printf("%s { %s",rosa,reset);
                else if (casillasYaUsadas[i][j]) System.out.printf(" * ");
                else System.out.printf("%s ~ %s", azul, reset);
            }
            System.out.println();
        }
    }
    public void mostrarTableroBarcos(){
        System.out.printf("\n");
        System.out.println("  0  1  2  3  4  5  6  7  8  9");
        for (int i = 0; i < casillasYaUsadas.length; i++) {
            System.out.printf("%d", i);
            for (int j = 0; j < casillasYaUsadas[0].length; j++) {
                if (casillasYaUsadas[i][j] && tablero[i][j]) System.out.printf("%s { %s",rojo,reset);
                else if (tablero[i][j])System.out.printf("%s { %s",rosa,reset);
                else if (casillasYaUsadas[i][j]) System.out.printf(" * ");
                else System.out.printf("%s ~ %s", azul, reset);
            }
            System.out.println();
        }
    }

    public String comprobarSiSeHaTocadoBarco(int fila, int columna) {
        boolean tocado = tablero[fila][columna];
        casillasYaUsadas[fila][columna] = true;

        if (tocado) {
            comprobarTamanioBarco(fila, columna);
        }

        return (tocado) ? "BARCO TOCADO": "AGUAA";
    }

    public void comprobarTamanioBarco(int fila, int columna) {
        int tamanio = tableroParaPruebas[fila][columna];

        switch (tamanio){
            case 2: numPartesBarco[0] = numPartesBarco[0]+1;
            break;
            case 3: numPartesBarco[1] = numPartesBarco[1]+1;
            break;
            case 4: numPartesBarco[2] = numPartesBarco[2]+1;
            break;
            case 5: numPartesBarco[3] = numPartesBarco[3]+1;
        }
    }

    public int getJugador() {
        return  jugador;
    }

    public void cambiarTurno(){
        jugador = (getJugador() == 1)? 2 : 1;
    }

    public boolean casillaYaUsada(int fila, int columna) {
        return casillasYaUsadas[fila][columna];
    }

    public String barcoHundido(int fila, int columna) {
        int barco = tableroParaPruebas[fila][columna];
        boolean hundido = false;

        switch (barco){
            case 2: if (numPartesBarco[0] == 2) hundido = true;
            break;
            case 3: if (numPartesBarco[1] == 3) hundido = true;
            break;
            case 4: if (numPartesBarco[2] == 4) hundido = true;
            break;
            case 5: if (numPartesBarco[3] == 5) hundido = true;
        }

        aumentarWins(hundido);
        return (hundido)?"BARCO HUNDIDO\n": "\n";
    }

    private void aumentarWins(boolean hundido) {
        this.puntos = 0;
        if (hundido) {
            for (int j : numPartesBarco) {
                this.puntos = this.puntos + j;
            }
        }
    }

    public int getWins() {
        return  this.puntos;
    }
}
