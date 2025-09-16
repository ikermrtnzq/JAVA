import java.util.*;
public class E053_SepararRandomsParesEImpares {
    public static void main(String[] args) {
        Random rand = new Random();

        int numMaximo = 100;
        int numVeces = 20;
        int numRandom = 0;
        int cantidadPares = 0;
        int cantidadImpares = 0;
        int contadorPares = 0;
        int contadorImpares = 0;

        int[] numerosRandom = new int[numVeces];

        System.out.printf("20 numeros randoms entre 1-100: ");
        for (int i = 0; i < numVeces; i++) {
            numerosRandom[i] = rand.nextInt(numMaximo);
            System.out.format("%d ",numerosRandom[i]);
        }

        for (int i = 0; i < numVeces; i++) {
            if (numerosRandom[i] % 2 == 0) {
                cantidadPares++;
            } else cantidadImpares++;
        }

        int[] numerosRandomPares = new int[cantidadPares];
        int[] numerosRandomImpares = new int[cantidadImpares];

        for (int i = 0; i < numVeces; i++) {
            if (numerosRandom[i] % 2 == 0) {
                numerosRandomPares[contadorPares] = numerosRandom[i];
                contadorPares++;
            }else {
                numerosRandomImpares[contadorImpares] = numerosRandom[i];
                contadorImpares++;
            }
        }

        System.out.printf("\n");
        System.out.printf("20 numeros randoms pares entre 1-100: ");
        for (int i = 0; i < cantidadPares; i++) {
            System.out.printf("%d ",numerosRandomPares[i]);
        }

        System.out.printf("\n");
        System.out.printf("20 numeros randoms impares entre 1-100: ");
        for (int i = 0; i < cantidadImpares; i++) {
            System.out.printf("%d ",numerosRandomImpares[i]);
        }
    }
}