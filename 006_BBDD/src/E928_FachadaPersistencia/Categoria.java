package E928_FachadaPersistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Categoria extends Dato {
	protected String nombre;

	public Categoria() {}
	
	public Categoria(int id) throws SQLException {
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

	public void crearEnBD() throws SQLException {
		FachadaPersistencia.categoriaCrear(this);
	}

	public void cargarDesdeBD() throws SQLException {
		FachadaPersistencia.categoriaObtenerPorId(getId());
	}

	public void actualizarEnBD() throws SQLException {
		FachadaPersistencia.categoriaActualizar(this);

	}

	public void eliminarDeBD() throws SQLException {
		FachadaPersistencia.categoriaEliminar(this);
	}


	public void eliminarPorNombre() throws SQLException {
		FachadaPersistencia.categoriaEliminarPorNombre(getNombre());
	}


	public static ArrayList<Categoria> obtenerTodas() throws SQLException {
		ArrayList<Categoria> lista = new ArrayList<>();

		lista = FachadaPersistencia.categoriaObtenerTodas();

		return lista;
	}
}
