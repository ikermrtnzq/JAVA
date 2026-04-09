package E915_VerificacionEntradas;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numCasos = teclado.nextInt();


        for (int i = 0; i < numCasos; i++) {
            String numero = teclado.next();
            int sumaNumPares = 0;
            int sumaNumImpares = 0;

            for (int j = 0; j < numero.length(); j++) {
                int digito = Character.getNumericValue(numero.charAt(j));
                if (j % 2 == 0) {
                    sumaNumPares = sumaNumImpares+ digito;
                } else {
                    sumaNumImpares = sumaNumImpares + digito;
                }
            }

            int codigoVerificacion = Math.abs(sumaNumPares - sumaNumImpares);

            System.out.println(codigoVerificacion);
        }
        teclado.close();
    }
}
