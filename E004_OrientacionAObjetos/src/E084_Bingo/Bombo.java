package E084_Bingo;

import java.util.Random;

/**
 * Clase Bombo del bingo donde se hacen las operaciones con las bolas del bingo
 * @author iker
 * @version 1.5
 * @since 1.0
 */
public class Bombo {
    private int[] bombo;
    private int[] bomboBolasYaUsadas;
    Random rand  = new Random();

    /**
     * Metodo para especificar la cantidad de bolas que tiene el bombo
     * @param cantidad es el numero de bolas que contendra el bombo
     */
    public Bombo(int cantidad) {
        bombo = new int[cantidad+1];
        bomboBolasYaUsadas = new int[cantidad+1];
        for (int i = 0; i < bombo.length; i++) {
            bombo[i] = i;
        }
    }

    /**
     * Metodo para mostrar por pantalla las bolas que ya han salido del bombo
     * @return devuelve un nulo
     */
    public String toString() {

        System.out.printf("\n[ ");
        for (int i = 0; i < bombo.length; i++) {
            if(bomboBolasYaUsadas[i] == 0) System.out.printf("%d, ", bombo[i]);
        }
        System.out.println(" ]");

        return null;
    }

    /**
     * Este metodo calcula un numero random que no haya salido ya para bingo
     * @return el numero entero que sale del bombo para cantar/marcar en el carton
     */
    public int dameBola() {
        int random = 0;
        do {
            random = rand.nextInt(bomboBolasYaUsadas.length);
        }while (yaUsada(random));

        bomboBolasYaUsadas[random] = bombo[random];
        return random;
    }

    /**
     * Este metodo coge la bola sacada en el metodo damebola y comprueba que no haya salido ya
     * @param random es el numero generado en el metodo damebola
     * @return un booleano que dice si ya se ha usado o no el numero dado
     */
    private boolean yaUsada(int random) {
        boolean yaUsada = false;

        if (bomboBolasYaUsadas[random] == random) yaUsada = true;

        return yaUsada;
    }

    /**
     * Este metodo muestra por pantalla las bolas que ya han salido del bombo
     */
    public void cualesHanSalido() {

        System.out.printf("\n[ ");
        for (int i = 0; i < bomboBolasYaUsadas.length; i++) {
            if(bomboBolasYaUsadas[i] != 0) System.out.printf("%d, ", bomboBolasYaUsadas[i]);
        }
        System.out.println(" ]");
    }

    /**
     * Metodo que devuelve las bolas ya sacadas del bombo
     * @return un array de numeros enteros
     */
    public int[] getnumsYaUsados() {
        return  bomboBolasYaUsadas;
    }

}
