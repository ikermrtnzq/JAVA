package E81_Frase;
import java.sql.SQLOutput;
public class Principal {
    public static void main(String[] args) {
        Frase frase1 = new Frase();
        Frase frase2 = new Frase("Contenido");
        Frase frase3 = new Frase(4,"MariCarmen");

        System.out.printf("\nCaracter en posicion 5 es: %s",frase2.caracterEn(5));
        System.out.printf("\nLongitud de frase2 : %d\n",frase2.longitud());

        System.out.println("Frases antes de modificaciones: \n");
        System.out.printf("\n|%s|\n|%s|\n|%s|\n", frase1.getFrase(), frase2.getFrase(), frase3.getFrase());

        frase1.anexar("contenido nuevo");
        frase2.anexar("contenido nuevo");
        frase1.recortar(3);

        Frase frase4 = frase2.clone();

        System.out.println("Frases después de modificaciones: \n");
        System.out.printf("\n|%s|\n|%s|\n|%s|\n|%s|\n", frase1.getFrase(), frase2.getFrase(), frase3.getFrase(), frase4.getFrase());

        System.out.printf("\nSe ha clonado la frase correctamente");
        System.out.printf("\nLa frase 2 y 4 %s iguales\n",(frase2.equals(frase4))? "son" : "no son" );
    }
}
