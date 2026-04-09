package E910_McdEuclides;

/**
 * Esta es la clase MCD Euclides
 * @author iker
 * @version 1.0
 */
public class principal {
    public static void main(String[] args) {
        int residuo = 0;

        System.out.printf("\nEntrada: mcd(24, 18) ");
        System.out.printf("\nSalida: %d\n", mcdEuclidesRecursivo(24, 18, residuo));
    }

    private static int mcdEuclidesRecursivo(int num1, int num2, int residuo) {
        if (num1 > num2) residuo = num1%num2;
        else residuo = num2%num1;

        if (residuo != 0){
            num1 = num2;
            num2 = residuo;
            return mcdEuclidesRecursivo(num1, num2, residuo);
        };
        return num2;
    }
}
