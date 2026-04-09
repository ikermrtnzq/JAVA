package E078_CuentaBancariaConInts;
public class principal{
    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta();
        Cuenta cuenta2 = new Cuenta(100);

        System.out.printf("\nCuentas:\n Cuenta 1: %s\n Cuenta 2: %s\n", cuenta1.toString(), cuenta2.toString());

        if (cuenta1.tieneDescubierto()) System.out.printf("La cuenta 1 tiene %.2f descubierto\n", cuenta1.getDescubierto());
        if (cuenta2.tieneDescubierto()) System.out.printf("La cuenta 2 tiene %.2f descubierto\n", cuenta2.getDescubierto());

        cuenta1.ExtraerCajero(20);
        System.out.printf("\nExtrallendo dinero de cuenta 1.........\n");
        System.out.printf("\nCuentas:\n Cuenta 1: %s\n Cuenta 2: %s\n", cuenta1.toString(), cuenta2.toString());

        if (cuenta1.tieneDescubierto()) System.out.printf("La cuenta 1 tiene %.2f descubierto\n", cuenta1.getDescubierto());
        if (cuenta2.tieneDescubierto()) System.out.printf("La cuenta 2 tiene %.2f descubierto\n", cuenta2.getDescubierto());

        cuenta2.IngresarCajero(500);
        System.out.printf("\nIngresando dinero en cuenta 2.........\n");
        System.out.printf("\nCuentas:\n Cuenta 1: %s\n Cuenta 2: %s\n", cuenta1.toString(), cuenta2.toString());

        if (cuenta1.tieneDescubierto()) System.out.printf("La cuenta 1 tiene %.2f descubierto\n", cuenta1.getDescubierto());
        if (cuenta2.tieneDescubierto()) System.out.printf("La cuenta 2 tiene %.2f descubierto\n", cuenta2.getDescubierto());

        Cuenta cuenta3 = (Cuenta) cuenta2.clone();
        cuenta3.cargarRecibo(520);
        System.out.printf("\nCargando recibo en cuenta 3 recien clonada.........\n");
        System.out.printf("\nCuentas:\n Cuenta 1: %s\n Cuenta 2: %s\n Cuenta 3: %s\n", cuenta1.toString(), cuenta2.toString(),cuenta3.toString());

        if (cuenta1.tieneDescubierto()) System.out.printf("La cuenta 1 tiene %.2f descubierto\n", cuenta1.getDescubierto());
        if (cuenta2.tieneDescubierto()) System.out.printf("La cuenta 2 tiene %.2f descubierto\n", cuenta2.getDescubierto());
        if (cuenta3.tieneDescubierto()) System.out.printf("La cuenta 3 tiene %.2f descubierto\n", cuenta3.getDescubierto());

        cuenta2.cargarRecibo(1550);
        System.out.printf("\nCargando recibo en cuenta 2.........\n");
        System.out.printf("\nCuentas:\n Cuenta 1: %s\n Cuenta 2: %s\n Cuenta 3: %s\n", cuenta1.toString(), cuenta2.toString(),cuenta3.toString());

        if (cuenta1.tieneDescubierto()) System.out.printf("La cuenta 1 tiene %.2f descubierto\n", cuenta1.getDescubierto());
        if (cuenta2.tieneDescubierto()) System.out.printf("La cuenta 2 tiene %.2f descubierto\n", cuenta2.getDescubierto());
        if (cuenta3.tieneDescubierto()) System.out.printf("La cuenta 3 tiene %.2f descubierto\n", cuenta3.getDescubierto());

        if (cuenta1.equals(cuenta2)) System.out.println("\nLa cuenta 1 es IGUAL a cuenta 2");
        else System.out.println("\nLa cuenta 1 es DISTINTA a cuenta 2");

        if (cuenta2.equals(cuenta3)) System.out.println("La cuenta 2 es IGUAL a cuenta 3");
        else System.out.println("La cuenta 2 es DISTINTA a cuenta 3");

        if (cuenta1.equals(cuenta3)) System.out.println("La cuenta 1 es IGUAL a cuenta 3");
        else System.out.println("La cuenta 1 es DISTINTA a cuenta 3");


    }
}
