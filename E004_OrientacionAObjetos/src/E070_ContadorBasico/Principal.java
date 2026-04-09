package E070_ContadorBasico;

public class Principal {
    public static void main(String[] args) {
        Contador c1= new Contador();
        Contador c2= new Contador(50);

        c1.setValor(7);

        c2.incrementar();
        c1.incrementar(45);

        c1.resetear();

        c1.decrementar();
        c2.decrementar(14);

        c2.incrementar(57);
        System.out.printf("El valor de los contadores es %d : %d .\n",c1.getValor(), c2.getValor());
        System.out.println(c1);
        System.out.printf("%s", c1.toString());
    }
}
