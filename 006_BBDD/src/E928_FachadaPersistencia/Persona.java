package E928_FachadaPersistencia;

import java.net.InterfaceAddress;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class Persona extends Dato {
    protected String nombre;
    protected String apellidos;
    protected String telefono;
    protected int categoriaId;

    public Persona() {}

    public Persona(int id) throws SQLException {
        setId(id);
        cargarDesdeBD();
    }


    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setApellidos(String apellidos) {this.apellidos = apellidos;}
    public void setTelefono(String telefono) {this.telefono = telefono;}
    public void setCategoriaId(int categoriaId) {this.categoriaId = categoriaId;}

    @Override
    public String toString() {
        return "Persona [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + "]";
    }


    public void crearEnBD() throws SQLException {
        FachadaPersistencia.personaCrear(this);
    }

    public void cargarDesdeBD() throws SQLException {
       FachadaPersistencia.personaCargar(this);
    }

    public void actualizarEnBD() throws SQLException {
        FachadaPersistencia.personaActualizar(this);
    }

    public void eliminarDeBD() throws SQLException {
        FachadaPersistencia.personaEliminar(this);
    }

    public static ArrayList<Persona> obtenerTodas() throws SQLException {
        ArrayList<Persona> listaPersonas = new ArrayList<>();

       listaPersonas = FachadaPersistencia.personaObtenerTodas();
        return listaPersonas;
    }
}