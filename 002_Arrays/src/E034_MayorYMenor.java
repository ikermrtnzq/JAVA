import java.util.Scanner;
public class E034_MayorYMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la cantidad de numeros que va a poseer el array: ");
        int cantidadNumeros = sc.nextInt();

        int minimo = Integer.MAX_VALUE;
        int maximo = Integer.MIN_VALUE;

        int[] numeros = new int[cantidadNumeros];

        System.out.println("Introduzca ahora los numeros del array: ");

        for (int i = 0; i < cantidadNumeros; i++) {
            numeros[i] = sc.nextInt();

            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }else if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }
        System.out.println("El mayor es el "+ maximo+", y el minimo es "+ minimo);
    }
}