import java.util.*;
public class E056_RellenarMatrizBooleans {

    private static String pintarMatriz(boolean posicion){
        String valor = " ";

        if (posicion) valor = "v";
        else valor = "o";

        return valor;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        boolean[][] matriz = new boolean[7][3];
        char[][] matrizDibujada = new char[4][6];
        int fila;
        int columna;
        int contador = 0;

        System.out.println("Buenos días, iniciamos la matríz :)");

        do{
            do {
                System.out.printf("\nIndique la fila (entre 0 y 6 ): ");
                fila = sc.nextInt();
            }while (fila < 0 || fila > 6);

            do {
                System.out.printf("\nIndique la columna (entre 0 y 2): ");
                columna = sc.nextInt();
            }while (columna < 0 || columna > 2);

            if (contador%2 == 0) {
                matriz[fila][columna] = true;
                System.out.println("Se ha pintado la posicion como true");
            }else {
                matriz[fila][columna] = false;
                System.out.println("Se ha pintado la posicion como false");
            }

            contador++;

        }while (contador <5);

        for (int i = 0; i < 7; i++) {
            System.out.printf(" ");
            for (int j = 0; j < 3; j++) {
                System.out.printf(pintarMatriz(matriz[i][j]));
            }
            System.out.println();
        }
    }
}