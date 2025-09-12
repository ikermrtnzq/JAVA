import java.util.*;
public class E046_SwitchYEnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Introduzca un numero del 1 al 7: ");
        int numeroDia = sc.nextInt();
        String diaSemana ="";
        if (numeroDia > 7) {
            do {
                System.out.format("Numero %d no valido\n", numeroDia);
                System.out.printf("Introduzca un numero del 1 al 7: ");
                numeroDia = sc.nextInt();
            } while (numeroDia > 7);
        }

        switch (numeroDia) {
            case 1 -> diaSemana = "lunes";
            case 2 -> diaSemana = "martes";
            case 3 -> diaSemana = "miercoles";
            case 4 -> diaSemana = "jueves";
            case 5 -> diaSemana = "viernes";
            case 6 -> diaSemana = "sabado";
            case 7 -> diaSemana = "domingo";
        }
        System.out.format("El numero corresponde al: %s\n",diaSemana);


        enum meses{Enero, Febrero,Marzo, Abril, Mayo, Junio, Julio, Agosto, Septiembre, Octubre, Noviembre, Diciembre}

        meses mesActual = meses.Octubre;
        String estacion = "";

        switch (mesActual){
            case Diciembre, Enero, Febrero -> estacion = "Invierno";
            case Marzo,Abril,Mayo -> estacion = "Primavera";
            case Junio,Julio,Agosto -> estacion = "Verano";
            case Septiembre,Octubre,Noviembre -> estacion = "Otoño";
        }
        System.out.format("Estamos en : %s\n",estacion);

        System.out.print("Introduzca una nota numerica: ");
        int nota = sc.nextInt();
        String calificacion = "";

        switch (nota){
            case 9,10 -> calificacion = "Sobresaliente";
            case 8,7 -> calificacion = "Notable";
            case 6,5 -> calificacion = "Aprobado";
            case 4,3,2,1,0 -> calificacion = "Suspenso";
        }
        System.out.format("Su calificación es : %s\n",calificacion);

        enum Direcciones { NORTE, SUR, ESTE, OESTE}
        Direcciones direccionActual = Direcciones.ESTE;
        String indicaciones = "";

        switch (direccionActual){
            case NORTE -> indicaciones = "Avanzar hacia el norte";
            case SUR -> indicaciones = "Retroceder hacia el sur";
            case ESTE -> indicaciones = "Desplazarse hacia la derecha";
            case OESTE -> indicaciones = "Desplazarse hacia la izquierda";
        }
        System.out.format("Las indicaciones son : %s\n",indicaciones);

    }
}