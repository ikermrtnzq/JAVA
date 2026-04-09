package E901_EscrituraLecturaFicheroTexto;
import java.io.*;

public class Principal {
    public static void main(String[] args) {
        PrintWriter ficheroEscritura = null;
        try {
            ficheroEscritura = new PrintWriter(new FileWriter("texto.txt"));
            for (int i = 1; i <= 10; i++) {
                ficheroEscritura.println(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ficheroEscritura != null) ficheroEscritura.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        BufferedReader ficheroLectura = null;
        StringBuilder texto = new StringBuilder();
        try{
            ficheroLectura = new BufferedReader(new FileReader("texto.txt"));
            String linea = ficheroLectura.readLine();
            while (linea != null) {
                texto.append(linea + " ");
                linea = ficheroLectura.readLine();
            }
        } catch(Exception e){
            System.out.println("Error"+e.toString());
        } finally {
            try {
                if (ficheroLectura != null) ficheroLectura.close();
            } catch(Exception e){
                System.out.println("Error"+e.toString());
            }
        }
        // Salida por pantalla
        System.out.println(texto);

    }
    public static void lectura(){

    }
}
