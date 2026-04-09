package E905_FibonacciRecursivo;
public class principal {
    public static void main(String[] args) {
        int n = 30;
        System.out.println("El numero " + n + " de la sucesión de Fibonacci es: " + fibonacciRecursivoPosicion(n));
    }

    public static int fibonacciRecursivoPosicion(int n) {
        if (n == 1) return 0;
        else if (n == 2) return 1;
        else return fibonacciRecursivoPosicion(n - 1) + fibonacciRecursivoPosicion(n - 2);
    }
}

