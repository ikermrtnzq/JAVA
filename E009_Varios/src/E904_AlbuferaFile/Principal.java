package E904_AlbuferaFile;
import java.io.*;

public class Principal {
    public static void main(String[] args) {
        // Rutas de los archivos
        String rutaEntrada = "entrada.txt";
        String rutaSalida = "salida.txt";

        // Lista para almacenar los resultados del algoritmo
        int[] resultados = new int[100];
        int posicion = 0;

        try (BufferedReader lectura = new BufferedReader(new FileReader(rutaEntrada))) {
            String linea;
            while ((linea = lectura.readLine()) != null) {
                // Ignorar líneas vacías
                if (linea.trim().isEmpty()) {
                    continue;
                }

                // Procesar la línea
                String[] numeros = linea.split(" ");
                if (numeros.length == 1) {
                    posicion = posicion + 1;

                } else if (numeros.length == 2) {
                    // Si la línea tiene dos números, restarlos y agregar el resultado
                    int num1 = Integer.parseInt(numeros[0]);
                    int num2 = Integer.parseInt(numeros[1]);
                    resultados[posicion-1] += (num1 - num2);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        // Escribir los resultados en el archivo de salida
        try (PrintWriter escribir = new PrintWriter(new FileWriter(rutaSalida))) {

            for (int resultado = 0; resultado < posicion-1; resultado++) {
                escribir.println(resultados[resultado]);
            }
        } catch (IOException e) {
            System.out.println(" ");
        }
    }
}

