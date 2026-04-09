package E083BingoSoloBombo;
import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Bombo bombo = new Bombo(20);
        String continuar ="";
        Scanner sc = new Scanner(System.in);

       do {
           System.out.printf("\n",bombo.toString());
           System.out.printf("Ha salido el : %d\n", bombo.dameBola());
           bombo.cualesHanSalido();

           System.out.printf("\nPulse para continuar: ");
           continuar = sc.nextLine();

       }while (!bombo.hanSalidoTodas());

        System.out.printf("\nYA HAN SALIDO TODAS LAS BOLAS\n");
        bombo.cualesHanSalido();
    }
}
