import java.util.Scanner;
public class E022_NumerosEnRango {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número por favor: ");
        int num1 = sc.nextInt();

        System.out.println("Introduzca un segundo número: ");
        int num2 = sc.nextInt();

        if (num1 < num2) {
            System.out.println("Ahora te voy a mostrar el rango de números que hay entre " + num1 + " y " + num2+ " y que son divisibles entre 3");
            for (int i = num1+1; i < num2; i++) {
                if (E022_NumerosEnRango.EsDivisible3(i)){
                    System.out.println(i);
                }
            }
        }else {
            System.out.println("Ahora te voy a mostrar el rango de números que hay entre " + num2 + " y " + num1 + " y que son divisibles entre 3");
            for (int i = num1-1; i > num2; i--) {
                if (E022_NumerosEnRango.EsDivisible3(i)){
                    System.out.println(i);
                }
            }
        }
        System.out.println("Ya está");
    }

    public static boolean EsDivisible3(int num1) {

        if (num1%3 == 0) return true;
        else return false;
    }
}