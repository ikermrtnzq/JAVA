package E863_GlobosConJugadoresMixtos;

import java.util.*;

public class Globo {
    protected  int cantidad;
    protected int capacidad;
    protected int jugador = 1;
    protected int[] puntosXJugador;
    protected int[] cantidadSopliJugador;
    protected int[] ultimaCantidadSoplada;
    Random random = new Random();

    public Globo() {
        this.capacidad =random.nextInt(1,50);
        this.cantidad = 0;
    }

    public void inflar(int cantidad){
        this.cantidad = this.cantidad + cantidad;
    }

    public int aumentarRonda(int ronda) {
        ronda += 1;
        if (ronda == 7) ronda = 0;
        return ronda;
    }


    public int getJugador() {
        return jugador;
    }

    public boolean seHaExplotado() {
        return this.cantidad > this.capacidad;
    }

    public void cambiarJugador(int numJugadores) {
        switch (numJugadores){
            case 2: if (jugador == 1) jugador = 2;
                    else jugador = 1;
                    break;
            case 3: if (jugador == 3) jugador = 1;
                    else jugador = jugador + 1;
                    break;
            case 4: if (jugador == 4) jugador = 1;
                    else jugador = jugador + 1;
                    break;
            case 5: if (jugador == 5) jugador = 1;
                    else jugador = jugador + 1;
                    break;
        }
    }

    public void aumentarPuntos(){
        switch (jugador){
            case 1: puntosXJugador[0]= puntosXJugador[0] + 1;
            break;
            case 2:puntosXJugador[1]= puntosXJugador[1] + 1;
            break;
            case 3: puntosXJugador[2]= puntosXJugador[2] + 1;
            break;
            case 4:puntosXJugador[3]= puntosXJugador[3] + 1;
            break;
            case 5: puntosXJugador[4] = puntosXJugador[4] + 1;
            break;
        }
    }
    public int getPoints(int numJugador){
        int puntos = 0;
        switch (numJugador){
            case 0: puntos = puntosXJugador[0];
            break;
            case 1: puntos = puntosXJugador[1];
            break;
            case 2: puntos = puntosXJugador[2];
            break;
            case 3: puntos = puntosXJugador[3];
            break;
            case 4: puntos = puntosXJugador[4];
            break;
        }
        return puntos;
    }

    public String mostrarGlobo() {
        String globo = "(";

        if (this.cantidad > this.capacidad) {
            for (int i = 0; i < this.cantidad ; i++) globo += "*";
        }
        else {
            for (int i = 0; i < this.cantidad ; i++) globo += "*";
            for (int i = this.cantidad; i < this.capacidad; i++) globo += "-";
        }
        globo += ")";
        return globo;
    }


    public String getWinner() {
        boolean[] ganadores = new boolean[5];
        int minimo =Integer.MAX_VALUE;
        StringBuilder winner = new StringBuilder("Los ganadores son los jugadores : ");

        for (int i = 0; i < puntosXJugador.length; i++) {
            if (puntosXJugador[i] < minimo) {
                ganadores[i] = true;
                minimo = puntosXJugador[i];
            }
            else if (puntosXJugador[i] == minimo)  ganadores[i] = true;
            if (puntosXJugador[i] > minimo) ganadores[i] = false;
        }

        for (int i = 0; i < ganadores.length; i++) {
            if (ganadores[i]) winner.append(i).append(" ");
        }

        return winner.toString();
    }

    public void pasarPuntos(int[] puntosXJugador) {
        this.puntosXJugador = puntosXJugador;
    }
    public void pasarCantidadSoplidos(int[] cantidadSoplidos) {
        this.cantidadSopliJugador = cantidadSoplidos;
    }
    public void sumarSoplidos(int cantidad){

        switch (this.jugador){
            case 1: this.cantidadSopliJugador[0] += cantidad;
            break;
            case 2: this.cantidadSopliJugador[1] += cantidad;
            break;
            case 3: this.cantidadSopliJugador[2] += cantidad;
            break;
            case 4: this.cantidadSopliJugador[3] += cantidad;
            break;
            case 5: this.cantidadSopliJugador[4] += cantidad;
            break;
        }
    }

    public int getCantidadSoplido(int j) {
        return this.cantidadSopliJugador[j];
    }

    public void pasarUltimaCantidadSoplada(int[] ultimaCantidadSoplada) {
        this.ultimaCantidadSoplada = ultimaCantidadSoplada;
    }
    public void actualizarUltimaCantidadSoplada(int cantidad) {
        switch (this.jugador){
            case 1: this.ultimaCantidadSoplada[0] = cantidad;
            break;
            case 2: this.ultimaCantidadSoplada[1] = cantidad;
            break;
            case 3: this.ultimaCantidadSoplada[2] = cantidad;
            break;
            case 4: this.ultimaCantidadSoplada[3] = cantidad;
            break;
            case 5: this.ultimaCantidadSoplada[4] = cantidad;
            break;
        }
    }
}
