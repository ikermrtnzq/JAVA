import java.util.Scanner;
public class E020_Tabla_De_Multiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número ");
        int num = sc.nextInt();

        int resultado = 0;

        System.out.println("Te mostraré su tabla de multiplicar ");

        for (int i = 0; i <= 10; i++) {

            resultado = num * i;
            System.out.format("%d * %d = %d\n",num,i,resultado);
        }
    }
}