import java.util.Scanner;
public class E011_Elefantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroElefantes = 20;

        String elfanteCambiante = "elefante";
        String balanceabaCambiante= "balanceaba";
        double porcentaje = 0.75 * numeroElefantes;
        int porcentajeInt = (int) Math.round(porcentaje);

        for (int i = 1; i <= numeroElefantes; i++) {
            if (i >= porcentajeInt) {
                elfanteCambiante = "ELEFANTES";
            }else if (i >= 2) {
                elfanteCambiante = "elefantes";
                balanceabaCambiante = "balanceaban";
            }
            System.out.format(i + " %s se %s en una amaca en la orilla de un río..\n", elfanteCambiante, balanceabaCambiante);
        }
    }
}
