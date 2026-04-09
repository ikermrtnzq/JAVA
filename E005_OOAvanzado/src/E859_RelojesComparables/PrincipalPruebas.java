package E859_RelojesComparables;

import java.util.ArrayList;
import java.util.Arrays;

public class PrincipalPruebas {
    public static void main(String[] args) {
        int[] numeros = new int[] {7, 4, 2, 3, 1};
        Reloj[] relojes = new Reloj[] {new Reloj(17, 40), new Reloj(9, 20), new Reloj(7, 00)};

        ArrayList<Reloj> relojesOtraOpcion = new ArrayList<>();
        relojesOtraOpcion.add(new Reloj(17, 40));
        relojesOtraOpcion.add(new Reloj(9, 20));
        relojesOtraOpcion.add(new Reloj(7, 00));

        String[] palabras = new String[] {"Bazofia", "Zumbido", "Llorica", "Mosca", "Abecedario"};

        Arrays.sort(numeros);
        Arrays.sort(relojes);
        Arrays.sort(palabras);



        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println();
        for (int i = 0; i < relojes.length; i++) {
            System.out.println(relojes[i]);
        }
        System.out.println();
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}
