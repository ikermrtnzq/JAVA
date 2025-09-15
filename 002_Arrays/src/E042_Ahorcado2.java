import java.util.Scanner;
public class E042_Ahorcado2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("........Turno del jugador 1.......... \n");

        System.out.printf("Introduzca la palabra que quieras que sea adivinada: ");
        String palabra = sc.nextLine();
        int longitudPalabra = palabra.length();

        boolean[] booleanos = new boolean[longitudPalabra];
        int intentos = 6;
        String letrasUsadas= "";

        String letrasSecretas = "";
        for (int i = 0; i < longitudPalabra; i++) {
            letrasSecretas = letrasSecretas + '*';
        }

        StringBuilder letrasSecretasCopia = new StringBuilder(letrasSecretas);
        System.out.printf("%s \n", letrasSecretas);

        for (int i = 0; i < longitudPalabra; i++){
            System.out.format(" %b ",booleanos[i]);
        }

        System.out.printf("\n........Turno del jugador 2.......... ");

        do {
            System.out.printf("\nIntente adivinar una letra: ");
            char letra = sc.next().charAt(0);

            for (int i = 0; i < longitudPalabra; i++) {
                if (palabra.charAt(i) == letra) {
                    System.out.format("¡Enhorabuena, %s está entre las letras mágicas! \n", letra);
                    letrasSecretasCopia.setCharAt( i, letra);
                    booleanos[i] = true;
                }else {
                    intentos--;
                }
            }
            letrasUsadas = letrasUsadas + letra;
            intentos = intentos + longitudPalabra -1;

            System.out.println(" ____");
            switch (intentos) {
                case 5 -> {
                    System.out.println(" |  0");
                    System.out.println(" |");
                    System.out.println(" |");
                }
                case 4 -> {
                    System.out.println(" |  0");
                    System.out.println(" |  |");
                    System.out.println(" |");
                }
                case 3 -> {
                    System.out.println(" |  0");
                    System.out.println(" | -|");
                    System.out.println(" |");
                }
                case 2 -> {
                    System.out.println(" |  0");
                    System.out.println(" | -|-");
                    System.out.println(" |");
                }
                case 1 -> {
                    System.out.println(" |  0");
                    System.out.println(" | -|-");
                    System.out.println(" | /");
                }
                case 0 -> {
                    System.out.println(" |  0");
                    System.out.println(" | -|-");
                    System.out.println(" | / \\ ");
                }
            }
            System.out.println("_|_");
            System.out.println();

            System.out.printf("Te quedan %d intentos\n", intentos);

            System.out.printf("%s \n",letrasSecretasCopia);

            for (int i = 0; i < longitudPalabra; i++){
                System.out.format(" %b ",booleanos[i]);
            }

            System.out.format("\nLetras Usadas: %s\n", letrasUsadas);

            if(intentos == 0){
                System.out.printf("\n........¡LO SIENTO, HAS PERDIDO!.......... ");
                System.out.printf("\n........TE HAS QUEDADO SIN INTENTOS.......... ");
                break;
            }

        }while(!(palabra.contentEquals(letrasSecretasCopia)));

        if (palabra.contentEquals(letrasSecretasCopia)){
            System.out.printf("\n........¡ENHORABUENA, HAS GANADO!.......... ");
        }
    }
}