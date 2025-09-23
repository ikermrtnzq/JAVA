package E926_AgendaConConexionBD2;

import java.sql.*;
import java.util.*;

public class Principal {
    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);

        ConexionBD conexionBD = new ConexionBD();
        conexionBD.conectar();

        PreparedStatement ps;
        ResultSet rs;

        StringBuilder categoriasParaMostrar = null;

        int opcion = 0;
        char continuar = 'a';
        String menu = """
                    1) Listar todas las categorías que hay\n
                    2) Insertar una categoría nueva\n
                    3) Modificar una categoria\n
                    4) Eliminar una categoria\n
                    5) Obtener una categoria\n
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

                ps = conexionBD.prepareStatement("SELECT * FROM categoria");

                ArrayList<String> categorias = new ArrayList<>();
                categoriasParaMostrar = new StringBuilder();

                rs = conexionBD.ejecutarConsulta(ps);

                while (rs.next()) {
                    categorias.add(rs.getString("nombre"));
                    categoriasParaMostrar.append(rs.getInt("id") + " - " + rs.getString("nombre") + "\n");
                }

                Collections.sort(categorias);
                System.out.println(categorias);

            } else if (opcion == 2) {
                System.out.printf("\n\n");

                System.out.println("\nInsertando una categoría nueva.\nIntroduce el nombre de la nueva categoria: ");

                ps = conexionBD.prepareStatement("INSERT INTO categoria(nombre) VALUES (?)");
                ps.setString(1, entrada.next());

                conexionBD.ejecutarActualizacion(ps);

                System.out.println();


            } else if (opcion == 3) {
                System.out.printf("\n\n");

                System.out.println("\nEliminando una categoria.\nIntroduce el id de la categoria: ");

                ps = conexionBD.prepareStatement("DELETE FROM categoria WHERE id = ?");
                ps.setInt(1, entrada.nextInt());

                conexionBD.ejecutarActualizacion(ps);

                System.out.println();


            } else if (opcion == 4) {
                System.out.printf("\n\n");

                System.out.println("\nModificar una categoria\n");

                ps = conexionBD.prepareStatement("SELECT * FROM categoria WHERE id = ?");

                System.out.println("Introduce el id de la categoria: ");
                int idCategoriaModificar = entrada.nextInt();
                ps.setInt(1, idCategoriaModificar);

                rs = conexionBD.ejecutarConsulta(ps);

                String nombreAntes = "";
                while (rs.next()) {
                    nombreAntes = rs.getString("nombre");
                }

                ps = conexionBD.prepareStatement("UPDATE categoria SET nombre = ? WHERE id = ?");

                String nuevoNombre;
                while (true) {
                    System.out.println("Introduce un nuevo nombre: ");
                    nuevoNombre = entrada.next();

                    if (!nuevoNombre.equals(nombreAntes)) break;

                    System.out.println("El nuevo nombre es igual al que ya tiene.");
                }

                ps.setString(1, nombreAntes);
                ps.setInt(2, idCategoriaModificar);

                conexionBD.ejecutarActualizacion(ps);

                System.out.println();


            } else if (opcion == 5) {
                System.out.printf("\n\n");

                System.out.println("\nObtener una categoria.\n");

                ps = conexionBD.prepareStatement("SELECT * FROM categoria WHERE id = ?");

                System.out.println("Introduce el id de la categoria: ");
                ps.setInt(1, entrada.nextInt());

                rs = conexionBD.ejecutarConsulta(ps);

                while (rs.next()) {
                    System.out.println(rs.getString("id") + " - " + rs.getString("nombre"));
                }

                System.out.println();


            } else if (opcion == 6) {
                System.out.printf("\n\n");

                System.out.println("\nListar personas.\n");

                ps = conexionBD.prepareStatement("SELECT * FROM persona");
                rs = conexionBD.ejecutarConsulta(ps);

                while (rs.next()) {
                    System.out.println(rs.getInt("id") + " - " + rs.getString("nombre") + rs.getString("apellidos"));
                }

                System.out.println();


            } else if (opcion == 7) {
                System.out.printf("\n\n");

                System.out.println("\nObtener una persona.\n");

                System.out.println("Introduce el id de la persona: ");
                ps = conexionBD.prepareStatement("SELECT * FROM persona WHERE id = ?");

                ps.setInt(1, entrada.nextInt());

                rs = conexionBD.ejecutarConsulta(ps);

                while (rs.next()) {
                    System.out.println(rs.getString("id") + " - " + rs.getString("nombre") + " - " + rs.getString("apellidos") + " - " + rs.getString("edad"));
                }

                System.out.println();


            } else if (opcion == 8) {
                System.out.printf("\n\n");

                System.out.println("\nInsertar una persona.\n");

                ps = conexionBD.prepareStatement("INSERT INTO persona(nombre, apellidos, telefono, categoriaId, edad) VALUES (?, ?, ?, ?, ?)");

                System.out.println("Introduce su nombre: ");
                ps.setString(1, entrada.next());

                System.out.println("Introduce sus apellidos: ");
                ps.setString(2, entrada.next());

                System.out.println("Introduce su número de telefono: ");
                ps.setString(3, entrada.next());

                System.out.println("Categorias: \n" + categoriasParaMostrar + "\nIntroduce el id de su categoria: ");
                ps.setInt(4, entrada.nextInt());

                System.out.println("Introduce su edad: ");
                ps.setInt(5, entrada.nextInt());

                conexionBD.ejecutarActualizacion(ps);

                System.out.println();


            } else if (opcion == 9) {
                System.out.printf("\n\n");

                System.out.println("\nElimina una persona.\nIntroduce el id de la persona: ");

                ps = conexionBD.prepareStatement("DELETE FROM persona WHERE id = ?");

                ps.setInt(1, entrada.nextInt());

                conexionBD.ejecutarActualizacion(ps);

                System.out.println();


            } else if (opcion == 10) {
                System.out.printf("\n\n");

                System.out.println("\nModificar una persona.\n");

                ps = conexionBD.prepareStatement("UPDATE persona SET edad = ? WHERE id = ?");

                System.out.println("Introduce la edad de la persona: ");
                ps.setInt(1, entrada.nextInt());

                System.out.println("Introduce el id de la persona: ");
                ps.setInt(2, entrada.nextInt());

                conexionBD.ejecutarActualizacion(ps);

                System.out.println();

            }
            System.out.printf("\n¿Quieres continuar? (S/N) ");
            continuar = entrada2.next().toLowerCase().charAt(0);
        }
        conexionBD.desconectar();
    }
}
