package E903_Albufera;
import java.util.*;
public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad = 0;

        do {
            int numeroAnillos = 0;
            cantidad = sc.nextInt();
            for (int i = 0; i < cantidad; i++) {
                int patos = sc.nextInt();
                int anillos = sc.nextInt();

                numeroAnillos += patos - anillos;
            }
            if (cantidad != 0)System.out.println(numeroAnillos);
        }while (cantidad != 0);

    }
}
