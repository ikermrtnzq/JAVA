package Practica;
import java.io.*;
import java.util.*;
public class LecturaFicheros {
    public static void main(String[] args) {
        Scanner entrada = null;
        PrintWriter salida = null;

        try {
            entrada = new Scanner(new BufferedReader(new FileReader("C:\\Users\\rosii\\OneDrive\\Documentos\\Escritorio\\insti\\DAW\\Programación\\Proyectos\\E009_Varios\\src\\Practica\\fichero.txt")));
            salida = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\rosii\\OneDrive\\Documentos\\Escritorio\\insti\\DAW\\Programación\\Proyectos\\E009_Varios\\src\\Practica\\salida.txt")));

            int numVeces = entrada.nextInt();
            int sumaEdades = 0;
            int sumaAnniosEmpresa= 0;

                for (int i = 0; i < numVeces; i++) {
                    int anniosEmpresa = entrada.nextInt();
                    int edades = entrada.nextInt();

                    sumaAnniosEmpresa = sumaAnniosEmpresa + anniosEmpresa;
                    sumaEdades = sumaEdades + edades;
                }
                numVeces--;

            System.out.println(sumaEdades);
            salida.println(sumaEdades);
            salida.println(sumaAnniosEmpresa);


        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (salida != null) salida.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
