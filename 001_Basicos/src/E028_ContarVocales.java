import java.util.Scanner;
public class E028_ContarVocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una frase: ");
        String frase = sc.nextLine();
        int contador = 0;

        String fraseMinusculas = frase.toLowerCase();

        contador = E028_ContarVocales.contarVocales(fraseMinusculas,contador);

        System.out.println("En <" + frase + "> hay " + contador + " vocales");



    }
   public  static int contarVocales(String frase, int contador){
         for (int i = 0; i < frase.length(); i++) {
                if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i'|| frase.charAt(i) == 'o' || frase.charAt(i) == 'u' ||frase.charAt(i) == 'á' || frase.charAt(i) == 'é' || frase.charAt(i) == 'í'|| frase.charAt(i) == 'ó' || frase.charAt(i) == 'ú') {
                    contador++;
                }
         }
         return contador;
    }
}