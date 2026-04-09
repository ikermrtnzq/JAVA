package E925_Ciclismo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String entrada = """
                3
                10 5 0
                5 2 3 7 0
                12 5 15 1 6 0
                """;

        Scanner in = new Scanner(entrada);
        int numCasos = in.nextInt();


        for (int i = 0; i < numCasos ; i++) {
            int totalKm = 0;
            int distanciaTotal = 0;
            while (true){
                int numero = in.nextInt();
                if (numero == 0) break;
                totalKm += (distanciaTotal+numero) *2;
                distanciaTotal += numero;
            }
            System.out.println(totalKm);
        }
    }
}
