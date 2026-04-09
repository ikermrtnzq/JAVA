package E074_RelojEqualsClone;

public class Principal {
    public static void main(String[] args) {
        Reloj reloj1 = new Reloj();
        Reloj reloj2 = reloj1;
        Reloj reloj3 = new Reloj(9, 15);

        System.out.println(reloj1);
        System.out.println(reloj2);
        System.out.println(reloj3);


        if(reloj1.equals(reloj2)) System.out.println("Reloj1 es igual a Reloj2");
        else System.out.println("Reloj1 es distinto a Reloj2");

        if(reloj2.equals(reloj3)) System.out.println("Reloj2 es igual a Reloj3");
        else System.out.println("Reloj2 es distinto a Reloj3");

        Reloj reloj4 = reloj1.clone();

        System.out.println("Clonado: " + reloj4);

        if(reloj1.equals(reloj4)) System.out.println("Reloj1 es igual a Reloj4");
        else System.out.println("Reloj1 es distinto a Reloj4");


    }
}

