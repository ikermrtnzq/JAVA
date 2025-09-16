public class E044_HistogramaDeLetras {
    public static void main(String[] args) {

        String frase = ("Esto es una frase muy bonita de pruebañ áááááaáaááááaá").toLowerCase();
        int longitud = frase.length();
        int[] vecesLetras = new int[27];
        char[] abecedario = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q',
                             'r','s','t','u','v','w','x','y','z','ñ'};

        for (int i = 0; i < longitud; i++) {
            if (frase.charAt(i) >= 'a' && frase.charAt(i) <= 'z') {
                switch (frase.charAt(i)) {
                    case 'a'-> vecesLetras[0]++;
                    case 'b'-> vecesLetras[1]++;
                    case 'c'-> vecesLetras[2]++;
                    case 'd'-> vecesLetras[3]++;
                    case 'e'-> vecesLetras[4]++;
                    case 'f'-> vecesLetras[5]++;
                    case 'g'-> vecesLetras[6]++;
                    case 'h'-> vecesLetras[7]++;
                    case 'i'-> vecesLetras[8]++;
                    case 'j'-> vecesLetras[9]++;
                    case 'k'-> vecesLetras[10]++;
                    case 'l'-> vecesLetras[11]++;
                    case 'm'-> vecesLetras[12]++;
                    case 'n'-> vecesLetras[13]++;
                    case 'o'-> vecesLetras[14]++;
                    case 'p'-> vecesLetras[15]++;
                    case 'q'-> vecesLetras[16]++;
                    case 'r'-> vecesLetras[17]++;
                    case 's'-> vecesLetras[18]++;
                    case 't'-> vecesLetras[19]++;
                    case 'u'-> vecesLetras[20]++;
                    case 'v'-> vecesLetras[21]++;
                    case 'w'-> vecesLetras[22]++;
                    case 'x'-> vecesLetras[23]++;
                    case 'y'-> vecesLetras[24]++;
                    case 'z'-> vecesLetras[25]++;
                }
            }else if (frase.charAt(i) >= 'ñ') {
                vecesLetras[26]++;
            } else if (frase.charAt(i) == 'á' || frase.charAt(i) == 'é' || frase.charAt(i) == 'í' || frase.charAt(i) == 'ó'|| frase.charAt(i) == 'ú') {
                switch (frase.charAt(i)) {
                    case 'á'-> vecesLetras[0]++;
                    case 'é' -> vecesLetras[4]++;
                    case 'í'-> vecesLetras[8]++;
                    case 'ó'-> vecesLetras[14]++;
                    case 'ú'-> vecesLetras[20]++;
                }
            }
        }

        for (int i =0; i < vecesLetras.length; i++) {
            System.out.format("Hay %d %s\n", vecesLetras[i], abecedario[i]);
        }

        System.out.println("\n");
        System.out.println("Gráfica: ");

        String representacion = "*";

        for (int i =0; i < vecesLetras.length; i++) {
            System.out.printf(" %s | %s\n",abecedario[i], representacion.repeat(vecesLetras[i]));
        }

        int cantidadMaxima = Integer.MIN_VALUE;

        for (int i =0; i < vecesLetras.length; i++) {
            if (vecesLetras[i] > cantidadMaxima) {
                cantidadMaxima = vecesLetras[i];
            }
        }
        System.out.println(cantidadMaxima);
    }
}