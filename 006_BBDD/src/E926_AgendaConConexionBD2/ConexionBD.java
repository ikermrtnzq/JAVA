package E926_AgendaConConexionBD2;

import java.sql.*;

public class ConexionBD {
	private Connection conexion;

	public void conectar() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/agenda";
			String usuario = "root";
			String contrasenna = ""; // O lo que sea.

			conexion = DriverManager.getConnection(url, usuario, contrasenna);
		} catch (ClassNotFoundException e) {
			System.out.println("Error al conectar con la base de datos: " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Error al ejecutar la conexión: " + e.getMessage());
		}
	}

	public void desconectar() {
		try {
			conexion.close();
		} catch (SQLException e) {
			System.out.println("Error al desconectar con la base de datos: " + e.getMessage());
		}
	}

	public PreparedStatement prepareStatement(String sql) {
		try {
			PreparedStatement ps = conexion.prepareStatement(sql);
			return ps;
		} catch (SQLException e) {
			System.out.println("Error al crear el preparedStatement: " + e.getMessage());
			return null;
		}
	}

	public ResultSet ejecutarConsulta(PreparedStatement preparedStatement) {
		try {
			return preparedStatement.executeQuery();
		} catch (SQLException e) {
			System.out.println("Error al ejecutar consulta: " + e.getMessage());
			return null;
		}
	}

	public void ejecutarActualizacion(PreparedStatement preparedStatement) {
		try {
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Error al ejecutar consulta: " + e.getMessage());
		}
	}
}
