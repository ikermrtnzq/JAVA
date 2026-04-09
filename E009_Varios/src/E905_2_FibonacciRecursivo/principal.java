package E905_2_FibonacciRecursivo;

public class principal {
    public static void main(String[] args) {
        int serie = 9;
        int posicion = 20;
        System.out.printf("\nPosición: %d \nSucesión de Fibonacci %d \nResultado: %d\n",posicion,serie,fibonacciRecursivoN(serie, posicion));
    }

    public static int fibonacciRecursivoN(int serie, int posicion) {
        if (posicion < serie) return 0;
        if (posicion == serie) return 1;

        int suma = 0;
        for (int i = 1; i <= serie; i++) suma += fibonacciRecursivoN(serie, posicion - i);
        return suma;
    }
}
