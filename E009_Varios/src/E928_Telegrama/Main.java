package E928_Telegrama;

import java.util.*;

public class Main {

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

        Scanner sc = new Scanner(System.in);
        int numCasos = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < numCasos; i++) {
            String linea = sc.nextLine();
            String[] palabras = linea.split(" ");
            int tiempo = 0;

            for (int j = 0; j < palabras.length; j++) {
                String palabra = palabras[j];

                for (int k = 0; k < palabra.length(); k++) {
                    String letra = palabra.substring(k, k + 1).toUpperCase();
                    String morseCorrespondiente = "";

                    for (int l = 0; l < letras.length; l++) {
                        if (letras[l].equals(letra)) {
                            morseCorrespondiente = codigoMorse[l];
                            break;
                        }
                    }

                    for (int m = 0; m < morseCorrespondiente.length(); m++) {
                        char simbolo = morseCorrespondiente.charAt(m);
                        tiempo += (simbolo == '.') ? 1 : 3;

                        if (m < morseCorrespondiente.length() - 1) tiempo += 1;
                    }

                    if (k < palabra.length() - 1) tiempo += 3;

                }

                if (j < palabras.length - 1) tiempo += 5;

            }

            System.out.println(tiempo);
        }
    }
}

        

