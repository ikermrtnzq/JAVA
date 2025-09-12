import java.util.Scanner;
public class E008_PotenciasDe2HastaN {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("¡Introduce hasta que numero quieres hacer las potencias de 2!");
        int exponente = teclado.nextInt();
        int potencia = 0;

        for (int i = 1; i <= exponente; i++) {
            if (potencia == 0) {
                potencia = 1;
                System.out.println(2 + "^"+ 0 + "=" + potencia);
            }
            potencia = potencia * 2;
            System.out.println(2 + "^"+ i + "=" + potencia);
        }
    }
}