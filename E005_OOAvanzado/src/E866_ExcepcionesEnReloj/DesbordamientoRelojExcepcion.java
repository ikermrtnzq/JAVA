package E866_ExcepcionesEnReloj;

public class DesbordamientoRelojExcepcion extends RuntimeException {
  private static final long serialVersionUID = 1L;

  boolean superior;

  public boolean isSuperior() {
    return superior;
  }

  public void setSuperior(boolean superior) {
    this.superior = superior;
  }

  public DesbordamientoRelojExcepcion(String message, boolean superior) {
    super(message);
    this.superior = superior;
  }
}
