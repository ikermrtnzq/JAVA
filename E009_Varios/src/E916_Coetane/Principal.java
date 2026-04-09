package E916_Coetane;
import java.util.Scanner;

public class Principal {
    private static int annoInicio(int nacimiento1, int nacimiento2) {
        return Math.max(nacimiento1, nacimiento2);
    }

    private static int annoFinal(int muerte1, int muerte2) {
        return Math.min(muerte1, muerte2);
    }

    private static int annosCoetaneos(int annoInicio, int annoFinal) {
        int diferencia = (annoFinal - annoInicio) + 1;

        if (diferencia < 0) return 0;
        return diferencia;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int casos = teclado.nextInt();

        for (int i = 0; i < casos; i++) {
            int nacimiento1 = teclado.nextInt();
            int muerte1 = teclado.nextInt();

            int nacimiento2 = teclado.nextInt();
            int muerte2 = teclado.nextInt();

            System.out.println(annosCoetaneos(annoInicio(nacimiento1, nacimiento2), annoFinal(muerte1, muerte2)));
        }
    }
}
