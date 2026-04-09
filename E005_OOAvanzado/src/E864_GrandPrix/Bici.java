package E864_GrandPrix;

public class Bici extends MovilNoMotorizado{
    protected int aceleracion = 1;

    public Bici(String nombre){
        super(nombre, 5);
    }

    public void tick() {
        if (this.velocidadActual != this.velocidadMaxima) this.velocidadActual = this.velocidadActual + this.aceleracion;
        this.distanciaDesdeInicio = this.distanciaDesdeInicio + this.velocidadActual;
    }
    public int getDistancia(){
        return super.getDistancia();
    }

}
