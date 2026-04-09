package E921_CuantosDiasFaltan;
import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diasAnio = 365;
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int cantidad = sc.nextInt();
        for (int i = 0; i <cantidad ; i++) {
            int dia = sc.nextInt();
            int mes = sc.nextInt();

            int respuesta = 0;

            for (int j = 1; j <= mes; j++) {
                for (int k = 0; k < diasPorMes[j-1]; k++) {
                    respuesta = respuesta + 1;
                    if (k+1 == dia && (j) == mes) break;
                }
            }
            respuesta = diasAnio - respuesta;
            System.out.println(respuesta);
            respuesta = 0;
        }
    }
}
