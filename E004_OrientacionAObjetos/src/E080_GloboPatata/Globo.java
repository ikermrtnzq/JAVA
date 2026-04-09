package E080_GloboPatata;
import java.util.*;

public class Globo {
    Random rand = new Random();
    private int capacidad;
    private int cantidad;
    private static int jugador = 1;
    private static int winsJugador1 = 0;
    private static int winsJugador2 = 0;


    public Globo(int i) {
        this.capacidad = i;
        this.cantidad = 0;
    }
    public Globo() {
        this.capacidad = rand.nextInt(10, 50) + 1;
        this.cantidad = 0;
    }

    public int aumentarRonda(int ronda) {
        ronda += 1;
        if (ronda == 5) ronda = 0;
        return ronda;
    }

    public int aumentarWinJugador2() {
        winsJugador2 += 1;
        return winsJugador2;
    }

    public int aumentarWinJugador1() {
        winsJugador1 += 1;
        return winsJugador1;
    }

    public int getJugador() {
        return jugador;
    }
    public void inflar(int cantidad){
        this.cantidad = this.cantidad + cantidad;
    }

    public int cambiarJugador() {
        if (jugador == 1) jugador = 2;
        else jugador = 1;
        return jugador;
    }

    public boolean explotado() {
        boolean explotado = false;

        if (this.cantidad > this.capacidad) explotado = true;
        return explotado;
    }

    public boolean hayGanador() {
        boolean hayGanador = false;
        if (winsJugador1 == 3) hayGanador = true;
        if (winsJugador2 == 3) hayGanador = true;
        return hayGanador;
    }

    public int quienHaGanado() {
        int ganador;
        if (getJugador() == 1) ganador = 2;
        else ganador = 1;
        return ganador;
    }

    public int getWinsJugador1() {
        return winsJugador1;
    }

    public int getWinsJugador2() {
        return winsJugador2;
    }

    public String mostrarGloboLleno() {
        String globo = "";

        for (int i = 0; i < this.capacidad ; i++) globo += "*";
        return globo;
    }
    public String mostrarGloboVacio() {
        String globo = "";

        for (int i = 0; i < this.capacidad ; i++) globo += "o";
        return globo;
    }
}
