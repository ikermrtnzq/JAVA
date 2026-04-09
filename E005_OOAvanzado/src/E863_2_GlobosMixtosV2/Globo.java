package E863_2_GlobosMixtosV2;
import java.util.Random;

public class Globo {
    Random random = new Random();

    private static final int CAPACIDAD_MINIMA = 10;
    private static final int CAPACIDAD_MAXIMA = 50;

    private int aire;
    private int capacidad;

    public Globo(){
        this.capacidad = random.nextInt(CAPACIDAD_MINIMA, CAPACIDAD_MAXIMA);
    }

    public Globo(int capacidad){
         this.capacidad = capacidad;
    }

    public String toString(){
        StringBuilder dibujoGlobo = new StringBuilder();
        for (int i = 0; i < this.capacidad; i++){
            if (i < this.aire) dibujoGlobo.append("*");
            else dibujoGlobo.append("O");
        }
        return dibujoGlobo.toString();
    }

    public void inflar(int cantidad){
        this.aire += cantidad;
    }

    public boolean explotado(){
        return  (this.aire > this.capacidad);
    }
}