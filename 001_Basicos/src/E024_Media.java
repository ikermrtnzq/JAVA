import java.text.DecimalFormat;
import java.util.Scanner;
public class E024_Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DecimalFormat formato = new DecimalFormat ("#.00");

        System.out.println("Introduzca un numero!");
        double num = sc.nextDouble();

        double suma = 0;
        double contador = 1;
        double media = 0;


        do {
           suma = suma +num;
           System.out.println("Introduzca otro numero!");
           num = sc.nextDouble();
           contador++;
       }while(num != 0);

       contador--;

       media = suma/contador;
       System.out.println("La media es: " + media);
    }
}