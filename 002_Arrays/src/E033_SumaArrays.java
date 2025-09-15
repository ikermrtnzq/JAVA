import java.util.Scanner;
public class E033_SumaArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros que quieres que posea el array: ");
        int cantidadNumeros = sc.nextInt();

        int[] numeros = new int[cantidadNumeros];
        int suma= 0;

        System.out.println("Introduzca los números:  ");

        for (int i = 0; i < cantidadNumeros; i++) {
            int numero = sc.nextInt();
            numeros[i] = numero;
            System.out.println("Posición " + i+ " escogida es: "+numeros[i]);

            suma += numeros[i];

        }
        System.out.println("La suma de los numeros del array es: "+suma);

    }
}