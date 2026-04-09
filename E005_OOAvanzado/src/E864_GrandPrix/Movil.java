package E864_GrandPrix;

public abstract class Movil {
    protected int velocidadActual;
    protected int velocidadMaxima;
    protected int distanciaDesdeInicio;
    protected String nombre;

    public Movil(String nombre, int velocidadMaxima) {
        this.nombre = nombre;
        this.velocidadMaxima = velocidadMaxima;
    }

    public abstract void tick();
    public abstract int getDistancia();

    public String getNombre() {
        return this.nombre;
    }
}

