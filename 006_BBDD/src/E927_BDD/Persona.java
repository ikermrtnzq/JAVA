package E927_BDD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

public class Persona extends  Dato{
    protected String nombre;
    protected String apellidos;
    protected int edad;
    protected int telefono;
    protected int idCategoria;

    public Persona() {}
    public Persona(String nombre) {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public static ArrayList<Categoria> obtenerTodas() {
        ConexionBD conexionBD = new	ConexionBD();
        conexionBD.conectar();

        PreparedStatement ps;
        ResultSet rs;

        try {
            ps = conexionBD.prepareStatement("SELECT * FROM persona");
            rs = conexionBD.ejecutarConsulta(ps);

            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("nombre") +" " + rs.getString("apellidos"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void crearEnBD() {
        ConexionBD conexionBD = new	ConexionBD();
        conexionBD.conectar();

        PreparedStatement ps;
        ResultSet rs;

        try{
            ps = conexionBD.prepareStatement("INSERT INTO persona(nombre, apellidos, telefono, categoriaId, edad) VALUES (?, ?, ?, ?, ?)");

            ps.setString(1, getNombre());
            ps.setString(2, getApellidos());
            ps.setInt(3, getTelefono());
            ps.setInt(4, getIdCategoria());
            ps.setInt(5, getEdad());

            conexionBD.ejecutarActualizacion(ps);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void cargarDesdeBD() {
        ConexionBD conexionBD = new	ConexionBD();
        conexionBD.conectar();

        PreparedStatement ps;
        ResultSet rs;

        try {
            ps = conexionBD.prepareStatement("SELECT * FROM persona WHERE id = ?");

            ps.setInt(1,getId());

            rs = conexionBD.ejecutarConsulta(ps);

            while (rs.next()) {
                System.out.println(rs.getString("id") + "  " + rs.getString("nombre") + "  " + rs.getString("apellidos"));
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void actualizarEnBD() {
        ConexionBD conexionBD = new	ConexionBD();
        conexionBD.conectar();

        PreparedStatement ps;
        ResultSet rs;

        try {
            ps = conexionBD.prepareStatement("UPDATE persona SET nombre = ? WHERE id = ?");

            ps.setString(1, getNombre());

            ps.setInt(2, getId());

            conexionBD.ejecutarActualizacion(ps);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void eliminarDeBD() {
        ConexionBD conexionBD = new	ConexionBD();
        conexionBD.conectar();

        PreparedStatement ps;
        ResultSet rs;

        try {
            ps = conexionBD.prepareStatement("DELETE FROM persona WHERE id = ?");

            ps.setInt(1, getId());

            conexionBD.ejecutarActualizacion(ps);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}
