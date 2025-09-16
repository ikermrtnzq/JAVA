public class E054_EscannosDHont {
    public static void main(String[] args) {

        int[] votos = {1463183, 1004599, 557780, 506164, 21742, 7652, 6749, 3784, 3407, 2902, 1751}; // Generales 2023 al Congreso, circunscripción de Madrid.
        int[] divisores = {1,1,1,1,1,1,1,1,1,1,1};
        int[] escannos = new int[votos.length];
        int numEscannos = 37; // Los escaños que hay que repartir en esta circunscripción.
        int totalGeneralDeVotos = 0;
        int numPartidos = votos.length;


        for (int voto : votos) {
            totalGeneralDeVotos += voto;
        }

        for (int i = 0; i < numEscannos; i++) { //Este bucle se repetira el numero de veces que sea numEscannos, en este caso 37
            int indicePartidoProxEscanno = 0; //Iniciamos la variable del partido que recibira el proximo escaño como 0
            double maxDivision = 0; //Hacemos lo mismo con la variable que va a indicar cual ha sido la division con el resultado más grande

            for (int j = 0; j < numPartidos; j++) { //Este bucle se repite el numero de veces que partidos hay, es decir, 11
                double divisionActual = (double) votos[j] / (divisores[j]); //Calculamos la division con los votos de cada partido entre sus divisores
                if (divisionActual > maxDivision) { // Si la división calculada es mayor a las divisiones almacenadas anteriormente en la variable maxDivision entramos dentro del if
                    maxDivision = divisionActual; // Actualizamos el valor al resultado actual ya que es mayor al que habia
                    indicePartidoProxEscanno = j; // Establecemos el escaño al partido que tiene el resultado mas grande
                }
            }

            escannos[indicePartidoProxEscanno]++; // Aumentamos los escaños en 1 al partido con el resultado de la division más grande
            divisores[indicePartidoProxEscanno]++;//Aumentamos el divisor de el partido ya que le hemos agregado un escaño
        }

        System.out.println("Resultados de escaños:");
        for (int k = 0; k < numPartidos; k++) { // En este for mostramos por consola con cuantos escaños se ha quedado cada partido
            System.out.println("Partido " + (k + 1) + ": " + escannos[k] + " escaños");
        }
    }
}