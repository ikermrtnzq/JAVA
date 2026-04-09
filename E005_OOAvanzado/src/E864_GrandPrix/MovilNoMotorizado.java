package E864_GrandPrix;

public abstract class MovilNoMotorizado extends Movil{
    public MovilNoMotorizado(String nombre, int velocidadMaxima) {
        super(nombre,velocidadMaxima);
    }
    @Override
    public abstract void tick();

    @Override
    public int getDistancia() {
        return this.distanciaDesdeInicio;
    }
}
