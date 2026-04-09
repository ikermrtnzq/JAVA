import java.util.*;
public class E851_ExtraerPares {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
            numeros.add(12);
            numeros.add(7);
            numeros.add(9);
            numeros.add(24);
            numeros.add(31);
            numeros.add(18);
            numeros.add(6);
            numeros.add(5);

        ArrayList<Integer> numerosPares = new ArrayList<>();

        for (int elemento : numeros) {
            if (elemento % 2 == 0) {
                numerosPares.add(elemento);
            }
        }

        System.out.println(numeros);
        System.out.println(numerosPares);

    }
}
