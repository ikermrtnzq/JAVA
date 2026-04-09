package E927_NumerosRomanos;
import java.util.*;

public class Principal {
    public static String[] romanos = {"M", "D", "C", "L", "X", "V", "I"};
    public static int[] valores = {1000, 500, 100, 50, 10, 5, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decision;
        int numero;
        String continuar;

        System.out.println("¡¡Bienvenido!!");
        while(true) {

            while (true){
                System.out.printf("\n¿A que quieres convertir?\n1)A Romano\n2)A Decimal\n");
                System.out.printf("Indique aquí su decisión: ");
                decision = sc.nextInt();

                if (decision == 1)break;
                if (decision == 2)break;
            }

            if(decision == 1) {
                System.out.printf("Ha decido convertir a romano\n");

                for (int i = 0; i <= 2000; i++) System.out.printf("\n%d : %s",i,convertirARomano(i));
            }
            else if(decision == 2) {
                System.out.printf("Ha decido convertir a decimal\n");
            }

            System.out.printf("\n¿QUIERE CONTINUAR? (S/N)");
            continuar = sc.next().toLowerCase();
            System.out.printf("\n\n\n\n\n\n");

            if(continuar.equals("n")) break;
        }

    }
    public static String convertirARomano(int entero){
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < valores.length; i++) {
            while (entero >= valores[i]){
                resultado.append(romanos[i]);
                entero = entero - valores[i];
            }
        }
        return resultado.toString();
    }
    //public static int convertirADecimal(String romano){}
}

