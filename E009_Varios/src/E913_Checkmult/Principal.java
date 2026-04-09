package E913_Checkmult;

import java.util.Scanner;

public class Principal {
    private static int cantidadCeros = 0;

    private static int multiplicarNumeros(String numeroCompleto) {
        if (Integer.parseInt(String.valueOf(numeroCompleto)) <= 9) return Integer.parseInt(String.valueOf(numeroCompleto));

        int resultado = 1;

        for (int i = 0; i < numeroCompleto.length(); i++) {
            int numero = Integer.parseInt(String.valueOf(numeroCompleto.charAt(i)));

            if (numero != 0) resultado *= numero;
            else cantidadCeros++;
        }

        return multiplicarNumeros(String.valueOf(resultado));
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;

        do {
            cantidadCeros = 0;
            numero = teclado.nextInt();

            if (numero == 0) break;

            int resultadoMultiplicacion = multiplicarNumeros(String.valueOf(numero));

            System.out.printf("%d%d\n", resultadoMultiplicacion, cantidadCeros);
        } while (true);
    }
}
