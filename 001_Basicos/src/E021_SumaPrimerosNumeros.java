import java.util.Scanner;
public class E021_SumaPrimerosNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número mayor a 0: ");
        int num = sc.nextInt();

        int suma = 0;
        if (num < 0){
            do {
                System.out.println("Perdona, has introducido un número no valido");
                num = sc.nextInt();
            }while (num <= 0);
        }else{
            System.out.println("Te mostrare la suma de sus anteriores números ");
            for (int i = 0; i <= num ; i++) {
                suma = suma + i;
            }
        }
        System.out.println("El resultado de la suma de los números anteriores de " + num + " = " +suma);
    }
}