import java.util.Scanner;


public class E016_Olas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Indique el número de olas: ");
        int numeroOlas = sc.nextInt();
        System.out.printf("Indique la amplitud de estas: ");
        int amplitudOlas = sc.nextInt();

        oleaje(numeroOlas, amplitudOlas);

    }

    public static int oleaje(int numOlas, int amplitudOlas) {

        int numOlasHechas = 1;
        String amplitudOlasHechas = "";

        do{
            for (int i = 1; i <= amplitudOlas; i++){
                amplitudOlasHechas =  amplitudOlasHechas + "*";
                System.out.println(amplitudOlasHechas);

                if (i == amplitudOlas){
                    for (int j = 1; j <= amplitudOlas; j++){
                        amplitudOlasHechas = amplitudOlasHechas.substring(0, amplitudOlasHechas.length() - 1);
                        System.out.println(amplitudOlasHechas);
                    }
                }
            }
            numOlasHechas++;
        }while(numOlas >= numOlasHechas);
        return numOlas;
    }
}


