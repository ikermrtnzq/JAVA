package E920_TecladoEstropeado;
import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String entrada = sc.nextLine();
            ArrayList<Character> texto = new ArrayList<>();
            int cursor = 0;

            for (char c : entrada.toCharArray()) {
                switch (c) {
                    case '-':
                        cursor = 0;
                        break;
                    case '+':
                        cursor = texto.size();
                        break;
                    case '*':
                        if (cursor < texto.size()) {
                            cursor++;
                        }
                        break;
                    case '3':
                        if (cursor < texto.size()) {
                            texto.remove(cursor);
                        }
                        break;
                    default:
                        texto.add(cursor, c);
                        cursor++;
                        break;
                }
            }
            StringBuilder salida = new StringBuilder();
            for (char c : texto) salida.append(c);
            System.out.println(salida);
        }
    }
}
