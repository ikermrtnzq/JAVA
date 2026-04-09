package E864_GrandPrix;
import java.util.*;

public class Moto extends MovilMotorizado{
    Random rand = new Random();
    protected int aceleracion = rand.nextInt(1,5);
    protected double tasaDeAverias = 0.06;
    boolean averiado = false;

    public Moto(String nombre) {
        super(nombre, 80);
    }

    public void tick(){
        if (averiado) return;

        double random  = rand.nextDouble(0, 1);

        if (random >= this.tasaDeAverias){
            if (this.velocidadActual != this.velocidadMaxima) this.velocidadActual = this.velocidadActual + this.aceleracion;
            this.distanciaDesdeInicio = this.distanciaDesdeInicio + this.velocidadActual;
        } else averiado = true;

    }
    public int getDistancia(){
        return super.getDistancia();
    }

}
