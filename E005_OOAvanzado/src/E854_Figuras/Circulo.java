package E854_Figuras;

public class Circulo extends Figura {
    private double radius;
    public Circulo(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radius * radius;
    }
}
