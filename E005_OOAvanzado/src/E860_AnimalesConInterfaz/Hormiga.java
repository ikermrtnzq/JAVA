package E860_AnimalesConInterfaz;

public class Hormiga extends Insecto{
    public static final int APROVECHAMIENTO_COMIDA = 7;

    public Hormiga(String nombre) {
        super(APROVECHAMIENTO_COMIDA,nombre);
    }
    public Hormiga(String nombre, int energia) {
        super(APROVECHAMIENTO_COMIDA,nombre,energia);
    }
}
