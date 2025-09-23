package E927_BDD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

public class Categoria extends Dato {
	protected String nombre;

	public Categoria() {
	}
	
	public Categoria(int id) {
		setId(id);

		cargarDesdeBD();
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String toString() {
		return  "Categoria [id=" + id + ", nombre=" + nombre + "]";
	}

	public void crearEnBD()  {
		ConexionBD conexionBD = new	ConexionBD();
		conexionBD.conectar();

		PreparedStatement ps;
		ResultSet rs;

		try{
			ps = conexionBD.prepareStatement("INSERT INTO categoria(nombre) VALUES (?)");
			ps.setString(1, getNombre());

			conexionBD.ejecutarActualizacion(ps);
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

	public void cargarDesdeBD() {
		ConexionBD conexionBD = new	ConexionBD();
		conexionBD.conectar();

		PreparedStatement ps;
		ResultSet rs;

		try{
			ps = conexionBD.prepareStatement("SELECT * FROM categoria WHERE id = ?");
			ps.setInt(1, getId());

			rs = conexionBD.ejecutarConsulta(ps);
			while (rs.next()) {
				System.out.println(rs.getString("id") + " - " + rs.getString("nombre"));
			}

		}catch(SQLException e){
			e.printStackTrace();
		}

	}

	public void actualizarEnBD() {
		ConexionBD conexionBD = new	ConexionBD();
		conexionBD.conectar();

		PreparedStatement ps;
		ResultSet rs;

		try {

			ps = conexionBD.prepareStatement("UPDATE categoria SET nombre = ? WHERE id = ?");


			ps.setString(1, getNombre());
			ps.setInt(2, getId());

			conexionBD.ejecutarActualizacion(ps);

			System.out.println();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}


	}

	public void eliminarDeBD() {
		ConexionBD conexionBD = new	ConexionBD();
		conexionBD.conectar();

		PreparedStatement ps;
		ResultSet rs;

		try{
			ps = conexionBD.prepareStatement("DELETE FROM categoria WHERE id = ?");
			ps.setInt(1, getId());

			conexionBD.ejecutarActualizacion(ps);
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}

	public static ArrayList<Categoria> obtenerTodas() {
		ConexionBD conexionBD = new	ConexionBD();
		conexionBD.conectar();

		PreparedStatement ps;
		ResultSet rs;

		try{
			ps = conexionBD.prepareStatement("SELECT * FROM categoria");

			ArrayList<String> categorias = new ArrayList<>();
			StringBuilder categoriasParaMostrar = new StringBuilder();

			rs = conexionBD.ejecutarConsulta(ps);

			while (rs.next()) {
				categorias.add(rs.getString("nombre"));
				categoriasParaMostrar.append(rs.getInt("id") + " - " + rs.getString("nombre") + "\n");
			}

			Collections.sort(categorias);
			System.out.println(categorias);

		}catch (SQLException e){
			e.printStackTrace();
		}
        return null;
    }
}
