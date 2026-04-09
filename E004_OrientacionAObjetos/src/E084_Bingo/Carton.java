package E084_Bingo;
import java.util.*;

/**
 * Clase en la que utilizamos las bolas del bombo para hacer comprobaciones en el carton de bingo
 * @author iker
 * @version 1.5
 * @since 1.0
 */
public class Carton {
    private int[][] carton;
    private int[] numsYaUsados;
    private int[] arrayRandoms;
    private boolean[][] cartonBoolean;
    private boolean[] lineasCompletas;
    private Bombo bombo2;
    private final String rojo = "\u001B[31m";
    private final String azul = "\u001B[34m";
    private final String reset = "\u001B[0m";
    Random rand = new Random();

    /**
     * Clase enla que creamos el carton del usuario
     * @param cantidadNums cantidad de numeros que tiene el carton
     * @param filas cantidad de filas que tendra el carton
     * @param columnas cantidad de columnas que tendrá el carton
     * @param bombo recogemos el bombo para poder usar sus metodos
     * @param cantidadBolas cantidad de numeros que tiene el carton
     */
    public Carton(int cantidadNums, int filas, int columnas, Bombo bombo, int cantidadBolas) {
        bombo2 = bombo;
        this.carton = new int[filas][columnas];
        this.cartonBoolean = new boolean[filas][columnas];
        this.lineasCompletas = new boolean[filas];
        this.numsYaUsados = new int[cantidadBolas+1];
    }

    /**
     * Esta clase sirve para rellenar el carton con numeros aleatorios no repetidos
     * @param cantidadBolas para indicar la cantidad de numeros aleatorios que tiene que generar el metodo
     */
    public void rellenarCarton(int cantidadBolas) {
       //crearRandoms(carton.length);

        for (int i = 0; i < this.carton.length; i++) {
            for (int j = 0; j < this.carton[i].length; j++) {
                do {
                    this.carton[i][j] = rand.nextInt(cantidadBolas+1);
                }while (numeroYaUsado(this.carton[i][j]));
            }
        }
        ordenar();
    }

    /**
     * Metodo llamado en rellenarCarton para ordenar los numeros aleatorios generados de menor a mayor
     */
    private void ordenar() {
        int filas = this.carton.length;
        int columnas= this.carton[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                for (int k = 0; k < filas; k++) {
                    for (int l = 0; l < columnas; l++) {
                        if (this.carton[i][j] < this.carton[k][l]) {
                            int temp = this.carton[i][j];
                            this.carton[i][j] = this.carton[k][l];
                            this.carton[k][l] = temp;
                        }
                    }
                }
            }
        }
    }

    /**
     *Metodo para mostrar el carton por pantalla
     */
    public void mostrarCarton( ) {
        System.out.println();
        for (int i = 0; i < this.carton.length ; i++) {
            System.out.println();
            for (int j = 0; j < this.carton[0].length; j++) {
                System.out.printf("-");
                if (this.carton[i][j] !=0 && yaUsados(bombo2.getnumsYaUsados(), this.carton[i][j]) ) System.out.printf("%s|%s X %s|", azul,rojo,azul);
                else if (this.carton[i][j] != 0) System.out.printf("%s| %s%02d %s|%s",azul,reset, this.carton[i][j],azul,reset );
            }
            System.out.printf("%s-%s", azul,reset);
            System.out.println();
        }
    }

    /**
     * Metodo para comprobar que numeros ya han salido del bombo y marcarlos en el carton
     * @param numsYaUsados numeros ya sacados del bombo
     * @param numero el numero del carton que estamos comprobando
     * @return booleano si ya ha salido ese numero o no ha salido
     */
    private boolean yaUsados(int[] numsYaUsados, int numero) {
        boolean yaUsado = false;
        for (int i = 0; i < numsYaUsados.length; i++) {
            if (numsYaUsados[i] == numero) yaUsado = true;
        }
        return yaUsado;
    }

    /**
     * Para saber si se ha usado el numero o no y si poner en el carton o no al rellenarlo
     * @param numero que queremos saber si se ha usado o no
     * @return si se ha usado ya el numero en el carton  no
     */
    private boolean numeroYaUsado(int numero){
        boolean yaUsado = false;
        for (int i = 0; i < this.numsYaUsados.length; i++) {
            if (this.numsYaUsados[i] == numero) yaUsado = true;
        }
        if (!yaUsado) numsYaUsados[numero] = numero;
        return yaUsado;
    }

    /**
     * Metodo que se usaba para crear numeros randoms
     * @deprecated Metodo que usaba antes para generar numeros randoms para las filas, pero lo acabe sustituyendo
     * @param filas numero de filas que tenia el carton
     */
    private void crearRandoms(int filas) {
        this.arrayRandoms = new int[filas];

        for (int i = 0; i < this.arrayRandoms.length; i++) {
        this.arrayRandoms[i] = rand.nextInt(3+1);
        }
    }

    /**
     * Metodo para marcar las casillas correspondientes a las bolas que ya han salido
     */
    public void marcarYaSalidas() {
       int[]  numsYaUsados =  bombo2.getnumsYaUsados();

       for (int i = 0; i < this.carton.length; i++) {
           for (int j = 0; j < this.carton[i].length; j++) {
               for (int k = 0; k <numsYaUsados.length; k++) {
                   if (this.carton[i][j] == numsYaUsados[k]) this.cartonBoolean[i][j] = true;
               }
           }
       }

    }

    /**
     * Metodo obsoleto que usaba para mostrar por pantalla que casillas habian sido marcadas y cuales no
     * @deprecated metodo que usaba para comprobaciones, el cual deje de usar cuando me salió bien
     */
    public void mostrarCartonBooleans() {
        System.out.println();
        for (int i = 0; i < this.cartonBoolean.length ; i++) {
            System.out.println();
            for (int j = 0; j < this.cartonBoolean[0].length; j++) {
                System.out.printf("-");
                if (this.cartonBoolean[i][j]) System.out.printf("| TRUE |");
                else System.out.printf("| FALSE |");
            }
            System.out.printf("-");
            System.out.println();
        }
    }

    /**
     * Metodo que se usa para comprobar si el usuario ha ganado o no
     * @param cantidadBolas cantidad de numeros que tiene el carton
     * @return booleano si el usuario ha ganado o no
     */
    public boolean comprobarSiHaGanado(int cantidadBolas) {
        boolean haGanado = true;

        for (int i = 0; i < this.lineasCompletas.length; i++) {
            if (!this.lineasCompletas[i]) haGanado = false;
        }
        return haGanado;
    }

    /**
     * Metodo para comprobar si se ha consegido linea o no
     */
    public void comprobarLinea(){
        int cantidadTrues = 0;

        for (int i = 0; i < this.cartonBoolean.length; i++) {
            for (int j = 0; j < this.cartonBoolean[0].length; j++) {
                if (this.cartonBoolean[i][j]) cantidadTrues = cantidadTrues +1;
                if (cantidadTrues == this.carton[0].length){
                    lineasCompletas[i] = true;
                }
            }
            cantidadTrues = 0;
        }
    }
}
