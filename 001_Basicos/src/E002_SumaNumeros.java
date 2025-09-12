import java.util.Scanner;

public class E002_SumaNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Hola, introduzca el numero de numeros que quieras sumar");

        int cantidadNumeros = teclado.nextInt();

        if (cantidadNumeros <= 0) {
            System.out.println("Introduzca un numero mayor que 0");
        } else{
            int i = 1 ;
            int suma = 0;
            do {
                System.out.println("Hola, introduzca un numero");
                int numeros = teclado.nextInt();
                System.out.println("numero = " + numeros);
                System.out.println("suma = " + suma + " + " + numeros );
                suma = suma + numeros;
                System.out.println("suma es = " + suma );
                i++;
            } while (i <= cantidadNumeros);
        }

    }
}