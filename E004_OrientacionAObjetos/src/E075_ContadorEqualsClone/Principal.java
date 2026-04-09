package E075_ContadorEqualsClone;

public class Principal {

    public static void main(String[] args) {
        Contador a = new Contador(7);
        Contador b = a;
        Contador c = new Contador(7);

        if (a.equals(b)) {
            System.out.println("A y B son Iguales");
        } else {
            System.out.println("A y B son Distintos");
        }

        c.incrementar(10);

        if (a.equals(c)) {
            System.out.println("A y C son Iguales");
        } else {
            System.out.println("A y C son Distintos");
        }

        Contador d = (Contador) a.clone();

        if (a.equals(d)) {
            System.out.println("A y D son Iguales");
        } else {
            System.out.println("A y D son Distintos");
        }

    }
}
