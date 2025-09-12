import java.util.Scanner;
import java.text.DecimalFormat;
public class E025_Hipotenusa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DecimalFormat formato = new DecimalFormat ("0.00");

        System.out.println("Introduzca el primer cateto: ");
        int cateto1 = sc.nextInt();

        System.out.println("Introduzca el segundo cateto: ");
        int cateto2 = sc.nextInt();

        double hipotenusa = E025_Hipotenusa.calcularHipotenusa(cateto1, cateto2);

        System.out.format("La hipotenusa de %d y %d es %f", cateto1, cateto2, hipotenusa);

    }
    public static double calcularHipotenusa(double cateto1, double cateto2){

        return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

    }
}