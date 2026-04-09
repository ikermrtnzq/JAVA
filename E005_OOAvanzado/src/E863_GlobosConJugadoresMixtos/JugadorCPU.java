package E863_GlobosConJugadoresMixtos;
import java.util.*;

public class JugadorCPU extends Jugador{

    public JugadorCPU(){}

    @Override
    public int determinarSoplo(int[] ultimaCantidadSoplada, int i) {
        Random rand = new Random();
        int num = 0;

        if (ultimaCantidadSoplada[i] < 3 ){
            do {
                num = rand.nextInt(1, 10);
            }while (num > 10);

        } else if (ultimaCantidadSoplada[i] > 3 && ultimaCantidadSoplada[i] < 7) {
            do {
                num = rand.nextInt(1, 3);
            }while (num > 4);

        } else if (ultimaCantidadSoplada[i] > 7 && ultimaCantidadSoplada[i] <= 10 ){
            num = 1;
        }
        return num;
    }
}
