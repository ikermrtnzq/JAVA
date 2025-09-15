import java.util.*;
public class E055_ArrayBidimensionalRellenar {

    private static int marcarPosicion () {
        Random random = new Random();
        return random.nextInt(9);
    }
    private static char pintarMatriz(int posicion){
        char valor = 0;

        switch(posicion){
            case 0: valor = ' '; break;
            case 1,2,3: valor = '·'; break;
            case 4,5,6: valor = 'o'; break;
            case 7,8,9: valor = '@'; break;
        }
        return valor;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int[][] matriz = new int[4][6];
        char[][] matrizDibujada = new char[4][6];
        int fila;
        int columna;
        int contador = 0;

        System.out.println("Buenos días, iniciamos la matríz :)");

        do{
            do {
                System.out.printf("\nIndique la fila (entre 0 y 3 ): ");
                fila = sc.nextInt();
            }while (fila < 0 || fila > 3);

            do {
                System.out.printf("\nIndique la columna (entre 0 y 5): ");
                columna = sc.nextInt();
            }while (columna < 0 || columna > 5);

            matriz[fila][columna] = marcarPosicion();
            contador++;

            int posicion = matriz[fila][columna];
            matrizDibujada[fila][columna] = pintarMatriz(posicion);
        }while (contador <5);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(pintarMatriz(matriz[i][j]) + " ");
            }
            System.out.println();
        }
    }
}