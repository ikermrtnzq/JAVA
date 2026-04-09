package E863_2_GlobosMixtosV2;

public abstract class Jugador {
    protected String nombre;
    private static int maxSoplido = 10;
    protected int ultimoSoplido;
    protected int limiteSoplidoPorCansancio = 10;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        return String.format("%s", this.nombre);
    }

    // Según el soplido perderemos aliento
    protected void perderAliento() {
        //Para calcularlo simplemente restamos el soplo con el maximo soplo permitido
        //Obtenemos el mayor de este, en el caso en que la resta de 0, (10 - 10 = 0) con MAX lo ajustamos a 1
        limiteSoplidoPorCansancio = Math.max(1, maxSoplido - ultimoSoplido);
    }

    public abstract int determinarSoplo();

    public void realizarTurno(Globo globo) {
        int soplido = determinarSoplo();
        globo.inflar(soplido);
    }
}