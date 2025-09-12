import java.util.Scanner;
public class E012_AdivinarElNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa el numero con el que quieras jugar: ");
        int numOriginal = teclado.nextInt();
        int numIntento = 0;
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        do{
            System.out.println("Ingresa el numero con el que quieras probar: ");
            numIntento = teclado.nextInt();

            if(numIntento < numOriginal){
                System.out.println("El número es más grande ");
            } else if (numIntento >numOriginal) {
                System.out.println("El número es más pequeño ");
            }
        }
        while(numIntento != numOriginal);
        System.out.println("¡¡¡Enhorabuena, lo has adivinado!!!");
    }
}