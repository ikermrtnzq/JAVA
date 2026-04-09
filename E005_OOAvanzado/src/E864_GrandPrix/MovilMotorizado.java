package E864_GrandPrix;

public class MovilMotorizado extends Movil{
    public MovilMotorizado(String nombre, int velocidadMaxima) {
        super(nombre, velocidadMaxima);
    }

    @Override
    public void tick() {}

    @Override
    public int getDistancia() {
        return this.distanciaDesdeInicio;
    }


}
