package E856_AnimalesNombre;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Random rand = new Random();

        ArrayList<Animal> animales = new ArrayList();
        animales.add(new Pajaro(90, "pipirin"));
        animales.add(new Gato(38,"mishifu"));
        animales.add(new Perro("Firulais"));
        animales.add(new Libelula(23, "lipidu"));
        animales.add(new Buho("bobio"));

        for (Animal a : animales) a.toString();
    }
}
