package E924_PruebaConceptoBBDD;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
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

            String sql1 = "SELECT * FROM categoria";
            ps = conn.prepareStatement(sql1);
            ResultSet resultSetCategorias = stmt.executeQuery(sql1);

            while (resultSetCategorias.next()) {
                int id = resultSetCategorias.getInt("id"); // Cambia 'id' por el nombre de la columna en tu tabla
                String nombre = resultSetCategorias.getString("nombre"); // Cambia 'nombre' por el nombre de la columna
                System.out.println("ID: " + id + ", Nombre: " + nombre);
            }

            System.out.println();

            String sql2 = "SELECT * FROM persona";
            ps = conn.prepareStatement(sql2);
            ResultSet resultSetPersonas = stmt.executeQuery(sql2);

            while (resultSetPersonas.next()) {
                int id = resultSetPersonas.getInt("id"); // Cambia 'id' por el nombre de la columna en tu tabla
                String nombre = resultSetPersonas.getString("nombre"); // Cambia 'nombre' por el nombre de la columna
                System.out.println("ID: " + id + ", Nombre: " + nombre);
            }

            System.out.println();

            String sql = "INSERT INTO persona(nombre, apellidos, telefono, estrella, categoriaId, Edad) VALUES (?, ?, ?, ?, ?, ?)";
            ps = conn.prepareStatement(sql);

            ps.setString(1, "Henry");
            ps.setString(2, "Talavera");
            ps.setInt(3, 686323356);
            ps.setInt(4, 14);
            ps.setInt(5, 11);
            ps.setInt(6, 22);


            int rowsInserted = ps.executeUpdate();
            System.out.println("Filas insertadas: " + rowsInserted);

            // Consulta para insertar una nueva categoría
            String insertSQL = "INSERT INTO categoria (id, nombre) VALUES (?, ?)"; // Cambia 'categorias', 'id' y 'nombre' según tu tabla
            ps = conn.prepareStatement(insertSQL);

            // Establecer los valores de los parámetros
            ps.setInt(1, 10); // ID de la categoría (ejemplo: 1)
            ps.setString(2, "Aliens"); // Nombre de la categoría (ejemplo: "Nueva Categoría")

            int categoryInserted = ps.executeUpdate();
            System.out.println("Filas insertadas: " + categoryInserted);

            // Eliminar una categoría
            String deleteCategorySQL = "DELETE FROM categoria WHERE id = ?"; // Cambia 'categorias' y 'id' según tu tabla
            ps = conn.prepareStatement(deleteCategorySQL);
            ps.setInt(1, 3); // ID de la categoría a eliminar (ejemplo: 1)

            int categoryDeleted = ps.executeUpdate();
            System.out.println("Filas eliminadas: " + categoryDeleted);

            // Eliminar una persona
            String deletePersonSQL = "DELETE FROM persona WHERE id = ?"; // Cambia 'personas' y 'id' según tu tabla
            ps = conn.prepareStatement(deletePersonSQL);
            ps.setInt(1, 3); // ID de la persona a eliminar (ejemplo: 1)

            int personDeleted = ps.executeUpdate();
            System.out.println("Filas borradas: " + personDeleted);

            // Modificar el nombre de una categoría
            String updateCategorySQL = "UPDATE categoria SET nombre = ? WHERE id = ?"; // Cambia 'categorias' y 'id' según tu tabla
            ps = conn.prepareStatement(updateCategorySQL);
            ps.setString(1, "Demogorgones"); // Nuevo nombre de la categoría
            ps.setInt(2, 10); // ID de la categoría a modificar (ejemplo: 1)

            int categoryModified = ps.executeUpdate();
            System.out.println("Filas modificadas: " + categoryModified);

            // Modificar la edad de una persona
            String updatePersonSQL = "UPDATE persona SET edad = ? WHERE id = ?"; // Cambia 'personas' y 'id' según tu tabla
            ps = conn.prepareStatement(updatePersonSQL);
            ps.setInt(1, 30); // Nueva edad de la persona (ejemplo: 30)
            ps.setInt(2, 1); // ID de la persona a modificar (ejemplo: 1)

            int ageModified = ps.executeUpdate();
            System.out.println("Filas modificadas: " + ageModified);

        } catch (ClassNotFoundException e) {
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