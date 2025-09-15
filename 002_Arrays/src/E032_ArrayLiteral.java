
public class E032_ArrayLiteral {
    public static void main(String[] args) {

        int [] numeros = {17, 23, 5, 21};
        boolean[] indicadores = {false, false, true, false, true};
        double[] longitudes = {11.36, 0.0, 1.184, -3.98, 1495739.2};

        System.out.println("Mostrando valores int del array 1..............................");

        for (int numeroActual : numeros) {

            System.out.println(numeroActual);
        }

        System.out.println("Mostrando valores boolean del array 2..............................");
        for (boolean numeroActual : indicadores) {

            System.out.println(numeroActual);
        }

        System.out.println("Mostrando valores double del array 3..............................");
        for (double numeroActual : longitudes) {

            System.out.println(numeroActual);
        }
    }
}