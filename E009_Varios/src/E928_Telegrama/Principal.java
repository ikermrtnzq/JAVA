package E928_Telegrama;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        String[] letras = {
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
                "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
                "U", "V", "W", "X", "Y", "Z", "!", "?"
        };

        String[] codigoMorse = {
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
                "..-", "...-", ".--", "-..-", "-.--", "--..", "-.-.--", "..--.."
        };

        String entrada = """
                4
                ?
                !
                SI
                YA NACIO
                """;
        Scanner sc = new Scanner(entrada);

        int tiempo = 0;
        int posicion = -1;
        String morse = "";
        int repe = sc.nextInt();
        do {
            String linea = sc.nextLine();
            for (int i = 0; i < linea.length(); i++) {
                if (linea.charAt(i) == ' ') {
                    tiempo = tiempo + 5;
                }
                for (int j = 0; j < letras.length; j++) {
                    if (linea.charAt(i) == letras[j].charAt(0)) {
                        posicion = i;
                    }
                }
                morse = codigoMorse[posicion];

                for (int j = 0; j < morse.length(); j++) {
                    switch (morse.charAt(j)) {
                        case '-': tiempo = tiempo +3;
                        break;
                        case '.': tiempo = tiempo +1;

                    }
                    tiempo = tiempo + 1;
                }

            }

        }while (repe < 0);



    }
}

