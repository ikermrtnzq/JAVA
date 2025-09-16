import java.util.*;
public class E059_TresEnRaya {
    public static char pintarMatriz( int posicion){
        char valor = ' ';

        if (posicion == 1){
            valor = 'o';
        }else if (posicion == 2){
            valor = 'x';
        }

        return valor;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int[][] tablero = new int[3][3];
        int jugadas = 0;
        int jugador = 1;
        int fila ;
        int columna;
        int contadorGanadorJugador1 = 0;
        int contadorGanadorJugador2 = 0;
        int ganador = 0;
        boolean haGanado = false;

        do {
            System.out.printf("Es tu turno jugador %d!\n", jugador);
            System.out.println("Introduzca la fila:  ");
            fila = sc.nextInt();
            System.out.println("Introduzca la columna:  ");
            columna = sc.nextInt();

            if (jugador == 1) {
                tablero[fila][columna] = 1;
                jugador++;
                jugadas++;
            } else if (jugador == 2) {
                tablero[fila][columna] = 2;
                jugador = 1;
                jugadas++;
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.printf("%s ", pintarMatriz(tablero[i][j]));
                }
                System.out.println();
            }

            for (int i = 0; i < 3; i++) {
                contadorGanadorJugador1 = 0;
                contadorGanadorJugador2 = 0;
                for (int j = 0; j < 3; j++) {
                    if (tablero[i][j] == 1) {
                        contadorGanadorJugador1++;
                    } else if (tablero[i][j] == 2) {
                        contadorGanadorJugador2++;
                    }
                }
                contadorGanadorJugador1 = 0;
                contadorGanadorJugador2 = 0;
                for (int j = 0; j < 3; j++) {
                    if (tablero[j][i] == 1) {
                        contadorGanadorJugador1++;
                    } else if (tablero[j][i] == 2) {
                        contadorGanadorJugador2++;
                    }
                }

                if (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2]){
                    if (tablero[0][0] == 0 && tablero[1][1] == 0 && tablero[2][2] == 0)break;
                    if (tablero[1][1] == 1)ganador = 1;
                    else if (tablero[1][1] == 2)ganador = 2;
                }
                if (tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0]){
                    if (tablero[0][2] == 0 && tablero[1][1] == 0 && tablero[2][0] == 0)break;
                    if (tablero[1][1] == 1)ganador = 1;
                    else if (tablero[1][1] == 2)ganador = 2;
                }

                if (contadorGanadorJugador1 == 3)ganador = 1;
                if (contadorGanadorJugador2 == 3)ganador = 2;
            }

            if (ganador == 1){
                System.out.println("¡¡HA GANADO EL JUGADOR 1!! ¡¡ENHORBUENA!!");
                haGanado= true;
            } else if (ganador == 2) {
                System.out.println("¡¡HA GANADO EL JUGADOR 2!! ¡¡ENHORBUENA!!");
                haGanado= true;
            }

            if (haGanado )break;
        }while(jugadas <= 8);
    }
}