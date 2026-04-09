package E902_CasasColgantes;
import java.util.*;

public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad = 0;
        String nombre;

        cantidad = sc.nextInt();

        String[] correcciones = new String[cantidad];
        String[] palabras = new String[cantidad];

        for (int i = 0; i < palabras.length; i++) {
             palabras[i] = sc.next().toLowerCase();
             if (palabras[i].equals("colgadas"))correcciones[i] = "Bien";
             else correcciones[i] = "Mal";
        }

        for (int i = 0; i < correcciones.length; i++) {
            System.out.println(correcciones[i]);
        }

    }
}
