package E928_FachadaPersistencia;

import java.sql.*;

public class ConexionBD {
	private static final String URL = "jdbc:mysql://localhost:3306/agenda";
	private static final String USER = "root";
	private static final String PASSWORD = "root";

	private Connection conexion;

	public void conectar() throws SQLException {
		 conexion = DriverManager.getConnection(URL, USER, PASSWORD);
	}

	public void desconectar() {
		try{
			if (conexion != null){
				conexion.close();
			}
		}catch (Exception error){
			System.out.println("Error porducido al desconectar la base de datos: " + error);
		}
	}

	public PreparedStatement prepareStatement(String sql) throws SQLException {
		return conexion.prepareStatement(sql);
	}

	public ResultSet ejecutarConsulta(PreparedStatement preparedStatement) throws SQLException {
		return preparedStatement.executeQuery();
	}

	public void ejecutarActualizacion(PreparedStatement preparedStatement) throws SQLException {
		preparedStatement.executeUpdate();
	}
}