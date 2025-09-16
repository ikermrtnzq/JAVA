import java.util.Scanner;
public class E051_Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continuar = 's';
        double num1 = 0;
        double num2 = 0;
        double resultado = 0;

        System.out.printf("¡Buenos días, bienvenido a la calculadora online!\n");

        do {
            System.out.printf("Indique la operación que quieras realizar: ");
            System.out.printf("\nOpciones: \n 1 - suma\n 2 - resta\n 3 - multiplicacion\n " + "4 - division\n 5 - potencia\n " +
                              "6 - raíz\n 7 - logaritmo base 2\n 8 - logaritmo base 10\n Introduzca: ");
            char operacion = sc.next().charAt(0);

            if (operacion == '6' || operacion == '7' || operacion == '8') {
                System.out.printf("Introduzca el número para realizar la operación: ");
                num1 =  sc.nextDouble();
            } else {
                System.out.printf("Introduzca el primer número de la operación: ");
                num1 =  sc.nextDouble();

                System.out.printf("Introduzca el segundo número de la operación: ");
                num2 = sc.nextDouble();
            }

            switch (operacion) {
                case '1' -> resultado = num1 + num2;
                case '2' -> resultado = num1 - num2;
                case '3' -> resultado = num1 * num2;
                case '4' -> resultado = num1 / num2;
                case '5' -> resultado = Math.pow(num1, num2);
                case '6' -> resultado = Math.sqrt(num1);
                case '7' -> resultado = Math.log(num1);
                case '8' -> resultado = Math.log10(num1);
            }
            System.out.printf("El resultado es: %.2f\n", resultado);

            System.out.printf("¿Quieres continuar? [S/N]: ");
            continuar = sc.next().toLowerCase().charAt(0);

        } while (continuar == 's');
    }
}