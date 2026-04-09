package E860_AnimalesConInterfaz;

public class Conejo extends Mamifero{
    public static final int APROVECHAMIENTO_COMIDA = 12;

    public Conejo(String nombre) {
        super(APROVECHAMIENTO_COMIDA,nombre);
    }
    public Conejo(String nombre, int energia) {
        super(APROVECHAMIENTO_COMIDA,nombre,energia);
    }

}
