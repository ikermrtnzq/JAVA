package E865_ExcepcionesEnContador;

public class Contador {
    public static final int POR_DEFECTO = 0;
    public static final int MAX = 100;
    public static final int MIN = 0;
    public static final int PASO = 1;

    private int valor;

    public Contador() throws ValorFueraDeRangoException {
        resetear();
    }

    public Contador(int valor) throws ValorFueraDeRangoException {
        setValor(valor);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) throws ValorFueraDeRangoException {
        if      (valor < MIN) this.valor = MIN;
        else if (valor > MAX) this.valor = MAX;
        else if (valor < 0) throw new ValorFueraDeRangoException();
        else                  this.valor = valor;
    }

    public String toString() {
        return String.format("¡Valgo %d!", valor);
    }

    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Contador)) return false;
        Contador otro = (Contador) obj;
        return (this.valor == otro.valor);
    }

    public Contador clone() {
        try {
            return new Contador(valor);
        } catch (ValorFueraDeRangoException e) {
            throw new RuntimeException(e);
        }
    }

    public void resetear() throws ValorFueraDeRangoException {
        setValor(POR_DEFECTO);
    }

    public void incrementar() throws ValorFueraDeRangoException {
        incrementar(PASO);
    }

    public void incrementar(int cantidad) throws ValorFueraDeRangoException {
        if (valor == Integer.MAX_VALUE) throw new ValorFueraDeRangoException();
        setValor(valor + cantidad);
    }

    public void decrementar() throws ValorFueraDeRangoException {
        decrementar(PASO);
    }

    public void decrementar(int cantidad) throws ValorFueraDeRangoException {
        if (valor == 0) throw new ValorFueraDeRangoException();
        setValor(valor - cantidad);
    }
}