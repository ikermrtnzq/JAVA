import java.util.Scanner;
public class E005_MultiplicacionConNegativos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Holaa, introduzca el primer numero que quieras multiplicar ");
        int numero1 = teclado.nextInt();

        System.out.println("Holaa, introduzca el segundo numero que quieras multiplicar ");
        int numero2 = teclado.nextInt();

        System.out.println("Has introducido " + numero1 + " & " + numero2);
        int resultado = 0;

        if (numero1 < 0 && numero2 < 0){
            int numero1Positivo = 0;
            int numero2Positivo = 0;
            numero1Positivo = numero1Positivo - numero1;
            numero2Positivo = numero2Positivo - numero2;

            for (int i = 1; i <= numero1Positivo; i++) {
                resultado = resultado + numero2Positivo;
            }
            System.out.println("El resultado de " + numero1 + "x" + numero2 + " es: " + resultado);

        }else if (numero2 < 0){

            int numero2Positivo = 0;
            numero2Positivo = numero2Positivo - numero2;
            System.out.println("Numero negativo pasado a positivo: " + numero2Positivo);
            for (int i = 1; i <= numero1; i++) {
                resultado = resultado - numero2Positivo;
            }
            System.out.println("El resultado de " + numero1 + "x" + numero2 + " es: " + resultado);
        }
        else {
        for (int i = 1; i <= numero2; i++) {
            resultado = resultado + numero1;
        }
        System.out.println("El resultado de " + numero1 + "x" + numero2 + " es: " + resultado);
        }
    }

}