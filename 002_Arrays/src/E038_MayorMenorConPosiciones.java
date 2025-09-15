import java.util.Scanner;
public class E038_MayorMenorConPosiciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la cantidad de números que quieres que posea el array\n");
        System.out.print("Intrduzca un número mayor a 1: ");
        int cantidad = sc.nextInt();

        if (cantidad == 1 || cantidad <= 0) {
            do{
                System.out.print("¡ERROR, INTRODUZCA UN NÚMERO VALIDO MAYOR A 1!\n");
                cantidad = sc.nextInt();
            }while(cantidad == 1 || cantidad <= 0);
        }

        int[] numeros = new int[cantidad];
        double promedio = 0;

        for (int i = 0; i <= cantidad-1; i++) {
            System.out.printf("Introduzca el numero %d : ", i);
            numeros[i] = sc.nextInt();
        }
        for (int numeroActual : numeros){
            promedio += numeroActual;
        }
        promedio= promedio/cantidad;
        System.out.format("El promedio es: %.2f\n",promedio);

        int posicionMayor= 0;
        int posicionMenor= 0;

        for (int i = 0; i < cantidad; i++) {
            if (numeros[i] > Integer.MIN_VALUE){
                posicionMayor= i;
                if (numeros[i] < Integer.MAX_VALUE){
                    posicionMenor= i;
                }
            }else if (numeros[i] < Integer.MAX_VALUE){
                posicionMenor= i;
            }
        }
        System.out.format("El mayor es %d (posicion %d) y el menor es %d (posicion %d)",numeros[posicionMayor],posicionMayor, numeros[posicionMenor], posicionMenor);
    }
}