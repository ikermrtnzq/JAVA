package E860_AnimalesConInterfaz;

public abstract class Mamifero extends Animal {
    public static final int GASTO_POR_HABLAR = 3;

    public Mamifero(int aprovechamientoComida, String nombre) {
        super(GASTO_POR_HABLAR, aprovechamientoComida, nombre);
    }

    public Mamifero(int aprovechamientoComida, String nombre, int energia) {
        super(GASTO_POR_HABLAR, aprovechamientoComida, nombre, energia);
    }
}