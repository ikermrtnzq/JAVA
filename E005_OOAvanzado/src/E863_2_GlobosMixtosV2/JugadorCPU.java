package E863_2_GlobosMixtosV2;
import java.util.Random;

public class JugadorCPU extends Jugador{
    private Random random;

    public JugadorCPU(String nombre) {
        super(nombre);
        this.random = new Random();
    }

    public int determinarSoplo() {
        //Calculamos un soplo random dentro de lo permitido
        ultimoSoplido = random.nextInt(limiteSoplidoPorCansancio) + 1;
        System.out.printf("\n%s ha soplado %d de aire\n", nombre, ultimoSoplido);
        perderAliento();
        return ultimoSoplido;
    }
}