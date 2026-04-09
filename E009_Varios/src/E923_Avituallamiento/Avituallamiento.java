package E923_Avituallamiento;

import java.util.Scanner;

public class Avituallamiento {
    public static void main(String[] args) {

        String casoDeUso = """
                0 50 50 50 100 -1
                10 10 -1
                0 5 -1
                0 50 50 100 100 -1
                0 50 50 3 3 3 -1
                -1
                """;

        Scanner entrada = new Scanner(casoDeUso);
        Scanner entrada2 = new Scanner(casoDeUso);
        int numero;
        int numero2;
        int contador = 0;

        while (entrada.hasNextLine()) {
            int largo = 0;
            int longitud = 0;
            int posicion = 0;
            int longitudMayor = 0;
            int posicionMayor = 0;
            numero = 0;

            do {
                numero = entrada.nextInt();
                if (numero == -1 && contador == 0) System.exit(0);
                contador++;
            } while (numero != -1);

            for (int i = 0; i < contador - 1; i++) {
                if (i == 0) numero = entrada2.nextInt();

                numero2 = entrada2.nextInt();

                if (numero == numero2) {
                    longitud++;
                    if (longitud == 1) posicion = i;
                } else {
                    if (longitud > longitudMayor) {
                        longitudMayor = longitud;
                        posicionMayor = posicion;
                    }
                    longitud = 0;
                }

                numero = numero2;
            }

            if (posicionMayor == 0 && longitudMayor == 0) System.out.print("HOY NO COMEN\n");
            else {
                System.out.printf("%d ",posicionMayor);
                System.out.printf("%d ", longitudMayor);
                System.out.println();
            }


            contador = 0;
        }
    }
}
