import java.util.Scanner;
public class E004_MultiplicacionSimple {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Holaa, introduzca el primer numero que quieras multiplicar ");
        int numero1 = teclado.nextInt();

        System.out.println("Holaa, introduzca el segundo numero que quieras multiplicar ");
        int numero2 = teclado.nextInt();

        System.out.println("Has introducido " + numero1 + " & " + numero2);

        int resultado = 0;

        for (int i = 1; i <= numero2; i++) {
            resultado = resultado + numero1;
        }
        System.out.println("El resultado de " + numero1 + "x" + numero2 + " es: " + resultado);
    }
}