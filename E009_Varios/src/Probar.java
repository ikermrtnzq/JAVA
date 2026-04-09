public class Probar {
    public static int contarLetras(String cadena, char letra) {
        int contadorBucle = 0;
        int numLetras = 0;
        int longitud = 0;

        longitud = cadena.length();
        if (longitud > 0) {
            while (contadorBucle < longitud) {
                if (cadena.charAt(contadorBucle) == letra) {
                    numLetras++;
                }
                contadorBucle++;
            }
        }

        return numLetras;
    }

    public static void main(String[] args) {
       int numLetras = contarLetras("cocacola", 'c');
        System.out.printf(numLetras + " ");

    }

}
