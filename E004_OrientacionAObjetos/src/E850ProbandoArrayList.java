import java.util.*;

public class E850ProbandoArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> lisaArray = new ArrayList<>();

        lisaArray.add(1);
        lisaArray.addFirst(2);
        lisaArray.addLast(3);
        lisaArray.addFirst(4);
        lisaArray.add(6);
        lisaArray.add(7);
        lisaArray.addFirst(8);
        lisaArray.addLast(9);

        System.out.println("\nARRAYLIST\n");
        System.out.printf("\nValor de la lista al principio:\n");
        for (int i = 0; i < lisaArray.size(); i++) System.out.printf("%d ", lisaArray.get(i));
        System.out.println();


        System.out.printf("\nTamaño de la lista: %d", lisaArray.size());

        System.out.printf("\nValor de la lista en la posicion 3: %d", lisaArray.get(2));
        lisaArray.set(1, 6);

        if (lisaArray.contains(5)) System.out.println("\nLa lista contiene el valor 5");
        else System.out.println("\nLa lista no contiene el valor 5");

        lisaArray.remove(6);
        lisaArray.removeFirst();
        lisaArray.removeLast();

        System.out.printf("\nValor de la lista despues de eliminar elementos\n");
        for (int elemento : lisaArray) System.out.printf("%d ", elemento);
        System.out.println();

        Collections.sort(lisaArray);
        System.out.printf("\nSe ha ordenado la lista\n");

        System.out.printf("\nValor de la lista al final del ejercicio\n");
        Iterator<Integer> iterator = lisaArray.iterator();
        while (iterator.hasNext()) {
            System.out.printf("%d ",iterator.next());
        }

        System.out.println("\n----------------------------------\n\nLINKEDLIST\n");

        LinkedList<Integer> listaLinkada = new LinkedList<Integer>();

        listaLinkada.add(1);
        listaLinkada.addFirst(2);
        listaLinkada.addLast(3);
        listaLinkada.addFirst(4);
        listaLinkada.add(6);
        listaLinkada.add(7);
        listaLinkada.addFirst(8);
        listaLinkada.addLast(9);

        System.out.printf("\nValor de la lista al principio:\n");
        for (int i = 0; i < listaLinkada.size(); i++) System.out.printf("%d ", listaLinkada.get(i));
        System.out.println();


        System.out.printf("\nTamaño de la lista: %d", listaLinkada.size());

        System.out.printf("\nValor de la lista en la posicion 3: %d", listaLinkada.get(2));
        listaLinkada.set(1, 6);

        if (listaLinkada.contains(5)) System.out.println("\nLa lista contiene el valor 5");
        else System.out.println("\nLa lista no contiene el valor 5");

        listaLinkada.remove(6);
        listaLinkada.removeFirst();
        listaLinkada.removeLast();

        System.out.printf("\nValor de la lista despues de eliminar elementos\n");
        for (int elemento : listaLinkada) System.out.printf("%d ", elemento);
        System.out.println();

        Collections.sort(listaLinkada);
        System.out.printf("\nSe ha ordenado la lista\n");

        System.out.printf("\nValor de la lista al final del ejercicio\n");
        Iterator<Integer> iterator2 = listaLinkada.iterator();
        while (iterator2.hasNext()) {
            System.out.printf("%d ",iterator2.next());
        }

    }
}

