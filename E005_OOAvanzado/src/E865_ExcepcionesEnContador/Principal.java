package E865_ExcepcionesEnContador;
import java.util.*;

public class Principal {
    public static void main(String[] args) throws ValorFueraDeRangoException {
        Scanner teclado = new Scanner(System.in);

        Contador contador = new Contador();

        try {
            contador.setValor(5);
        } catch (ValorFueraDeRangoException e) {
        }

        char respuestaUsuario = ' ';

        while (respuestaUsuario != 's') {
            System.out.println(contador);
            System.out.print("Usuario, di algo: ");
            respuestaUsuario = teclado.next().charAt(0);
            if (respuestaUsuario == 'i') {
                try {
                    contador.incrementar();
                } catch (ValorFueraDeRangoException e) {
                    System.out.println("Ya has llegado al tope. No se puede incrementar más.");
                }
            } else if (respuestaUsuario == 'd') {
                try {
                    contador.decrementar();
                } catch (ValorFueraDeRangoException e) {
                    System.out.println("Ya has llegado al mínimo. No se puede bajar del 0.");
                }
            }
        }
    }
}