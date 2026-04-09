package E911_MergeSort;
    public class Principal {
        private static int mitad;
        private static int[] valoresmitad1;
        private static int[] valoresmitad2;
        private static int[] auxiliar;

        public static void main(String[] args) {
            int[] valores = {2, 10, 5, 9, 3, 8, 6, 1, 4,7,11};

            mergeSort(valores);

            //for (int valor : valores) System.out.print(valor + " ");
        }

        public static void mergeSort(int[] valores) {

            if (valores.length%2 == 0){
                mitad = (valores.length/2);
                valoresmitad1 = new int[mitad];
                valoresmitad2 = new int[mitad];
            }else {
                mitad = (valores.length/2);
                valoresmitad1 = new int[mitad+1];
                valoresmitad2 = new int[mitad];
            }

            for (int i = 0; i < valoresmitad1.length; i++) {
                valoresmitad1[i] = valores[i];
            }
            int a = 0;
            for (int i = valoresmitad1.length; i <valores.length ; i++) {
                valoresmitad2[a] = valores[i];
                a++;
                if (i == valoresmitad2.length) break;
            }

            System.out.println("\nla mitad es: " + mitad);
            System.out.println("\nprimera mitad es: "+valoresmitad1.length);
            for (int valor : valoresmitad1) System.out.print(valor + " ");
            System.out.println("\nsegunda mitad es: " + valoresmitad2.length);
            for (int valor : valoresmitad2) System.out.print(valor + " ");

            ordenar(valoresmitad1, valoresmitad2);

            System.out.println("\nla mitad es: " + mitad);
            System.out.println("\nprimera mitad es: "+valoresmitad1.length);
            for (int valor : auxiliar) System.out.print(valor + " ");

        }

        private static void ordenar(int[] valores1, int[] valores2) {
            auxiliar = new int[valores1.length+valores2.length];
            int pos = 0;
            int posicion1 = 0;
            int posicion2 = 0;

            do {
                if (valores1[posicion1] < valores2[posicion2]) {
                    auxiliar[pos] =valores1[posicion1];
                    posicion1++;
                    pos++;
                } else if (valores1[posicion1] > valores2[posicion2]) {
                    auxiliar[pos] =valores2[posicion2];
                    posicion2++;
                    pos++;
                }

            }while (posicion1 < valores1.length && posicion2 < valores2.length);
        }
    }