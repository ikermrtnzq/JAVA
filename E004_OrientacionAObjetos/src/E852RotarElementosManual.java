import java.util.*;
public class E852RotarElementosManual {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(12, 7, 9, 24, 31, 18, 6, 5));
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Lista: " + numeros);
            System.out.println("¿Hacia dónde quieres moverte? (i/d) o escribe 's' para terminar:");
            String direccion = scanner.nextLine().toLowerCase();

            if (direccion.equals("s")) {
                System.out.println("terminando....");
                break;
            }

            System.out.println("¿Cuántas posiciones quieres moverte?");
            int posiciones = scanner.nextInt();
            scanner.nextLine();

            posiciones = posiciones % numeros.size();

            if (direccion.equals("i")) {
                rotamientoIzquierda(numeros, posiciones);
            } else if (direccion.equals("d ")) {
                rotamientoDerecha(numeros, posiciones);
            } else {
                System.out.println("no válida. Intenta de nuevo.");
            }
        }
        scanner.close();
    }

    public static void rotamientoIzquierda(ArrayList<Integer> lista, int posiciones) {
        for (int i = 0; i < posiciones; i++) {
            int primero = lista.remove(0);
            lista.add(primero);
        }
    }

    public static void rotamientoDerecha(ArrayList<Integer> lista, int posiciones) {
        for (int i = 0; i < posiciones; i++) {
            int ultimo = lista.remove(lista.size() - 1);
            lista.add(0, ultimo);
        }
    }
}