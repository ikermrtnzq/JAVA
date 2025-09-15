public class E039_ModuloDeVector {
    public static void main(String[] args) {

        double[] decimales ={2.3, 6.7, 3.8};
        double moduloVector = 0;

        for ( double numeroActual : decimales) {
            moduloVector = moduloVector + Math.pow(numeroActual, 2);
        }
        moduloVector = Math.sqrt(moduloVector);
        System.out.format("El vector de los numeros del array es: %.2f", moduloVector);
    }
}