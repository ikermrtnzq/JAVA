import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Ingrese el dividendo: ");
        int dividendo = sc.nextInt();

        String primo = "";

        for (int i = 2; i < dividendo; i++) {
            if (EsDivisible(dividendo, i)) {
                primo = "NO ES";
                break;
            }
            else{
                primo = "ES";
            }
        }
        System.out.println(dividendo +" " + primo + " primo");
    }
    public static boolean EsDivisible(int num1, int num2) {

        if ((num1 % num2) == 0) return true;
        else return false;
    }
}