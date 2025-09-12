import java.util.Scanner;
public class E030_FraseInvertida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una frase: ");
        String frase = sc.nextLine();

        for (int i = frase.length() -1 ; i >= 0; i--) {

            System.out.print(frase.charAt(i));

        }
    }
}