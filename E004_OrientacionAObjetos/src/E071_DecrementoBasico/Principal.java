package E071_DecrementoBasico;

public class Principal {
    public static void main(String[] args) {
        Contador c = new Contador(100);

        c.setValor(7);

        c.decrementar();
        c.decrementar(4);
        System.out.printf("El valor del contador es %d .",c.getValor() );
    }
}
