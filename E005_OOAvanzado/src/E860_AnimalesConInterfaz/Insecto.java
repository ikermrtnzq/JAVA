package E860_AnimalesConInterfaz;

public class Insecto extends Animal{
    public static final int GASTO_POR_HABLAR = 1;

    public Insecto(int APROVECHAMIENTO_COMIDA, String nombre) {
        super(APROVECHAMIENTO_COMIDA, GASTO_POR_HABLAR, nombre);
    }

    public Insecto(int APROVECHAMIENTO_COMIDA, String nombre, int energia) {
        super(APROVECHAMIENTO_COMIDA, GASTO_POR_HABLAR, nombre, energia);
    }

}
