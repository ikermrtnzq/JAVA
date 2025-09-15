public class E060_SumarColumnas {
    public static void main(String[] args) {
        int[][] arrayA = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int[] arrayC = new int[4];

        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA[0].length; j++) {
                arrayC[i] += arrayA[j][i];
            }
        }

        System.out.println("\nEste es el array bidimensional: ");
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA[0].length; j++) {
                System.out.printf("%d  ", arrayA[i][j]);
            }
            System.out.println();
        }

        System.out.println("---------------");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.printf("%d  ", arrayC[i]);
        }

        System.out.println();
        System.out.println("\nEsta es la suma obtenida de sus columnas: ");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println();
            for (int j = 0; j < arrayA[0].length; j++) {
                System.out.printf("%d + ", arrayA[j][i]);
            }
            System.out.printf("= %d\n ", arrayC[i]);
        }
    }
}