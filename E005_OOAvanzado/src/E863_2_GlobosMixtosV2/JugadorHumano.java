package E863_2_GlobosMixtosV2;

import java.util.Scanner;

public class JugadorHumano extends Jugador{
    Scanner teclado = new Scanner(System.in);

    public JugadorHumano(String nombre) {
        super(nombre);
    }

    public int determinarSoplo() {
        System.out.printf("\n%s, puedes soplar entre (1 y %d), ¿Cuanto aire deseas soplar?: ", nombre, limiteSoplidoPorCansancio);
        int soplo = teclado.nextInt();

        while (soplo < 1 || soplo > limiteSoplidoPorCansancio) {
            System.out.printf("[-] Debes soplar entre 1 y %d [-]", limiteSoplidoPorCansancio);
            soplo = teclado.nextInt();
        }

        perderAliento();

        return soplo;
    }
}