package E927_BDD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);

        int opcion = 0;
        char continuar = 'a';
        String menu = """
                    Sobre Categoria\n
                    1) Listar todas las categorías que hay\n
                    2) Insertar una categoría nueva\n
                    3) Eliminar una categoria\n
                    4) Modificar una categoria\n
                    5) Obtener una categoria\n
                    -------------------------------------------
                    Sobre Persona\n
                    6) Listar persona\n
                    7) Obtener una persona\n 
                    8) Insertar una persona\n
                    9) Eliminar una persona\n 
                    10) Modificar una persona\n
                    """;

        while (continuar != 'n') {
            System.out.printf("\n\n\n");

            System.out.printf(menu);
            Scanner entrada2 = new Scanner(System.in);
            opcion = entrada2.nextInt();

            if (opcion == 1) {
                System.out.printf("\n\n");
                System.out.println("Listando todas las categorías que hay.");
                String sentencia = "SELECT * FROM categoria";

                Categoria cat = new Categoria();
                Categoria.obtenerTodas();

                System.out.println();

            } else if (opcion == 2) {
                System.out.print("\n\n");
                Categoria cat = new Categoria();

                System.out.println("\nInsertando una categoría nueva.\nIntroduce el nombre de la nueva categoria: ");
                String nombre = entrada2.next();

                cat.setNombre(nombre);
                cat.crearEnBD();

                System.out.println();

            } else if (opcion == 3) {
                System.out.print("\n\n");
                Categoria cat = new Categoria();

                System.out.println("\nEliminando una categoria.\nIntroduce el id de la categoria: ");
                int id = entrada2.nextInt();

                cat.setId(id);
                cat.eliminarDeBD();

                System.out.println();

            } else if (opcion == 4) {
                System.out.print("\n\n");
                Categoria cat = new Categoria();

                System.out.println("\nModificar una categoria\n");

                System.out.println("Introduce el id de la categoria: ");
                int id = entrada2.nextInt();

                System.out.println("Introduce el nuevo nombre de la categoria: ");
                String nombre = entrada2.next();

                cat.setId(id);
                cat.setNombre(nombre);
                cat.actualizarEnBD();

                System.out.println();

            } else if (opcion == 5) {
                System.out.print("\n\n");
                Categoria cat = new Categoria();

                System.out.println("\nObtener una categoria.\n");

                System.out.println("Introduce el id de la categoria: ");
                int id = entrada2.nextInt();

                cat.setId(id);
                cat.cargarDesdeBD();

                System.out.println();

            } else if (opcion == 6) {
                System.out.printf("\n\n");
                System.out.println("\nListar personas.\n");

                Persona.obtenerTodas();

                System.out.println();

            } else if (opcion == 7) {
                System.out.printf("\n\n");
                System.out.println("\nObtener una persona.\n");

                Persona persona = new Persona();

                System.out.println("Introduce el id de la persona: ");
                int id = entrada2.nextInt();

                persona.setId(id);
                persona.cargarDesdeBD();

                System.out.println();

            } else if (opcion == 8) {
                System.out.printf("\n\n");

                System.out.println("\nInsertar una persona.\n");

                System.out.println("Introduce su nombre: ");
                String nombre = entrada2.next();

                System.out.println("Introduce el primer apellido: ");
                String apellido1 = entrada2.next();

                System.out.println("Introduce el segundo apellido: ");
                String apellido2 = entrada2.next();

                String apellidos = apellido1 +" "+ apellido2;

                System.out.println("Introduce su número de telefono: ");
                int telefono = entrada2.nextInt();

                System.out.println("\nIntroduce el id de su categoria: ");
                int id = entrada2.nextInt();

                System.out.println("Introduce su edad: ");
                int edad = entrada2.nextInt();

                Persona persona = new Persona();
                persona.setId(id);
                persona.setNombre(nombre);
                persona.setApellidos(apellidos);
                persona.setEdad(edad);
                persona.setTelefono(telefono);

                persona.crearEnBD();

                System.out.println();

            }else if (opcion == 9) {
                System.out.printf("\n\n");

                System.out.println("\nElimina una persona.\nIntroduce el id de la persona: ");
                int id = entrada.nextInt();

                Persona persona = new Persona();
                persona.setId(id);

                persona.eliminarDeBD();

                System.out.println();

            }else if (opcion == 10) {
                System.out.printf("\n\n");

                System.out.println("\nModificar una persona.\n");

                System.out.println("Introduce la nombre de la persona: ");
                String nombre = entrada.next();

                System.out.println("Introduce el id de la persona: ");
                int id = entrada.nextInt();

                Persona persona = new Persona();
                persona.setId(id);
                persona.setNombre(nombre);

                System.out.println();

            }
            System.out.printf("\n¿Quieres continuar? (S/N) ");
            continuar = entrada2.next().toLowerCase().charAt(0);
        }
    }
}
