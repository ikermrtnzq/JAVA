public class E058_SumaTotalFilas {
    public static void main(String[] args) {

        int[][] array1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12},
                {13, 14, 15}
        };
        int suma = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                System.out.printf("  %d",array1[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                suma= suma + array1[i][j];
            }
            System.out.println("La suma de las matrices es: " + suma);
            suma = 0;
        }
    }
}