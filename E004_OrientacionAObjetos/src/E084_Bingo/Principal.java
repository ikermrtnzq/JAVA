package E084_Bingo;

import java.util.Scanner;

/**
 * Esto es la clase principal del bingo
 * @author iker
 * @version 1.5
 * @since 1.0
 */

public class Principal {
    /**
     * Esto es un metodo main donde se llama a los metodos de otras clases
     * @param args
     */
    public static void main(String[] args) {
        int cantidadBolas = 50;
        Bombo bombo = new Bombo(cantidadBolas);
        Carton carton1  = new Carton(13, 3, 5, bombo, cantidadBolas);
        Carton carton2  = new Carton(13, 3, 5, bombo, cantidadBolas);
        String continuar ="";
        Scanner sc = new Scanner(System.in);

        carton1.rellenarCarton(cantidadBolas);
        carton2.rellenarCarton(cantidadBolas);

       do {
           carton1.mostrarCarton();
           carton2.mostrarCarton();

           System.out.printf("\nHa salido el : %d\n", bombo.dameBola());
           carton1.marcarYaSalidas();
           carton2.marcarYaSalidas();
           bombo.cualesHanSalido();

           System.out.printf("\nPulse para continuar: ");
           continuar = sc.nextLine();

           carton1.comprobarLinea();
           carton2.comprobarLinea();

       }while(!(carton1.comprobarSiHaGanado(cantidadBolas) ||  carton2.comprobarSiHaGanado(cantidadBolas)));

        System.out.printf("\n%s YA HAN CANTADO CARTÓN\n", (carton1.comprobarSiHaGanado(cantidadBolas))? "JUGADOR 1":"JUGADOR 2");
    }
}
