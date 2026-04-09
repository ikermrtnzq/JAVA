package E914_DobleCara;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        while (true) {

            int numero = teclado.nextInt();
            if (numero == 0) break;

            int numHojasAhorradas = 0;

            for (int i = 0; i < numero; i++) {
                int paginas = teclado.nextInt();

                int numHojasUsadas = (paginas + 1) / 2;
                numHojasAhorradas += paginas - numHojasUsadas * 2 + numHojasUsadas;
            }

            System.out.println(numHojasAhorradas);
        }

        teclado.close();
    }
}
