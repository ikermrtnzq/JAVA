public class E052_FbonacciSinArray {
    public static void main(String[] args) {

        final int N = 30;
        int primeraPosicionFibonacci = 0;
        int segundaPosicionFibonacci = 1;
        int posicionActual;

        System.out.format("%d %d",primeraPosicionFibonacci, segundaPosicionFibonacci);

        for (int i = 2; i <= N; i++) {
            posicionActual = primeraPosicionFibonacci + segundaPosicionFibonacci;
            System.out.format(" %d ",posicionActual);

            primeraPosicionFibonacci = segundaPosicionFibonacci;
            segundaPosicionFibonacci = posicionActual;
        }
    }
}