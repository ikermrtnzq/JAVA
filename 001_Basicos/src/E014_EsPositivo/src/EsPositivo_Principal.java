import java.util.Scanner;


public class EsPositivo_Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el numero que quieras comprobar: ");
        int numero = sc.nextInt();

        boolean resultado = EsPositivo_Utilidades.esPositivo(numero);

        if (resultado){
            System.out.format("El número %d es positivo", numero);
        }else {
            System.out.format("El número %d es negativo",numero);
        }
    }
}