package E81_Frase;
import java.util.*;

public class Frase {
    StringBuilder contenido;

    public Frase() {
        this.contenido = new StringBuilder("");
    }
    public Frase(String contenido) {
        this.contenido = new StringBuilder(contenido);
    }
    public Frase(int repeticiones, String contenido) {
        this.contenido = new StringBuilder(contenido);
        this.contenido.append(" ");
        this.contenido.repeat(this.contenido, repeticiones - 1);
        recortar(1);
    }

    public char caracterEn(int posicion) {
        return this.contenido.charAt(posicion);
    }

    public int longitud() {
        return this.contenido.length();
    }

    public void anexar(String contenidoNuevo) {
        if (this.contenido.isEmpty()) this.contenido.append(contenidoNuevo);
        else if (this.contenido.charAt(this.contenido.length()-1)== ' ') this.contenido.append(contenidoNuevo);
        else this.contenido.append(" ").append(contenidoNuevo);
    }

    public String getFrase() {
        return this.contenido.toString();
    }

    public void recortar(int cantidad) {
        this.contenido = new StringBuilder(this.contenido.substring(0, this.contenido.length()-cantidad));
    }
    public Frase clone() {
        return new Frase(this.contenido.toString());
    }

    public boolean equals(Object object) {
        if (object == null) return false;
        if (!(object instanceof Frase)) return false;

        Frase clon = (Frase) object;

        return (this.contenido.compareTo(clon.contenido) == 0);

    }

    public String toString() {
        return String.format("¡Valgo %s!", this.contenido);
    }

}
