public class Tablero {
    private static StringBuilder matriz = new StringBuilder("---------");
    private static int jugadorActual = 1;

    public static void dibujar() {
        System.out.println("  0 1 2");
        System.out.printf("0 %s %s %s\n1 %s %s %s\n2 %s %s %s\n", matriz.charAt(0),matriz.charAt(1), matriz.charAt(2), matriz.charAt(3), matriz.charAt(4), matriz.charAt(5), matriz.charAt(6), matriz.charAt(7), matriz.charAt(8));
    }

    public static void marcar(int fil, int col) {
        if(fil == 0 && jugadorActual == 1) matriz.setCharAt(col, 'X');
        else if(fil == 0 && jugadorActual == 2) matriz.setCharAt(col, 'O');

        if(fil == 1 && jugadorActual == 1) matriz.setCharAt(col+3, 'X');
        else if(fil == 1 && jugadorActual == 2) matriz.setCharAt(col+3, 'O');

        if(fil == 2 && jugadorActual == 1) matriz.setCharAt(col+6, 'X');
        else if(fil == 2 && jugadorActual == 2) matriz.setCharAt(col+6, 'O');
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

        if ( (matriz.charAt(0) == matriz.charAt(1) && matriz.charAt(1) == matriz.charAt(2))
                && (matriz.charAt(0) == 'X' && matriz.charAt(1) == 'X' && matriz.charAt(2) == 'X') ){
            return 1;}

        if ( (matriz.charAt(0) == matriz.charAt(1)&& matriz.charAt(1) == matriz.charAt(2))
                && (matriz.charAt(0) == 'O' && matriz.charAt(1) == 'O' && matriz.charAt(2) == 'O') ){
            return 2; }


        if ( (matriz.charAt(3) == matriz.charAt(4)&& matriz.charAt(4) == matriz.charAt(5))
                && (matriz.charAt(3) == 'X' && matriz.charAt(4) == 'X' && matriz.charAt(5) == 'X') ){
            return 1;}

        if ( (matriz.charAt(3) == matriz.charAt(4)&& matriz.charAt(4) == matriz.charAt(5))
                && (matriz.charAt(3) == 'O' && matriz.charAt(4) == 'O' && matriz.charAt(5) == 'O') ){
            return 2;}


        if ( (matriz.charAt(6) == matriz.charAt(7)&& matriz.charAt(7) == matriz.charAt(8))
                && (matriz.charAt(6) == 'X' && matriz.charAt(7) == 'X' && matriz.charAt(8) == 'X') ){
            return 1;}

        if ( (matriz.charAt(6) == matriz.charAt(7)&& matriz.charAt(7) == matriz.charAt(8))
                && (matriz.charAt(6) == 'O' && matriz.charAt(7) == 'O' && matriz.charAt(8) == 'O') ){
            return 2;}

        //Comprobacion de columnas
        if ( (matriz.charAt(0) == matriz.charAt(3)&& matriz.charAt(3) == matriz.charAt(6))
                && (matriz.charAt(0) == 'X' && matriz.charAt(3) == 'X' && matriz.charAt(6) == 'X') ){
            return 1;}

        if ( (matriz.charAt(0) == matriz.charAt(3)&& matriz.charAt(3) == matriz.charAt(6))
                && (matriz.charAt(0) == 'O' && matriz.charAt(3) == 'O' && matriz.charAt(6) == 'O') ){
            return 2;}

        if ( (matriz.charAt(1) == matriz.charAt(4)&& matriz.charAt(4) == matriz.charAt(7))
                && (matriz.charAt(1) == 'X' && matriz.charAt(4) == 'X' && matriz.charAt(7) == 'X') ){
            return 1;}

        if ( (matriz.charAt(1) == matriz.charAt(4)&& matriz.charAt(4) == matriz.charAt(7))
                && (matriz.charAt(1) == 'O' && matriz.charAt(4) == 'O' && matriz.charAt(7) == 'O') ){
            return 2;}

        if ( (matriz.charAt(2) == matriz.charAt(5)&& matriz.charAt(5) == matriz.charAt(8))
                && (matriz.charAt(2) == 'X' && matriz.charAt(5) == 'X' && matriz.charAt(8) == 'X') ){
            return 1;}

        if ( (matriz.charAt(2) == matriz.charAt(5)&& matriz.charAt(5) == matriz.charAt(8))
                && (matriz.charAt(2) == 'O' && matriz.charAt(5) == 'O' && matriz.charAt(8) == 'O') ){
            return 2;}

        //Comprobamos diagonales

        if ( (matriz.charAt(0) == matriz.charAt(4)&& matriz.charAt(4) == matriz.charAt(8))
                && (matriz.charAt(0) == 'X' && matriz.charAt(4) == 'X' && matriz.charAt(8) == 'X') ){
            return 1;}

        if ( (matriz.charAt(0) == matriz.charAt(4)&& matriz.charAt(4) == matriz.charAt(8))
                && (matriz.charAt(6) == 'O' && matriz.charAt(7) == 'O' && matriz.charAt(8) == 'O') ){
            return 2;}

        if ( (matriz.charAt(2) == matriz.charAt(4)&& matriz.charAt(4) == matriz.charAt(5))
                && (matriz.charAt(2) == 'X' && matriz.charAt(4) == 'X' && matriz.charAt(5) == 'X') ){
            return 1;}

        if ( (matriz.charAt(2) == matriz.charAt(4)&& matriz.charAt(4) == matriz.charAt(5))
                && (matriz.charAt(2) == 'O' && matriz.charAt(4) == 'O' && matriz.charAt(5) == 'O') ){
            return 2;}


        // Comprobación de si el juego continúa.
        for (int i = 0; i < 3; i++) {
            for (int col = 0; col < 3; col++) {
                if (matriz.charAt(i) == '-') {
                    return -1; // Si encontramos una posición libre, el juego sigue.
                }
            }
        }

        return 0; // Si no, hay empate.
    }
}
