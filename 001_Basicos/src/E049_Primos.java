public class E049_Primos {
    public static boolean esPrimo(int num1, int num2) {
        if (num2 == 1) return false;
        else if ((num1 % num2) == 0) return true;
        else return false;
    }
    public static void main(String[] args) {

       final int numero= 100;
       String[] primos = new String[numero];

       for (int i = 2; i < numero; i++) {
           for (int j = 1; j < i; j++) {
               if (i == 2 || i == 3){
                   primos[i] = "si";
               } else{
                   if (esPrimo(i, j)){
                       primos[i] = "no";
                       break;
                   }else {
                       primos[i] = "si";
                   }
               }
           }
           System.out.format("%d: %s\n", i, primos[i]);
       }

       System.out.printf("----------------\n");

       for (int i = 2; i < numero; i++) {
           if (primos[i].equals("si")){
               System.out.format("%d\n", i);
           }
       }
    }
}
