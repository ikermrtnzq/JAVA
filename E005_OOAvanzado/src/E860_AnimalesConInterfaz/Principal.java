package E860_AnimalesConInterfaz;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Animal> animales = new ArrayList<>();
        animales.add(new Gato("Garfield", 20));
        animales.add(new Perro("Pluto"));
        animales.add(new Pajaro("Piolín", 80));
        animales.add(new Perezoso("Lily"));
        animales.add(new Rana("Gustavo", 50));
        animales.add(new Hormiga("lola", 70));
        animales.add(new Conejo("Rogger", 24));

        for (int i = 0; i < 10000; i++) {
            for (Animal animal : animales) {

                if (animal instanceof Parlante){
                    Parlante parlante = (Parlante) animal;
                    parlante.habla();
                }

                if (Math.random() < 0.30) {
                    int cantidad = (int) (Math.random() * 3) + 1;

                    animal.come(cantidad);

                    System.out.printf("%s come %d.\n", animal, cantidad);
                } else {
                    System.out.println();
                }
            }

            System.out.println("-----------");
        }
    }
}