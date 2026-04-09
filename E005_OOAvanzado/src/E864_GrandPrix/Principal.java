package E864_GrandPrix;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Movil> participantes = new ArrayList<>();
        participantes.add(new Peaton("Peaton"));
        participantes.add(new Bici("Bici"));
        participantes.add(new Moto("Moto"));
        participantes.add(new Coche("Coche"));

        int num = 1500;
        boolean hayGanador = false;
        String ganador = "";
        while (!(hayGanador)){

            for (Movil participante : participantes) {
                participante.tick();
                System.out.printf("\nDistancia %s: %d", participante.getNombre(), participante.getDistancia());
                if (participante.getDistancia() >= num) {
                    hayGanador = true;
                    ganador = participante.getNombre();
                    break;
                };
            }
            System.out.println();
            num = num+1;
        }
        System.out.printf("\nHa ganado : %s", ganador);


    }
}
