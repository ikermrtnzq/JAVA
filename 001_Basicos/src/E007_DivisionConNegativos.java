import java.util.Scanner;
public class E007_DivisionConNegativos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Holaa, introduzca el primer numero que quieras dividir ");
        int dividendo = teclado.nextInt();

        System.out.println("Holaa, introduzca el segundo numero que quieras dividir ");
        int divisor= teclado.nextInt();

        System.out.println("Has introducido " + dividendo + " & " + divisor);

        //Inicializamos a 0 tanto cociente como resto, esto para que en cada situación
        //tome el valor correspondiente para que salga correct el resultado
        int cociente = 0;
        int resto = 0;

        if (dividendo < 0 && divisor < 0) {

            //Inicializamos las variables a 0 para que al restar salga correcto
            //el paso de numero negativo a positivo
            int dividendoPositivo = 0;
            int divisorPositivo = 0;

            //Lo que hacemos es convertimos el numero negativo en positivo a base de restas
            dividendoPositivo = dividendoPositivo - dividendo;
            divisorPositivo = divisorPositivo - divisor;
            resto = dividendoPositivo;

            while(resto >= divisorPositivo){
                resto= resto - divisorPositivo;
                cociente++;
            }

            System.out.println("El resultado de " + dividendo + "/" + divisor + " es: " + cociente);
            System.out.println("El resto es " + resto);

        } else if (dividendo < 0) {
            int dividendoPositivo = 0;

            //Lo que hacemos es convertimos el numero negativo en positivo a base de restas
            dividendoPositivo = dividendoPositivo - dividendo;
            resto = dividendoPositivo;

            while(resto >= divisor){
                resto= resto - divisor;
                cociente--;
            }

            System.out.println("El resultado de " + dividendo + "/" + divisor + " es: " + cociente);
            System.out.println("El resto es " + resto);

        }else if (divisor < 0) {
            int divisorPositivo = 0;

            //Lo que hacemos es convertimos el numero negativo en positivo a base de restas
            divisorPositivo = divisorPositivo - divisor;
            resto= dividendo;

            while(resto >= divisorPositivo){
                resto= resto - divisorPositivo;
                cociente--;
            }

            System.out.println("El resultado de " + dividendo + "/" + divisor + " es: " + cociente);
            System.out.println("El resto es " + resto);
        }
    }
}