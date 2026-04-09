package E864_GrandPrix;
import java.util.*;

public class Coche extends MovilMotorizado{
    Random rand = new Random();
    protected int distanciaDesdeUltimoSemaforo;
    protected int aceleracion = rand.nextInt(1,3);
    protected double tasaDeAverias = 0.12;
    int numTicksParados = 1;
    boolean averiado = false;

    public Coche(String nombre) {
        super(nombre, 60);
    }

    public void tick(){
        if (averiado) return;

        double random = rand.nextDouble(0, 1);

        if (this.distanciaDesdeUltimoSemaforo >= 300){
            numTicksParados = numTicksParados + 1;
            if (numTicksParados == 10){
                this.velocidadActual = 0;
                this.distanciaDesdeUltimoSemaforo = 0;
                numTicksParados = 1;
            }
        }else {
            if (random >= this.tasaDeAverias){
                if (this.velocidadActual != this.velocidadMaxima) {
                    this.velocidadActual = this.velocidadActual + this.aceleracion;
                    this.distanciaDesdeUltimoSemaforo = this.distanciaDesdeUltimoSemaforo + this.velocidadActual;
                    this.distanciaDesdeInicio = this.distanciaDesdeInicio + this.velocidadActual;
                }
            }else averiado = true;
        }

    }
    public int getDistancia(){
        return super.getDistancia();
    }

}
