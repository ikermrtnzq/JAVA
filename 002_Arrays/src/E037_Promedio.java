public class E037_Promedio {
    public static void main(String[] args) {

        double[] decimales = {7.9, 10, 9.5};

        double suma = 0;
        double media = decimales.length;

        System.out.println("Este es el array.........");

        for (double numeroActual : decimales) {
            System.out.println(numeroActual);
            suma = suma + numeroActual;
        }
        media = suma / media;
        System.out.printf("La media es: %.2f ",media);
    }
}