package E862_Empleados;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList();
        empleados.add(new Conductor("MANOLO", 1200, 2, "BC"));
        empleados.add(new EmpleadoRaso("Maria", 1050, 1));
        empleados.add(new JefeDpo("Antonio", 1500, 3));

        for (Empleado e : empleados) e.presentate();
        for (Empleado e : empleados) e.subirSueldo(3.45);
        for (Empleado e : empleados) e.presentate();
    }
}
