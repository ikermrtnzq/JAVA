package E908_SumaPiramidal;

import java.util.Arrays;

public class principal {
    private static int[] valores = new int[10];

    public static void main(String[] args) {
        sumaPiramidalRecursiva(5, 2);
        System.out.printf("\nVALORES\n %s", Arrays.toString(valores));
    }

    private static void sumaPiramidalRecursiva(int posicion, int valor) {
        if (posicion > 0 && posicion < valores.length && valor > 0) {
            valores[posicion] += valor;
            sumaPiramidalRecursiva(posicion-1, valor-1);
            sumaPiramidalRecursiva(posicion+1, valor-1);
        }
    }

}
