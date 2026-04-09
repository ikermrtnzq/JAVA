package E070_ContadorBasico;

public class Contador {
    public static int POR_DEFECTO = 100;

    public static int MAX= 100;
    public static int MIN= 0;

    private int valor;

    public Contador() {
        resetear();
    }

    public Contador(int i) {
        this.valor = i;
    }


    public String toString(){
        return "patata";
    }
    public int getValor(){
        return valor;
    }

    public void setValor(int valor){
        if (valor > MAX) this.valor = MAX;
        else if (valor < MIN) this.valor = MIN;
        else this.valor = valor;

    }

    public void resetear(){
        setValor(POR_DEFECTO);
    }

    public void incrementar() {
        incrementar(1);
    }

    public void incrementar(int cantidad) {
        setValor(getValor() + cantidad);
    }

    public void decrementar() {
        decrementar(1);
    }

    public void decrementar(int cantidad) {
        setValor(getValor() - cantidad);
    }

}
