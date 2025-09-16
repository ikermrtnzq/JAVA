import java.util.*;
public class E045_DiferenciaMomentoDia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la primera hora: ");
        int hora1 = sc.nextInt();

        if (hora1 > 24 || hora1 < 0){
            System.out.println("Hora no valida");
            do {
                System.out.print("Introduzca la primera hora: ");
                hora1 = sc.nextInt();
            }while(hora1 > 24 || hora1 < 0);
        }

        System.out.print("Introduzca la segunda hora: " );
        int hora2 = sc.nextInt();

        if (hora2 > 24 || hora2 < 0){
            System.out.println("Hora no valida");
            do {
                System.out.print("Introduzca la segunda hora: ");
                hora2 = sc.nextInt();
            }while(hora2 > 24 || hora2 < 0);
        }

        System.out.print("Introduzca los primeros minutos: ");
        int minutos1 = sc.nextInt();

        if (minutos1 > 60 || minutos1 < 0){
            System.out.println("minutos no validos");
            do {
                System.out.print("Introduzca la primer hora: ");
                minutos1 = sc.nextInt();
            }while(minutos1 > 60 || minutos1 < 0);
        }

        System.out.println("Introduzca los segundos minutos");
        int minutos2 = sc.nextInt();

        if (minutos2 > 60 || minutos2 < 0){
            System.out.println("minutos no validos");
            do {
                System.out.print("Introduzca la primer hora: ");
                minutos2 = sc.nextInt();
            }while(minutos2 > 60 || minutos2 < 0);
        }

        int hora = 00;
        int minutos = 00;

        if ( hora2 < hora1) hora = hora1 - hora2;
        else if ( hora1 < hora2) hora = hora2 - hora1;
        else if ( hora1 == hora2) hora = 0;

        if ( minutos2 < minutos1) minutos = minutos1 - minutos2;
        else if ( minutos1 < minutos2) minutos = minutos2 - minutos1;
        else if ( minutos1 == minutos2) minutos = 0;

        System.out.printf("La diferencia es de %02d:%02d.", hora, minutos);
    }
}