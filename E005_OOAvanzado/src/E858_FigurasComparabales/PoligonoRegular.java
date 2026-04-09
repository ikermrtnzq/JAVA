package E858_FigurasComparabales;

public class PoligonoRegular extends Figura {
    private int lados;
    private double lado;

    public PoligonoRegular(int lados, double lado) {
        this.lados = lados;
        this.lado = lado;
    }

    public double calcularArea() {
        // Fórmula extraída de: https://es.wikipedia.org/wiki/Pol%C3%ADgono_regular#:~:text=la%20f%C3%B3rmula%20puede%20escribirse%20tambi%C3%A9n%20como
        return
            (lados * (lado*lado))
                /
            (4 * Math.tan(Math.PI/lados))
        ;
    }

    @Override
    public int compareTo(Figura o) {
        if (this.calcularArea() > o.calcularArea()) return 1;
        else if (this.calcularArea() < o.calcularArea()) return -1;
        return 0;
    }
}
