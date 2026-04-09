package E919_TablerosAjedrez;
import java.util.*;

public class Principal {
    public static void main(String[] args) {
        StringBuilder tablero = new StringBuilder();
        Scanner teclado = new Scanner(System.in);

        int escaque;
        char tipo;
        boolean blancoNegro;

        do {
            escaque = teclado.nextInt();
            tipo = teclado.next().charAt(0);
            tablero.append("");
            int operacion = escaque * 8;
            if (escaque == 0) break;
            for (int i = 0; i < 8; i++) {
                if (i == 0) {
                    for (int j = 0; j < operacion; j++) {
                        if (j == 0) tablero.append("|");
                        tablero.append("-");
                        if (j == operacion - 1) tablero.append("|");
                    }
                    tablero.append("\n");
                }

                if (i % 2 != 0) {
                    blancoNegro = true;
                } else {
                    blancoNegro = false;
                }

                for (int j = 0; j < escaque; j++) {
                    for (int a = 0; a < operacion - (operacion / 2); a++) {
                        if (a == 0) tablero.append("|");

                        if (blancoNegro) {
                            for (int k = 0; k < escaque; k++) {
                                tablero.append(" ");
                            }

                        } else {
                            for (int k = 0; k < escaque; k++) {
                                tablero.append(tipo);
                            }
                        }
                        if (blancoNegro) blancoNegro = false;
                        else blancoNegro = true;

                        if (a == operacion - (operacion / 2) - 1) tablero.append("|");
                    }
                    tablero.append("\n");
                }

                if (i == 7) {
                    for (int j = 0; j < operacion; j++) {
                        if (j == 0) tablero.append("|");
                        tablero.append("-");
                        if (j == operacion - 1) tablero.append("|");
                    }
                }
            }
            System.out.println(tablero);
            System.out.println();
            tablero.setLength(0);
        } while (escaque != 0);
    }
}
