package E917_CastillosNaipes;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        long casos = teclado.nextLong();

        for (int i = 0; i < casos; i++) {

            long pisos;

            do {
                pisos = teclado.nextInt();
            } while (pisos < 1 || pisos > 800000000);

            long cantidadCartas = (pisos * (pisos + 1)) + (long) ((((double) pisos / 2) - 0.5) * pisos);

            System.out.println(cantidadCartas);
        }
    }
}
