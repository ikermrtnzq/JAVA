package E072_NumeroInteligenteBasico;

public class NumeroInteligente {

    public static int VALOR ;

    public NumeroInteligente(){
        VALOR = 1;
    }
    public NumeroInteligente(int valor){
        VALOR = valor;
    }
    public int getValor() {
        return VALOR;
    }
    public void setValor(int valor) {
        if (valor < 0) VALOR = 0;
        else VALOR = valor;
    }

    public void incrementar(){
       incrementar(1);
    }
    public void incrementar(int valor){
        setValor(VALOR+valor);
    }
    public void decrementar(){
        decrementar(1);
    }
    public void decrementar(int valor){
        setValor(VALOR-valor);
    }
    public boolean esPrimo(){
        boolean primo = true;
        for (int i = 2; i < VALOR; i++){
            if (VALOR % 2 == 0){
                primo = false;
                break;
            }
        }
        return primo;
    }
}
