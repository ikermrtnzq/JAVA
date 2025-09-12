import java.util.Scanner;
public class E026_SumarDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        int numero = sc.nextInt();
        int numeroCopia = numero;

        int suma = 0;

        while (numeroCopia > 0) {
            suma += numeroCopia % 10;
            numeroCopia /= 10;
        }

        System.out.println("La suma de " + numero +" que has introducido es: " + suma);

    }
}