package E922_Acueducto;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numEscalones;

        do {
            numEscalones = teclado.nextInt();

            if (numEscalones == 0) break;

            int mayor = Integer.MIN_VALUE;
            int posicionMayor = 0;
            int[] escalones = new int[numEscalones];

            for (int i = 0; i < numEscalones; i++) {
                escalones[i] = teclado.nextInt();
                if (escalones[i] > mayor) {
                    mayor = escalones[i];
                    posicionMayor = i;
                }
            }

            for (int i = 0; i < escalones.length; i++) {
                int posicionActual = escalones[i];
                int valorAjustado;

                if (i < posicionMayor) {
                    valorAjustado = mayor + (posicionMayor - i);
                } else if (i > posicionMayor) {
                    valorAjustado = mayor - (i - posicionMayor);
                } else {
                    valorAjustado = mayor;
                }

                int resultado = Math.abs(posicionActual - valorAjustado);
                System.out.print(resultado + " ");
            }
            System.out.println();
        } while (true);
    }
}

