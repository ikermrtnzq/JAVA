import java.text.DecimalFormat;
import java.util.Scanner;
public class E027_Potencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DecimalFormat formato = new DecimalFormat ("#.00");

        System.out.println("Introduzca una base: ");
        int base = sc.nextInt();

        System.out.println("Introduzca un exponente: ");
        int exponente = sc.nextInt();

        double resultado = E027_Potencia.calcularPotencia(base,exponente);
        System.out.format("El resultado de %d elevado a %d es %f ",base,exponente,resultado);
    }
    public static double calcularPotencia(double base, double exponente) {
        double resultado = 0;
        if (exponente == 0) {
            resultado = 1;
        }else if (exponente == 1) {
            resultado = base;
        }else {
            resultado = 1;
            for (int i = 1; i <= exponente; i++) {
                resultado = resultado * base;
            }
        }
        return resultado;
    }
}