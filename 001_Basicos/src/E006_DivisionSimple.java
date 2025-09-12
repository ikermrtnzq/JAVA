import java.util.Scanner;
public class E006_DivisionSimple {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Holaa, introduzca el primer numero que quieras dividir ");
        int dividendo = teclado.nextInt();

        System.out.println("Holaa, introduzca el segundo numero que quieras dividir ");
        int divisor= teclado.nextInt();

        System.out.println("Has introducido " + dividendo + " & " + divisor);

        int cociente = 0;
        int resto = dividendo;

        while(resto >= divisor){
            resto= resto - divisor;
            cociente++;
        }
        System.out.println("El resultado de " + dividendo + "/" + divisor + " es: " + cociente);
        System.out.println("El resto es " + resto);
    }
}