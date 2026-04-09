package E912_SumaPiramidal2D;

public class principal {
    private static int[][] valores = new int[10][10];
    public static final String RESET = "\u001B[0m";
    public static final String VERDE = "\u001B[32m";
    public static final String AZUL = "\u001B[34m";

    public static void main(String[] args) {
        sumaPiramidalRecursiva2D(2,3, 5);

        System.out.printf("\nVALORES\n ");
        for (int i = 0; i < valores.length; i++) {
            System.out.printf("\n%s--------------------------------------------------------------------------------%s\n",VERDE, RESET);
            for (int j = 0; j < valores[0].length; j++){
                if (valores[i][j] != 0 )System.out.printf("%s|%s %04d %s|%s",VERDE,AZUL,valores[i][j], VERDE, RESET);
                else System.out.printf("%s|%s %04d %s|%s",VERDE,RESET,valores[i][j], VERDE, RESET);
            }
        }
        System.out.printf("\n%s--------------------------------------------------------------------------------%s",VERDE, RESET);
    }

    private static void sumaPiramidalRecursiva2D(int fila, int columna, int valor) {
        if (columna > 0 && columna < valores.length -1 && valor > 0) {
            valores[fila][columna] += valor;
            sumaPiramidalRecursiva2D(fila,columna-1, valor-1);
            sumaPiramidalRecursiva2D(fila,columna+1, valor-1);
        }
        if (fila > 0 && fila < valores.length -1 && valor > 0) {
            valores[fila][columna] += valor;
            sumaPiramidalRecursiva2D(fila-1,columna, valor-1);
            sumaPiramidalRecursiva2D(fila+1,columna, valor-1);
        }
    }

}

