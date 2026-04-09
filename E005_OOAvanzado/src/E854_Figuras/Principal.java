package E854_Figuras;

import org.w3c.dom.css.Rect;

public class Principal {
    public static void main(String[] args) {
        Figura[] conjuntoDeFiguras = new Figura[5];

        conjuntoDeFiguras[0] = new Rectangulo(5.7, 3.21);
        conjuntoDeFiguras[1] = new Rectangulo(8.9, 10.22);
        conjuntoDeFiguras[2] = new Circulo(5.22);
        conjuntoDeFiguras[3] = new Circulo(8.9);
        conjuntoDeFiguras[4] = new Cuadrado(5.7);

        double conjuntoAreas= 0;
        for (Figura elemento : conjuntoDeFiguras){
            Figura figura = elemento;
            conjuntoAreas = conjuntoAreas + figura.calcularArea();
        }

        System.out.printf("\nConjunto de areas : %.2f", conjuntoAreas);
    }
}
