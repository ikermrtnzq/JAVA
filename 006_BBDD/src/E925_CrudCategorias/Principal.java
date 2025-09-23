package E925_CrudCategorias;

import java.util.*;
import java.sql.*;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Connection conn = null;
        PreparedStatement ps = null;
        Statement stmt = null;

        String url = "jdbc:mysql://localhost:3306/agenda";
        String usu = "root";
        String pwd = "";


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(url, usu, pwd);
            stmt = conn.createStatement();

            System.out.println("Escoja una opcion : ");
            System.out.printf("1) Lista de Categorias\n2)Insertar nueva categoria\n3)Eliminar categoria\n4)Modificar una categoria\n");
            int opcion = sc.nextInt();

            if (opcion == 1) {

                String listarCategorias = "SELECT * FROM categoria ORDER BY nombre  ";
                ps = conn.prepareStatement(listarCategorias);

                ResultSet resultSetCategorias = stmt.executeQuery(listarCategorias);

                System.out.println("\nLista de categorias: ");
                while (resultSetCategorias.next()) {
                    String nombre = resultSetCategorias.getString("nombre"); // Cambia 'nombre' por el nombre de la columna
                    System.out.printf(" - %s\n",nombre);
                }
            } else if (opcion == 2) {
                String insertarCategoria = "INSERT INTO categoria(nombre) VALUES (?)";
                ps = conn.prepareStatement(insertarCategoria);

                System.out.printf("Introduzca el nombre del categoria: ");
                ps.setString(1, sc.next());

                int categoryInserted = ps.executeUpdate();
                System.out.println("Categorias insertadas: " + categoryInserted);

            }else if (opcion == 3) {
                System.out.println("¿Quieres elimianarla por 1)NOM o 2)ID?");
                int opcion2 = sc.nextInt();

                if(Objects.equals(opcion2, 1)){
                    String eliminarCategoria = "DELETE FROM categoria WHERE nombre = ?";
                    ps = conn.prepareStatement(eliminarCategoria);

                    System.out.printf("Introduzca el nombre de la categoria: ");
                    String nombre = sc.next();

                    ps.setString(1,nombre);

                    int categoryDeleted = ps.executeUpdate();
                    System.out.println("Categoria eliminada: " + categoryDeleted);
                }else {
                    String eliminarCategoria = "DELETE FROM categoria WHERE id = ?";
                    ps = conn.prepareStatement(eliminarCategoria);

                    System.out.printf("Introduzca el id de la categoria: ");
                    int id = Integer.parseInt(sc.next());

                    ps.setInt(1, id);

                    int categoryDeleted = ps.executeUpdate();
                    System.out.println("Categoria eliminada: " + categoryDeleted);
                }

            }else if (opcion == 4) {
                String modificarCategoria = "UPDATE categoria SET nombre = ? WHERE id = ?";
                ps = conn.prepareStatement(modificarCategoria);

                System.out.printf("Introduzca el id de la categoria: ");
                int id = Integer.parseInt(sc.next());
                ps.setInt(2, id);

                System.out.printf("Introduzca el nuevo nombre de la categoria : ");
                ps.setString(1, sc.next());

                int categoryUpdated = ps.executeUpdate();
                System.out.println("Categoria actualizada: " + categoryUpdated);
            }
        }catch (ClassNotFoundException e) {
            System.out.println("Controlador no encontrado: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
        } finally {
            try {
                if (ps != null) ps.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar recursos: " + e.getMessage());
            }
        }
    }
}
