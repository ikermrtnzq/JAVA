package E860_AnimalesConInterfaz;

public abstract class Animal {
    public static final int ENERGIA_POR_DEFECTO = 100;

    protected int aprovechamientoComida;
    protected int gastoPorHablar;
    protected String nombre;
    protected int energia;

    public Animal(int aprovechamientoComida, int gastoPorHablar, String nombre) {
        this(aprovechamientoComida, gastoPorHablar, nombre, ENERGIA_POR_DEFECTO);
    }

    public Animal(int aprovechamientoComida, int gastoPorHablar, String nombre, int energia) {
        this.aprovechamientoComida = aprovechamientoComida;
        this.gastoPorHablar = gastoPorHablar;
        this.nombre = nombre;
        this.energia = energia;
    }

    public void come(int cantidad) {
        energia = energia + (cantidad * aprovechamientoComida) ;

        if (energia > ENERGIA_POR_DEFECTO) energia = ENERGIA_POR_DEFECTO;
    }

    public void gastarEnergiaPorHablar(){
        energia = energia - gastoPorHablar;

        if (energia < 0) energia = 0;
    }
}