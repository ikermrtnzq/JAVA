package E906_FactorialRecursivo;
public class principal {
    public static void main(String[] args) {
        int num = 20;
        System.out.printf("Factorial de %d\n", num);
        factorialRecursivo(num);
    }
    public static void factorialRecursivo(int n) {
        if (n != 0 ){
            if (n == 1) System.out.printf("%d ",n);
            else System.out.printf("%d x  ",n);
            factorialRecursivo(n-1);
        }
    }
}
