package E083BingoSoloBombo;
import java.util.*;

public class Bombo {
    private int[] bombo;
    private int[] bomboBolasYaUsadas;
    Random rand  = new Random();

    public Bombo(int cantidad) {
        bombo = new int[cantidad+1];
        bomboBolasYaUsadas = new int[cantidad+1];
        for (int i = 0; i < bombo.length; i++) {
            bombo[i] = i;
        }
    }
    public String toString() {

        System.out.printf("\n[ ");
        for (int i = 0; i < bombo.length; i++) {
            if(bomboBolasYaUsadas[i] == 0) System.out.printf("%d, ", bombo[i]);
        }
        System.out.println(" ]");

        return null;
    }

    public int dameBola() {
        int random = 0;
        do {
            random = rand.nextInt(bomboBolasYaUsadas.length);
        }while (yaUsada(random));

        bomboBolasYaUsadas[random] = bombo[random];
        return random;
    }

    private boolean yaUsada(int random) {
        boolean yaUsada = false;

        if (bomboBolasYaUsadas[random] == random) yaUsada = true;

        return yaUsada;
    }

    public boolean hanSalidoTodas() {
        boolean hanSalidoTodas = true;
        for (int i = 0; i < bomboBolasYaUsadas.length; i++) {
           if (bomboBolasYaUsadas[i] != bombo[i]) hanSalidoTodas = false;
        }
        return hanSalidoTodas;
    }

    public void cualesHanSalido() {

        System.out.printf("\n[ ");
        for (int i = 0; i < bomboBolasYaUsadas.length; i++) {
            if(bomboBolasYaUsadas[i] != 0) System.out.printf("%d, ", bomboBolasYaUsadas[i]);
        }
        System.out.println(" ]");
    }
}
