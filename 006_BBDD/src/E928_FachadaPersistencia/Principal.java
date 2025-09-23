package E928_FachadaPersistencia;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        char respuesta = ' ';

        try {
            do {
                System.out.println("\nOpciones para interactuar con el gestor de agenda:");
                System.out.println(
                        "----------------------------------\n" +
                                " [1] Listar todas las categorías\n" +
                                " [2] Crear una categoría nueva\n" +
                                " [3] Eliminar una categoría\n" +
                                " [4] Modificar una categoría\n" +
                                " [5] Obtener una categoría por ID\n" +
                                "----------------------------------\n" +
                                " [6] Listar todas las personas\n" +
                                " [7] Añadir una persona\n" +
                                " [8] Eliminar una persona\n" +
                                " [9] Modificar los datos de una persona\n");

                System.out.print("Selecciona una opción: ");
                opcion = teclado.nextInt();
                teclado.nextLine();

                FachadaPersistencia.conectar();
                switch (opcion) {
                    case 1 -> listarCategorias();
                    case 2 -> {
                        System.out.print("Introduce el nombre de la nueva categoría: ");
                        String nombre = teclado.nextLine();
                        Categoria categoria = new Categoria();
                        categoria.setNombre(nombre);
                        categoria.crearEnBD();
                    }
                    case 3 -> {
                        System.out.print("Elige una opción: Introducir el ID (1), el Nombre (2), si deseas cancelar: (3)? ");
                        int eleccion = teclado.nextInt();
                        teclado.nextLine();
                        switch (eleccion) {
                            case 1 -> {
                                System.out.print("Introduce el ID de la categoría a eliminar: ");
                                int id = teclado.nextInt();
                                teclado.nextLine();
                                Categoria categoria = new Categoria(id);
                                categoria.eliminarDeBD();
                            }
                            case 2 -> {
                                System.out.print("Introduce el nombre de la categoría a eliminar: ");
                                String nombre = teclado.nextLine();
                                Categoria categoria = new Categoria();
                                categoria.setNombre(nombre);
                                categoria.eliminarPorNombre();
                            }
                            case 3 -> System.out.println("La operación fue cancelada");
                        }
                    }
                    case 4 -> {
                        System.out.print("Introduce el ID de la categoría que quieres renombrar: ");
                        int id = teclado.nextInt();
                        teclado.nextLine();
                        System.out.print("Introduce el nuevo nombre: ");
                        String nuevoNombreCategoria = teclado.nextLine();

                        Categoria categoria = new Categoria(id);
                        categoria.setNombre(nuevoNombreCategoria);
                        categoria.actualizarEnBD();
                    }
                    case 5 -> {
                        System.out.print("Introduce el ID de la categoría que deseas obtener: ");
                        int id = teclado.nextInt();
                        teclado.nextLine();
                        Categoria categoria = new Categoria(id);
                        System.out.println(categoria);
                    }
                    case 6 -> listarPersonas();
                    case 7 -> {
                        System.out.print("Introduce los datos de la nueva persona para añadirla:\n");
                        System.out.print("Introduce el nombre: ");
                        String nombre = teclado.nextLine();
                        System.out.print("Introduce los apellidos: ");
                        String apellidos = teclado.nextLine();
                        System.out.print("Introduce el teléfono: ");
                        String telefono = teclado.nextLine();
                        System.out.print("Introduce el ID de la categoría a la que quieres vincular: ");
                        int categoriaId = teclado.nextInt();
                        teclado.nextLine();

                        Persona persona = new Persona();
                        persona.setNombre(nombre);
                        persona.setApellidos(apellidos);
                        persona.setTelefono(telefono);
                        persona.setCategoriaId(categoriaId);
                        persona.crearEnBD();
                    }
                    case 8 -> {
                        System.out.print("Introduce el ID de la persona a eliminar: ");
                        int id = teclado.nextInt();
                        teclado.nextLine();
                        Persona persona = new Persona(id);
                        persona.eliminarDeBD();
                    }
                    case 9 -> {
                        System.out.print("Introduce el ID de la persona a modificar: ");
                        int id = teclado.nextInt();
                        teclado.nextLine();
                        Persona persona = new Persona(id);
                        System.out.print("Introduce un nuevo nombre: ");
                        String nuevoNombre = teclado.nextLine();
                        System.out.print("Introduce un nuevo apellido: ");
                        String nuevosApellidos = teclado.nextLine();
                        System.out.print("Introduce el nuevo teléfono: ");
                        String nuevoTelefono = teclado.nextLine();
                        System.out.print("Introduce el nuevo ID de la categoría: ");
                        int nuevaCategoriaId = teclado.nextInt();
                        teclado.nextLine();

                        persona.setNombre(nuevoNombre);
                        persona.setApellidos(nuevosApellidos);
                        persona.setTelefono(nuevoTelefono);
                        persona.setCategoriaId(nuevaCategoriaId);

                        persona.actualizarEnBD();
                    }
                    default -> System.out.println("Opción no válida");
                }

                System.out.print("\n¿Deseas realizar otra operación? (s/n): ");
                respuesta = Character.toLowerCase(teclado.next().charAt(0));
            } while (respuesta != 'n');

        } catch (SQLException error) {
            System.out.println("Error al procesar SQL: " + error);
        }

        FachadaPersistencia.desconectar();
    }

    private static void listarCategorias() throws SQLException {
        ArrayList<Categoria> listaCategorias = Categoria.obtenerTodas();
        for (Categoria categoria : listaCategorias) {
            System.out.println(categoria);
        }
    }

    private static void listarPersonas() throws SQLException {
        ArrayList<Persona> listaPersonas = Persona.obtenerTodas();
        for (Persona persona : listaPersonas) {
            System.out.println(persona);
        }
    }
}
