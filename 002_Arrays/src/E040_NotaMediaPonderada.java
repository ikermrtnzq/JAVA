public class E040_NotaMediaPonderada {
    public static void main(String[] args) {
        double[] calificaciones = {5.7, 9.5, 4.9, 0.0, 7.75};
        double[] pesos = {0.15, 0.20, 0.25, 0.30, 0.10};

        double nota = 0;
        double peso= 0;
        int posicion = 0;
        String aprobado ="aprobado";

        for (double notaActual : calificaciones){
            nota =  nota + (notaActual * pesos[posicion]);
            peso = peso + pesos[posicion];
            posicion++;
            if ( notaActual < 4  ) {
                aprobado = "suspenso";
            }
        }

        if (aprobado == "aprobado" && nota < 5){
            aprobado = "suspenso";
        }

        System.out.printf("La nota del alumno es: %.2f, está %s ", nota,aprobado);
    }
}