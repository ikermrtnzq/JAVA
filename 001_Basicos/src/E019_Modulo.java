
public class E019_Modulo {
    public static void main(String[] args) {

        int contadorDivisor5 = 0;
        String divisible7 = "";

        for (int i = 0; i <= 50; i++) {

            if (i % 5 == 0) contadorDivisor5 = 0;

            if (i % 7 == 0) divisible7 = "SI";
            else divisible7 = "NO";

            System.out.println("Vamos por el número "+i+"     "+i+" % 5 =" + contadorDivisor5 + "    " + i +" "+ divisible7 + " es multiplo de 7");
            contadorDivisor5++;
        }
    }
}