package E858_FigurasComparabales;

public class Circulo extends Figura {
    private double radius;
    public Circulo(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public int compareTo(Figura o) {
        if (this.calcularArea() > o.calcularArea()) return 1;
        else if (this.calcularArea() < o.calcularArea()) return -1;
        return 0;
    }
}
