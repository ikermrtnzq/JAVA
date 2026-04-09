package E072_NumeroInteligenteBasico;

public class Principal {
    public static void main(String[] args) {
        NumeroInteligente num1 = new NumeroInteligente();

        num1.setValor(37);

        System.out.printf("EL valor de num1 = %d\n", num1.getValor());

        num1.incrementar();

        System.out.printf("EL valor de num1 = %d\n", num1.getValor());

        num1.incrementar(20);
        System.out.printf("EL valor de num1 = %d\n", num1.getValor());

        num1.decrementar();
        System.out.printf("EL valor de num1 = %d\n", num1.getValor());

        num1.decrementar(2);

        System.out.printf("EL valor de num1 = %d\n", num1.getValor());

        System.out.printf("El valor  num1: %d %s primo\n", num1.getValor(),(num1.esPrimo()? "es":"no es"));

        System.out.println("--------------------------");

        for (int i = 0; i <= 100 ; i++) {
            num1.setValor(i);
            System.out.printf("El valor %d %s primo\n", num1.getValor(),(num1.esPrimo()? "es":"no es"));
        }

        System.out.println("-----------------");

        for (int i = 0; i <= 100 ; i++) {
            num1.setValor(i);
            if (num1.esPrimo()) {
                System.out.printf("El valor %d es primo\n", num1.getValor());

            }
        }
    }
}
