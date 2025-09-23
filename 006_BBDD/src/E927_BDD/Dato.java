package E927_BDD;

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
	public abstract void cargarDesdeBD();
	public abstract void actualizarEnBD();
	public abstract void eliminarDeBD() throws SQLException;
}