package E907_SumaTotalRecursiva;

public class principal {
    public static void main(String[] args) {
        int num = 5;
        int resultado = sumaTotalRecursiva(num);
        System.out.printf("\nSuma total recursiva del numero %d: %d\n", num, resultado);
    }
    public static int  sumaTotalRecursiva(int n) {
        int resultado = 0;
        if (n != 0)resultado= n + sumaTotalRecursiva(n - 1);
        return resultado;
    }
}
