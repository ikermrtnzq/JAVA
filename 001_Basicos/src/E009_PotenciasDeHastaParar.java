import java.util.Scanner;
public class E009_PotenciasDeHastaParar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca s para continuar y n para parar");
        String ordenOriginal = teclado.next().toLowerCase();
        char orden = ordenOriginal.charAt(0);
        int potencia = 0;
        while (orden != 'n') {
            if (orden == 's') {
                if(potencia == 0){
                    potencia = 1;
                    System.out.println(potencia);
                    System.out.println("Has seleccionado continuar");
                    orden = teclado.next().toLowerCase().charAt(0);
                }
                System.out.println("Has seleccionado continuar");
                potencia = potencia * 2;
                System.out.println(potencia);
                orden = teclado.next().toLowerCase().charAt(0);
            } else {
                System.out.println("Orden invalida");
                System.out.println("Introduzca s para continuar y n para parar");
                orden = teclado.next().toLowerCase().charAt(0);
            }
        }

    }
}