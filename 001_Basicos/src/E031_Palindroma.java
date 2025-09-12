import java.util.Scanner;
public class E031_Palindroma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una frase para saber si es palindroma: ");
        String frase = sc.nextLine();

        frase = frase.toLowerCase();

        frase = frase = frase.replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
        boolean palindroma = E031_Palindroma.esPalindroma(frase);

        if (palindroma) {
            System.out.println("La frase introducida es Palindroma");
        }else {
            System.out.println("La frase introducida no es Palindroma");
        }
    }
    public static boolean esPalindroma(String frase) {
        String invertida = "";
        String fraseSinEspacios = "";
        String fraseSinEspaciosSinSimbolos= "";
        String fraseSinEspaciosSinSimbolosSinTildes = "";

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' ') {
                fraseSinEspacios = fraseSinEspacios + frase.charAt(i);
            }
        }

        /* for (int i = 0; i < frase.length(); i++) {

           //Este switch no he conseguido que funcione pero se que así es como detecto una vocal con tilde
           // y la sustituyo po la equivalente sin tilde

             switch (frase.charAt(i)){
                    case 'á':
                        frase.charAt(i).setCharAt (i, 'a');
                        break;
                    case 'é':
                        fraseSinEspaciosSinSimbolosSinTildes += 'e';
                        System.out.println(fraseSinEspaciosSinSimbolos.charAt(i));
                        break;
                    case 'í':
                        fraseSinEspaciosSinSimbolosSinTildes += 'i';
                        System.out.println(fraseSinEspaciosSinSimbolos.charAt(i));
                        break;
                    case 'ó':
                        fraseSinEspaciosSinSimbolosSinTildes += 'o';
                        System.out.println(fraseSinEspaciosSinSimbolos.charAt(i));
                        break;
                    case 'ú':
                        fraseSinEspaciosSinSimbolosSinTildes += 'u';
                        System.out.println(fraseSinEspaciosSinSimbolos.charAt(i));
                        break;
                    default:
                        fraseSinEspaciosSinSimbolosSinTildes = fraseSinEspaciosSinSimbolosSinTildes + fraseSinEspaciosSinSimbolos.charAt(i);
                        System.out.println(fraseSinEspaciosSinSimbolos.charAt(i));
                        break;
                }
       }*/

        for (int i= 0; i < fraseSinEspacios.length(); i++) {
            if (fraseSinEspacios.charAt(i) >= 'a' && fraseSinEspacios.charAt(i) <= 'z'){
                fraseSinEspaciosSinSimbolos = fraseSinEspaciosSinSimbolos + fraseSinEspacios.charAt(i);
            }
        }



        for (int i = fraseSinEspaciosSinSimbolos.length()-1 ; i >= 0; i--) {
                invertida = invertida + fraseSinEspaciosSinSimbolos.charAt(i);
        }

        boolean palindroma = false;

        if (invertida.equals(fraseSinEspaciosSinSimbolos)) {
            palindroma = true;
        }
        return palindroma;
    }
}