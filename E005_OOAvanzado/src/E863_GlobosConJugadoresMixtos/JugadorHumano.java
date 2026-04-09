package E863_GlobosConJugadoresMixtos;
import java.util.*;

public class JugadorHumano extends Jugador {

    public JugadorHumano(){}

    @Override
    public int determinarSoplo(int[] ultimaCantidadSoplada, int i) {
        Scanner sc = new Scanner(System.in);

        int num = 0; ;

        if (ultimaCantidadSoplada[i] < 3 ){
            do {
                System.out.printf("\nIntroduzca un numero menor a 10 por favor: ");
                num = sc.nextInt();
            }while (num > 10);

        } else if (ultimaCantidadSoplada[i] > 3 && ultimaCantidadSoplada[i] < 7) {
            do {
                System.out.printf("\nIntroduzca un numero entre 1 y 4 por favor: ");
                num = sc.nextInt();
            }while (num > 4);

        } else if (ultimaCantidadSoplada[i] > 7 && ultimaCantidadSoplada[i] <= 10 ){
            num = 1;
        }
        return num;
    }
}
