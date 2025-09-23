package E928_FachadaPersistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FachadaPersistencia {
	private static ConexionBD conexionBD;

	public static void conectar() {
		if (conexionBD == null) {
			conexionBD = new ConexionBD();

            try {
                conexionBD.conectar();
            } catch (SQLException e) {
                throw new RuntimeException("Error al conectar con la BD: " + e);
            }
        }
	}
	
	public static void desconectar() {
		conexionBD.desconectar();
	}


	public static void categoriaCrear(Categoria categoria) {
        try {
			PreparedStatement ps = conexionBD.prepareStatement( "INSERT INTO categoria (nombre) VALUES (?)");
			ps.setString(1, categoria.getNombre());

			conexionBD.ejecutarActualizacion(ps);

			// Acude de nuevo a la BD a preguntar cuál es el "id" que se ha autogenerado,
			// y lo asigna en el campo id del objeto.
			ResultSet rs = ps.getGeneratedKeys();
			rs.next();
			categoria.setId(rs.getInt(1)); // El 1 indica que queremos obtener el valor del primer (y único) campo que ha venido.
		} catch (SQLException e) {
			throw new RuntimeException("Error al actualizar categoría en la BD: " + e);
		}
	}

	public static Categoria categoriaObtenerPorId(int id) {
		try {
			Categoria categoria = new Categoria();
			categoria.setId(id);

			PreparedStatement ps = conexionBD.prepareStatement("SELECT id, nombre FROM categoria WHERE id = ?");
			ps.setInt(1, categoria.getId());

			//Parte encargada de "ejecutar la consulta y procesarla"
			ResultSet rs = conexionBD.ejecutarConsulta(ps);
			rs.next();
			categoria.setNombre(rs.getString("nombre"));

			return categoria;
		} catch (SQLException e) {
			throw new RuntimeException("Error al actualizar categoría en la BD: " + e);
		}
	}

	public static ArrayList<Categoria> categoriaObtenerTodas() {
		ArrayList<Categoria> resultado = new ArrayList();

		try{
			PreparedStatement ps = conexionBD.prepareStatement("SELECT id, nombre FROM categoria ORDER BY nombre");

			//"Procesarla"
			ResultSet rs = conexionBD.ejecutarConsulta(ps);
			while (rs.next()) {
				//Procesamos cada uno de los registros, de los cuales obtendremos una categoria, la cual procesadores y creamos un objeto de esta
				Categoria categoria = new Categoria();
				categoria.setId(rs.getInt("id"));
				categoria.setNombre(rs.getString("nombre"));

				//Al terminar la añadiremos a la lista de todas las categorias
				resultado.add(categoria);
			}
		}catch (SQLException e){
			throw new RuntimeException("Error al actualizar categoría en la BD: " + e);
		}

		return resultado;
	}

	public static void categoriaActualizar(Categoria categoria) {
		try{
			PreparedStatement ps = conexionBD.prepareStatement("UPDATE categoria SET nombre = ? WHERE id = ?");
			ps.setString(1, categoria.getNombre());
			ps.setInt(2, categoria.getId());
			conexionBD.ejecutarActualizacion(ps);

		}catch (SQLException e){
			throw new RuntimeException("Error al actualizar categoría en la BD: " + e);
		}

	}
		
	public static void categoriaEliminar(Categoria categoria) {
		try{
			PreparedStatement ps = conexionBD.prepareStatement("DELETE FROM categoria WHERE id = ?");
			ps.setInt(1, categoria.getId());
			conexionBD.ejecutarActualizacion(ps);

		} catch (SQLException e) {
			throw new RuntimeException("Error al actualizar categoría en la BD: " + e);
		}
	}

	public static void  categoriaEliminarPorNombre(String nombre) {
		try{
			Categoria categoria = new Categoria();
			categoria.setNombre(nombre);

			PreparedStatement ps = conexionBD.prepareStatement("DELETE FROM categoria WHERE nombre = ?");
			ps.setString(1, nombre);
			conexionBD.ejecutarActualizacion(ps);

		}catch (SQLException e){
			throw new RuntimeException("Error al actualizar categoría en la BD: " + e);
		}
	}



	public static void personaCrear(Persona persona) {
		try{
			PreparedStatement ps = conexionBD.prepareStatement("INSERT INTO persona (nombre, apellidos, telefono, categoriaId) VALUES (?, ?, ?, ?)");
			ps.setString(1, persona.getNombre());
			ps.setString(2, persona.apellidos);
			ps.setString(3, persona.telefono);
			ps.setInt(4, persona.categoriaId);

			conexionBD.ejecutarActualizacion(ps);

			// Acude de nuevo a la BD a preguntar cuál es el "id" que se ha autogenerado,
			// y lo asigna en el campo id del objeto.
			ResultSet rs = ps.getGeneratedKeys();
			rs.next();
			persona.setId(rs.getInt(1)); // El 1 indica que queremos obtener el valor del primer (y único) campo que ha venido.

		}catch (SQLException e){
			throw new RuntimeException("Error al actualizar persona en la BD: " + e);
		}
	}

	public static void personaCargar(Persona persona) {
		try{
			PreparedStatement ps = conexionBD.prepareStatement("SELECT id, nombre, apellidos, telefono, categoriaId FROM persona WHERE id = ?");
			ps.setInt(1, persona.getId());

			ResultSet rs = conexionBD.ejecutarConsulta(ps);
			if (rs.next()) {
				persona.setNombre(rs.getString("nombre"));
				persona.setApellidos(rs.getString("apellidos"));
				persona.setTelefono(rs.getString("telefono"));
				persona.setCategoriaId(rs.getInt("categoriaId"));
			}

		}catch (SQLException e){
			throw new RuntimeException("Error al actualizar persona en la BD: " + e);
		}

	}

	public static void personaActualizar(Persona persona) {
		try{
			PreparedStatement ps = conexionBD.prepareStatement("UPDATE persona SET nombre = ?, apellidos = ?, telefono = ?, categoriaId = ? WHERE id = ?");
			ps.setString(1, persona.nombre);
			ps.setString(2, persona.apellidos);
			ps.setString(3, persona.telefono);
			ps.setInt(4, persona.categoriaId);
			ps.setInt(5, persona.id);

			conexionBD.ejecutarActualizacion(ps);
		}catch (SQLException e){
			throw new RuntimeException("Error al actualizar persona en la BD: " + e);
		}
	}
	public static void personaEliminar(Persona persona) {
		try{
			PreparedStatement ps = conexionBD.prepareStatement("DELETE FROM persona WHERE id = ?");
			ps.setInt(1, persona.getId());

			conexionBD.ejecutarActualizacion(ps);
		}catch (SQLException e){
			throw new RuntimeException("Error al actualizar persona en la BD: " + e);
		}
	}

	public static ArrayList<Persona> personaObtenerTodas() {
		ArrayList<Persona> personas = new ArrayList<>();

		try{
			PreparedStatement ps = conexionBD.prepareStatement("SELECT id, nombre, apellidos, telefono, categoriaId FROM persona ORDER BY nombre");

			ResultSet rs = conexionBD.ejecutarConsulta(ps);
			while (rs.next()) {
				Persona persona = new Persona();
				persona.setId(rs.getInt("id"));
				persona.setNombre(rs.getString("nombre"));
				persona.setApellidos(rs.getString("apellidos"));
				persona.setTelefono(rs.getString("telefono"));
				persona.setCategoriaId(rs.getInt("categoriaId"));

				personas.add(persona);
			}
		}catch (SQLException e){
			throw new RuntimeException("Error al actualizar persona en la BD: " + e);
		}
		return personas;
	}
}