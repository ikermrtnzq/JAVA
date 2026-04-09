package E864_GrandPrix;

public class Peaton extends MovilNoMotorizado{
    public Peaton(String nombre){
        super(nombre, 2);
    }

    @Override
    public void tick() {
        this.velocidadActual = 1;
        this.distanciaDesdeInicio = this.distanciaDesdeInicio + this.velocidadActual;
    }
    public int getDistancia(){
        return super.getDistancia();
    }

}
