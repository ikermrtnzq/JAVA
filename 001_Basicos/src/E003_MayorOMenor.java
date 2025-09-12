import java.util.Scanner;

public class E003_MayorOMenor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Hola, introduzca un número inicial");
        int numero = teclado.nextInt();
        int numeroInicial = numero;

        do {
            System.out.println("Hola, introduzca un número para comparar ");
            numero = teclado.nextInt();
            if (numero > numeroInicial && numero > 0) {
                System.out.println(numero +" es mayor que " + numeroInicial);
            }else if (numero < 0) {
                do {
                    System.out.println("Hola, introduzca un número válido mayor que 0 ");
                    numero = teclado.nextInt();
                }while(numero < 0);
            }else if (numero == numeroInicial) {
                System.out.println(numero +" es igual que " + numeroInicial);
            }else {
                System.out.println(numero +" es menor que " + numeroInicial);
            }
            numeroInicial = numero;
        }while (numero != 0);{

        }

    }
}