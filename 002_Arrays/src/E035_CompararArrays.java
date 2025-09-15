public class E035_CompararArrays {
    public static void main(String[] args) {

        int[] numeros1 = {2, 32, 98, -35};
        int[] numeros2 = {65, 32, 1, -25, 45, 657};

        double[] decimales1 = {2.3, 32.8, 98.6, -35.6, 23.4};
        double[] decimales2 = {65.5, 32.8, 1.5, -25.4};

        boolean[] booleanos1 = {false, true, false, true};
        boolean[] booleanos2 = {true, true, false, false, true, true};

        int longitudMayor = 0;
        int longitudMenor = 0;
        int arrayMayor = 0;

        if (numeros1.length > numeros2.length) {
            longitudMayor = numeros1.length;
            longitudMenor = numeros2.length;
            arrayMayor = 1;
        } else if (numeros1.length < numeros2.length) {
            longitudMayor = numeros2.length;
            longitudMenor = numeros1.length;
            arrayMayor = 2;
        }

        System.out.printf("Vamos a comprar varios arrays de numeros enteros\n");

        for (int i = 0; i < longitudMenor; i++) {
            if (numeros1[i] == numeros2[i]) {
                System.out.printf("%d es igual que %d\n", numeros1[i], numeros2[i]);
            } else if (numeros1[i] > numeros2[i]) {
                System.out.printf("%d es mayor que %d\n", numeros1[i], numeros2[i]);
            }else if (numeros1[i] < numeros2[i]) {
                System.out.printf("%d es menor que %d\n", numeros1[i], numeros2[i]);
            }
        }

        for (int i = longitudMenor; i < longitudMayor; i++) {
            if (arrayMayor == 1){
                System.out.printf("%d es el unico valor\n", numeros1[i]);
            }else if (arrayMayor == 2){
                System.out.printf("%d es el unico valor\n", numeros2[i]);
            }
        }

        if (decimales1.length > decimales2.length) {
            longitudMayor = decimales1.length;
            longitudMenor = decimales2.length;
            arrayMayor = 1;
        } else if (decimales1.length < decimales2.length) {
            longitudMayor = decimales2.length;
            longitudMenor = decimales1.length;
            arrayMayor = 2;
        }

        System.out.printf("Vamos a comprar varios arrays de numeros decimales\n");

        for (int i = 0; i < longitudMenor; i++) {
            if (decimales1[i] == decimales2[i]) {
                System.out.printf("%.2f es igual que %.2f\n", decimales1[i], decimales2[i]);
            } else if (decimales1[i] > decimales2[i]) {
                System.out.printf("%.2f es mayor que %.2f\n", decimales1[i], decimales2[i]);
            }else if (decimales1[i] < decimales2[i]) {
                System.out.printf("%.2f es menor que %.2f\n", decimales1[i], decimales2[i]);
            }
        }

        for (int i = longitudMenor; i < longitudMayor; i++) {
            if (arrayMayor == 1){
                System.out.printf("%.2f es el unico valor\n", decimales1[i]);
            }else if (arrayMayor == 2){
                System.out.printf("%.2f es el unico valor\n", decimales2[i]);
            }
        }

        if (booleanos1.length > booleanos2.length) {
            longitudMayor = booleanos1.length;
            longitudMenor = booleanos2.length;
            arrayMayor = 1;
        } else if (booleanos1.length < booleanos2.length) {
            longitudMayor = booleanos2.length;
            longitudMenor = booleanos1.length;
            arrayMayor = 2;
        }

        System.out.printf("Vamos a comprar varios arrays de booleans\n");

        for (int i = 0; i < longitudMenor; i++) {
            if (booleanos1[i] == booleanos2[i]) {
                System.out.printf("%b es igual que %b\n", booleanos1[i], booleanos2[i]);
            }else{
                System.out.printf("%b es distinto que %b\n", booleanos1[i], booleanos2[i]);
            }
        }

        for (int i = longitudMenor; i < longitudMayor; i++) {
            if (arrayMayor == 1){
                System.out.printf("%b es el unico valor\n", booleanos1[i]);
            }else if (arrayMayor == 2){
                System.out.printf("%b es el unico valor\n", booleanos2[i]);
            }
        }
    }
}