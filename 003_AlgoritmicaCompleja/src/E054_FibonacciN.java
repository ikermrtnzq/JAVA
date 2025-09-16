import java.util.*;
public class E054_FibonacciN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Introduzca un Numero para ver que fibonacci realizar: ");
        int N = sc.nextInt();

        if ( N < 0 ){
             do {
                 System.out.println("El numero no puede ser negativo");
                 System.out.printf("Introduzca un NuMero para ver que fibonacci realizar: ");
                 N = sc.nextInt();
             } while(N < 0);
        }

        System.out.printf("Introduzca hasta donde tiene que llegar el fibonacci: ");
        int HASTA = sc.nextInt();

        if ( HASTA < 0 ){
            do {
                System.out.println("El numero no puede ser negativo");
                System.out.printf("Introduzca un NuMero para ver que fibonacci realizar: ");
                HASTA = sc.nextInt();
            } while(N < 0);
        }

        int[] anteriores = new int[HASTA];

        for (int i = 0; i <= N-1 ; i++) {
            if (i == N-1) anteriores[i] = 1;
            else anteriores[i] = 0;
        }

        for (int i = N; i <= HASTA-1 ; i++) {
            for (int j = 1; j <= i; j++){
                anteriores[i] = anteriores[i] + anteriores[i - j];
                if (j == N) {
                    break;
                }
            }
        }
        for (int i = 0; i < HASTA; i++) {
            System.out.format("%d ",anteriores[i]);
        }
    }
}