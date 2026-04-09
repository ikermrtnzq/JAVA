package E926_EscudosRomanos;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        String texto = """
                35
                20
                10
                0
                """;

        Scanner entrada = new Scanner(texto);
        int numeroLegionarios;
        int numEscudos = 0;
        int provisional;

        ArrayList <Integer> agrupaciones =  new ArrayList<>();

        while (entrada.hasNext()) {
            numeroLegionarios = entrada.nextInt();

            if (numeroLegionarios == 0 ) break;

            while (true){
                provisional = (int) Math.floor(Math.sqrt(numeroLegionarios));
                agrupaciones.add(provisional);

                numeroLegionarios = numeroLegionarios - provisional*provisional;

                if (provisional == 1)numEscudos = numEscudos + 5;
                else if (provisional == 2)numEscudos = numEscudos + 12;
                else numEscudos = numEscudos + ((12) + ((4* (provisional - 2)*2) + ((provisional-2) * (provisional - 2))));

                provisional = 0;
                if (numeroLegionarios == 0) break;
            }
            System.out.println(numEscudos);
            numEscudos = 0;

        }
    }
}
