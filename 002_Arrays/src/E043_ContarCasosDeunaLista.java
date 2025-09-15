public class E043_ContarCasosDeunaLista {
    public static void main(String[] args) {

        int[] buscados = {17, 23, 3};
        int[] lista = {8, 23, 30, 47, 17, 5, 17, 21, 2};

        int numeroAparaciones= 0;

        for (int i = 0; i < buscados.length; i++) {
            for (int numActual : lista) {
                if (numActual == buscados[i]) {
                    numeroAparaciones++;
                }
            }
        }
        System.out.printf("En esta lista aparecen los numeros buscados %d veces",numeroAparaciones);
    }
}