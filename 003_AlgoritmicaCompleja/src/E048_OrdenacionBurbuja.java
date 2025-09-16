public class E048_OrdenacionBurbuja {
    public static void main(String[] args) {
        int[] lista = {5, 15, 20, 3, 8, 10, 7};

        for (int i = 0; i < lista.length -1 ; i++) {
            for (int j = 0; j < lista.length -1 - i; j++) {
                if (lista[j] > lista[j+1]) {
                    int temporal = lista[j];
                    lista[j] = lista[j+1];
                    lista[j+1] = temporal;
                }
            }
        }
        for(int actual : lista){
            System.out.printf("%d ", actual);
        }
    }
}