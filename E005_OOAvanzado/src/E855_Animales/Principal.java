package E855_Animales;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Random rand = new Random();

        ArrayList<Animal> animales = new ArrayList();
        animales.add(new Pajaro(90));
        animales.add(new Gato(38));
        animales.add(new Perro());
        animales.add(new Libelula(23));
        animales.add(new Buho());

        int valor = 0;
        while (valor < 10){
            for (Animal animal : animales) {
                animal.hablar();
                animal.comer(rand.nextInt(0, 2));
            }
            System.out.println();
            valor = valor +1;
        }
    }
}
