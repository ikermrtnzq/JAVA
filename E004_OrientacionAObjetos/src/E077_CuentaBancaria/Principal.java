package E077_CuentaBancaria;
import java.util.*;

public class Principal {

    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta();
        Cuenta cuenta2 = new Cuenta(70);
        Scanner sc = new Scanner(System.in);
        int opcion;
        int cuenta;
        double cantidad;
        char operacion;

        do {
            System.out.printf("\nSaldos de las cuentas: \n");
            System.out.printf("   Cuenta 1: %s  %s descubierto \n",cuenta1.toString(),(cuenta1.poseeDescubierto())? "tiene":"no tiene");
            System.out.printf("   Cuenta 2: %s  %s descubierto \n",cuenta2.toString(),(cuenta2.poseeDescubierto())? "tiene":"no tiene");

            if (cuenta1.poseeDescubierto()) System.out.printf("\n   La cuenta 1 tiene %d de descubierto\n", cuenta1.obtenerdescubierto());
            if (cuenta2.poseeDescubierto()) System.out.printf("\n   La cuenta 2 tiene %d de descubierto\n", cuenta2.obtenerdescubierto());


            System.out.printf("\n¿Quieres hacer alguna operacion? ");
            operacion = sc.next().toLowerCase().charAt(0);

            if(operacion == 's'){
                System.out.printf("Con que cuenta la quieres hacer: ");
                cuenta = sc.nextInt();
                System.out.printf("¿Que operaciones quieres hacer?:\n 1)Ingresar Dinero\n 2)Retirar Dinero\n 3)Cargar Recibo\n opcion: ");
                opcion = sc.nextInt();
                System.out.printf("Introduzca la cantidad: ");
                cantidad = sc.nextInt();

                if(opcion == 1 && cuenta == 1) cuenta1.ingresarCajero(cantidad);
                else if(opcion == 2 && cuenta == 1) cuenta1.extraerCajero(cantidad);
                else if (opcion==3 && cuenta == 1) cuenta1.cargarRecibo(cantidad);
                if(opcion == 1 && cuenta == 2) cuenta2.ingresarCajero(cantidad);
                else if(opcion == 2 && cuenta == 2) cuenta2.extraerCajero(cantidad);
                else if (opcion==3 && cuenta == 2) cuenta2.cargarRecibo(cantidad);
            }

        }while (operacion == 's');

        Cuenta cuenta3 = (Cuenta) cuenta2.clone();

        System.out.println("Cuenta 3: "+cuenta3.toString());

        if(cuenta1.equals(cuenta3)) System.out.println("Cuenta 1 y 3 son iguales");
        else System.out.println("Cuenta 1 y 3 son diferentes");

        if(cuenta2.equals(cuenta3)) System.out.println("Cuenta 2 y 3 son iguales");
        else System.out.println("Cuenta 2 y 3 son diferentes");



    }


}
