import java.util.Scanner;
public class E010_FactorialIterativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero para hacer el factorial");
        int numero = sc.nextInt();
        String factorial = "";

        for (int i = numero; i > 0; i--) {
            factorial = factorial + i + " * ";
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}