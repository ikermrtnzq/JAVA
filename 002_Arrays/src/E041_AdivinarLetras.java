import java.util.Arrays;
import java.util.Scanner;
public class E041_AdivinarLetras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("........Turno del jugador 1.......... \n");

        System.out.printf("Introduzca la cantidad de letras que quieres: ");
        int cantidadChars = sc.nextInt();

        char[] letras  = new char[cantidadChars];
        boolean[] booleanos = new boolean[cantidadChars];
        char[] letrasSecretas = new char[cantidadChars];

        for (int i = 0; i < cantidadChars; i++) {
            System.out.format("Introduzca la letra %d: ", i);
            letras[i] = sc.next().charAt(0);
            booleanos[i] = false;

            if (!(letras[i] >= 'a' && letras[i] <= 'z')) {
                do {
                    System.out.println( letras[i] + " no es una letra");
                    System.out.format("Introduzca la letra %d: ", i);
                    letras[i] = sc.next().charAt(0);
                    booleanos[i] = false;
                }while(!(letras[i] >= 'a' && letras[i] <= 'z'));
            }
        }

        for (int i = 0; i < cantidadChars; i++) {
            letrasSecretas[i] = '*';
        }
        for (int i = 0; i < cantidadChars; i++){
            System.out.print(letrasSecretas[i]);
        }
        for (int i = 0; i < cantidadChars; i++){
            System.out.format(" %b ",booleanos[i]);
        }

        System.out.printf("\n........Turno del jugador 2.......... ");

        do {
            System.out.printf("\nIntente adivinar una letra: ");
            char letra = sc.next().charAt(0);

            for (int i = 0; i < cantidadChars; i++) {
                if (letras[i] == letra) {
                    System.out.format("¡Enhorabuena, %s está entre las letras mágicas! \n", letra);
                    letrasSecretas[i]= letra;
                    booleanos[i] = true;
                }
            }
            for (int i = 0; i < cantidadChars; i++){
                System.out.print(letrasSecretas[i]);
            }
            for (int i = 0; i < cantidadChars; i++){
                System.out.format(" %b ",booleanos[i]);
            }
        }while(!(Arrays.equals(letras,letrasSecretas)));

        System.out.printf("\n........¡ENHORABUENA, HAS GANADO!.......... ");
    }
}