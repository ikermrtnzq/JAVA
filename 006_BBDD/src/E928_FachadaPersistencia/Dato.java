package E928_FachadaPersistencia;

import java.sql.SQLException;

public abstract class Dato {
	protected int id;

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public abstract void crearEnBD() throws SQLException;
	public abstract void cargarDesdeBD() throws SQLException;
	public abstract void actualizarEnBD() throws SQLException;
	public abstract void eliminarDeBD() throws SQLException;
}