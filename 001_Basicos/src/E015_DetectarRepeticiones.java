import java.util.Scanner;
public class E015_DetectarRepeticiones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la cantidad de repeticiones que quieres detectar: ");
        int objetivoRepeticiones = sc.nextInt();

        int detectadasRepeticiones = 1;

        System.out.println("Introduzca el primer número para empezar el bucle: ");
        int numero = sc.nextInt();
        do {

            int numero2 = sc.nextInt();

            if (numero == numero2) {
                detectadasRepeticiones++;
            }
            numero = numero2;

        }while (objetivoRepeticiones != detectadasRepeticiones);

        System.out.println("¡Ya han sido detectadas las suficientes repeticiones!");

    }
}