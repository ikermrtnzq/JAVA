package E918_PruebasYoda;
import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = -1;
        int dias = 0;

        do {
            P = sc.nextInt();
            int D;
            int N;
            for (int i = 0; i < P; i++) {


                D= sc.nextInt();
                N = sc.nextInt();
                if (dias < (N + D)) dias = N + D;
            }
            if (P != 0)System.out.println(dias);
        }while (P != 0) ;


    }
}
