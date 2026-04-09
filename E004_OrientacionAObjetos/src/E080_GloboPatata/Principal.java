package E080_GloboPatata;
import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Globo[] globo = {new Globo(), new Globo(), new Globo(), new Globo(), new Globo()};
        int cantidadInflar = 0;
        int ronda = 0;
        String jugador1 = "Iker";
        String jugador2 = "Ibrahim";

        do {
            System.out.printf("\nRonda %d", ronda);
            if (globo[ronda].getJugador() == 1) System.out.printf("\nTurno de %s", jugador1);
            else System.out.printf("\nTurno de %s\n", jugador2);

            System.out.printf("\nIntroduzca la cantidad a inflar: ");
            cantidadInflar = sc.nextInt();

            globo[ronda].inflar(cantidadInflar);

            if (globo[ronda].explotado()) {
                System.out.printf("\n%s HA EXPLOTADO EL GLOBO\n",(globo[ronda].getJugador() == 1)? jugador1 : jugador2 );
                if (globo[ronda].getJugador() == 1) globo[ronda].aumentarWinJugador2();
                else globo[ronda].aumentarWinJugador1();
                System.out.printf("\n%s : %d\n%s : %d\n\n",jugador1,globo[ronda].getWinsJugador1(), jugador2, globo[ronda].getWinsJugador2());
            }
            globo[ronda].cambiarJugador();
            ronda = globo[ronda].aumentarRonda(ronda);
        }while (!(globo[ronda].hayGanador()));

         int victorias = globo[0].getWinsJugador1()+globo[0].getWinsJugador2();
         for (int i = 0; i < victorias; i++) System.out.println(globo[i].mostrarGloboLleno());
         for (int i = 0; i < (5-victorias); i++) System.out.println(globo[i].mostrarGloboVacio());

         System.out.printf("\nHa ganado %s", (globo[ronda].quienHaGanado() == 1)? jugador1 : jugador2);
    }
}
