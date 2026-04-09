import java.util.*;
    public class E853RotarElementosRotate {
        public static void main(String[] args) {
            ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(12, 7, 9, 24, 31, 18, 6, 5));
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Lista: " + numeros);
                System.out.println("¿Hacia dónde quieres moverte? (i/d) o escribe 's' para terminar:");
                String direccion = scanner.nextLine().toLowerCase();

                if (direccion.equals("s")) {
                    System.out.println("Terminando....");
                    break;
                }

                System.out.println("¿cuanto quieres moverte?");
                int posiciones = scanner.nextInt();
                scanner.nextLine();

                posiciones = posiciones % numeros.size();

                if (direccion.equals("i")) {
                    Collections.rotate(numeros, -posiciones);
                } else if (direccion.equals("d")) {
                    Collections.rotate(numeros, posiciones);
                } else {
                    System.out.println("no válida. Intenta de nuevo.");
                }
            }

            scanner.close();
        }
    }

