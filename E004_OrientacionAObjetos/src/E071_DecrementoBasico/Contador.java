package E071_DecrementoBasico;

public class Contador {
    private int valor;

    public Contador(int i) {
        this.valor = i;
    }

    public int getValor(){
        return valor;
    }
    public void setValor(int valor){
        this.valor = valor;
    }

    public void decrementar() {
        decrementar(1);
    }

    public void decrementar(int cantidad) {
        valor -= cantidad;
    }
}
