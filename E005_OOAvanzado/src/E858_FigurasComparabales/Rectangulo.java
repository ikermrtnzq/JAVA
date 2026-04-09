package E858_FigurasComparabales;

public class Rectangulo extends Figura {
    private double lado1, lado2;

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calcularArea() {
        return lado1 * lado2;
    }

    @Override
    public int compareTo(Figura o) {
        if (this.calcularArea() > o.calcularArea()) return 1;
        else if (this.calcularArea() < o.calcularArea()) return -1;
        return 0;
    }
}
