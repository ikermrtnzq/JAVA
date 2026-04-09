package E075_ContadorEqualsClone;

public class Contador extends Object {
    public static final int POR_DEFECTO = 0;
    public static final int MAX = 100;
    public static final int MIN = 0;
    public static final int PASO = 2;

    private int valor;

    public Contador() {
        resetear();
    }

    public Contador(int valor) {
        setValor(valor);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        if      (valor < MIN) this.valor = MIN;
        else if (valor > MAX) this.valor = MAX;
        else                  this.valor = valor;
    }

    public Contador clone() {
        return new Contador(this.valor);
    }

    public boolean equals(Object object) {
        if (object == null) return false;
        if (!(object instanceof Contador)) return false;

        Contador otro = (Contador) object;

        return (this.valor == otro.getValor());

    }

    public String toString() {
        return String.format("¡Valgo %d!", valor);
    }

    public void resetear() {
        setValor(POR_DEFECTO);
    }

    public void incrementar() {
        incrementar(PASO);
    }

    public void incrementar(int cantidad) {
        setValor(valor + cantidad);
    }

    public void decrementar() {
        decrementar(PASO);
    }

    public void decrementar(int cantidad) {
        setValor(valor - cantidad);
    }
}