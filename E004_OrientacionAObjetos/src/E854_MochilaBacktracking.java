import java.util.Arrays;

public class E854_MochilaBacktracking {
    private static int[] valores = {30, 20, 40, 50};
    private static int[] pesos = {2, 1, 5 ,3};
    private static int mochilaCapacidad = 2;
    private static boolean[] mochilaContenidoActual = new boolean[valores.length];
    private static boolean[] mochilaContenidoOptimo = new boolean[valores.length];
    private static int mochilaValorOptimo = 0;

    private static int calcularValorMochila() {
        //Debe sumar los valores de los items incluidos en la mochila y decir cuánto valor contiene. No es necesario que compruebe si la mochila es legal o no.
        int valor = 0;

        for (int i = 0; i < valores.length; i++) {
            if(mochilaContenidoActual[i]){
                valor += valores[i];
            }
        }
        return valor;
    }

    private static boolean mochilaEsLegal() {
        //Debe sumar los pesos de los items incluidos en la mochila y decir si la mochila es legal o no.
        int peso = 0;
        for (int i = 0; i < pesos.length; i++) {
            if(mochilaContenidoActual[i]){
                peso = peso + pesos[i];
            }
        }
        return peso <= mochilaCapacidad;
    }

    private static void buscarSolucionOptimaMochila(int pos) {
        // Si la mochila ya no es legal,return.

        // Si pos está justo fuera del rango de los arrays, es decir, ==length:
        //   Si la mochila es legal y el valor que tiene es mayor que el mejor que haya visto hasta ahora, actualizo.
        //     Actualizar consiste en copiar todos los boolean al otro array, y actualizar el valorMochilaMejor.

        // En otro caso, es decir, si pos está dentro del rango de los arrays, entre 0 y length -1:
        //   Pongo 0 para el elemento actual y llamo con pos+1.
        //   Pongo 1 para el elemento actual y llamo con pos+1.

        if (!mochilaEsLegal())return;

        if (pos == valores.length) {
            int valorActual = calcularValorMochila();
            if (valorActual > mochilaValorOptimo){
                mochilaValorOptimo = valorActual;
                System.arraycopy(mochilaContenidoActual, 0, mochilaContenidoOptimo, 0, valores.length);
            }
            return;
        }
        mochilaContenidoActual[pos] = false;
        buscarSolucionOptimaMochila(pos + 1);

        mochilaContenidoActual[pos] = true;
        buscarSolucionOptimaMochila(pos + 1);

    }

    public static void main(String[] args) {
        buscarSolucionOptimaMochila(0);

        System.out.println("Valor Optimo: " + mochilaValorOptimo);
        System.out.println("Elementos en la mochila óptima: ");
        for (int i = 0; i < mochilaContenidoOptimo.length; i++) {
            if (mochilaContenidoOptimo[i]){
                System.out.print("item "+ i + " ");
            }
        }
        //System.out.println(Arrays.toString(mochilaContenidoOptimo));
    }
}