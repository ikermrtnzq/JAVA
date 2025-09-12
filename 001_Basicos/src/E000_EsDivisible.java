//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class E000_EsDivisible {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("¡Hola, dime cuántos números quieres!");
        int cantidadNumeros = teclado.nextInt();

        //IF y FOR
        if (cantidadNumeros <= 10) {
            for (int i = 1; i <= cantidadNumeros; i++) {
                System.out.println("i = " + i);
            }
        } else {
            System.out.println("Numero superior a 10, no valido");
        }


        //WHILE
        int i = 1;
        while (i <= cantidadNumeros){
            System.out.println("i = " + i);
            i++;
        }

    }

    public static class EsDivisible {
    }
}
