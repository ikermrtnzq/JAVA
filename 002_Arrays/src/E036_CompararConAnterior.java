public class E036_CompararConAnterior {
    public static void main(String[] args) {

        double[] decimales= {2.4, 36.8, 6.9, 34.6, 34.6};

        double anterior = decimales[0];

        for (int actual = 1; actual < decimales.length; actual++) {
            
            if (decimales[actual] == anterior){
                System.out.printf("El número %d es IGUAL que el numero %d\n",actual+1, actual);
            } else if (decimales[actual] > anterior) {
                System.out.printf("El número %d es MAYOR que el número %d\n", actual+1, actual);
            } else if (decimales[actual] < anterior) {
                System.out.printf("El número %d es MENOR que el número %d\n", actual+1, actual);
            }
            anterior = decimales[actual];
        }
    }
}