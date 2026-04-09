package E866_ExcepcionesEnReloj;

public class OperacionNegativaRelojExcepcion extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public OperacionNegativaRelojExcepcion(String message) {
        super(message);
    }
}
