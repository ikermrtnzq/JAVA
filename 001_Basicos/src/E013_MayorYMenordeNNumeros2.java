import java.util.Scanner;
public class E013_MayorYMenordeNNumeros2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la cantidad de úmeros que quieras introducir");
        int numero = sc.nextInt();
        int numeroMenor = 0;
        int numeroMayor = 0;

        for (int i = 1; i <= numero; i++) {
            System.out.format("Introduzca el numero %d : ", i);
            int numeroIntroducido = sc.nextInt();

            if (i == 1){
                numeroMayor = numeroIntroducido;
                numeroMenor = numeroIntroducido;
            }

            if (numeroIntroducido < numeroMenor) {
                numeroMenor = numeroIntroducido;
            }else if (numeroIntroducido > numeroMayor) {
                numeroMayor = numeroIntroducido;
            }
        }
        System.out.format("El numero mayor de la cantidad es: %d, y el menor es: %d", numeroMayor, numeroMenor);
    }
}