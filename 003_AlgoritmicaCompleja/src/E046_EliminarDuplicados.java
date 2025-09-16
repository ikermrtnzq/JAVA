import java.util.*;
public class E046_EliminarDuplicados {
    public static void main(String[] args) {
        int[] numerosConDuplicados = {17, 10, 8, 4, 10, 8, 5, 5, 10, 2 };

        int longitudSinDuplicados = 0;

        for (int i = 0; i < numerosConDuplicados.length; i++) {
            boolean esDuplicado = false;
            for (int j = i + 1; j < numerosConDuplicados.length; j++) {
                if (numerosConDuplicados[i] == numerosConDuplicados[j]) {
                    esDuplicado = true;
                }
            }
            if (!esDuplicado) {
                longitudSinDuplicados++;
            }
        }
        System.out.println("La longitud del array seria: "+longitudSinDuplicados);

        int[] numerosSinDuplicados = new int[longitudSinDuplicados];

        int indicador = 0;
        for (int i = 0; i < numerosConDuplicados.length; i++) {
            boolean esDuplicado = false;
            for (int j = 0; j < indicador; j++) {
                if (numerosConDuplicados[i] == numerosSinDuplicados[j]) {
                    esDuplicado = true;
                    break;
                }
            }
            if (!esDuplicado) {
                numerosSinDuplicados[indicador] = numerosConDuplicados[i];
                indicador++;
            }
        }
        System.out.println(Arrays.toString(numerosSinDuplicados));
    }
}