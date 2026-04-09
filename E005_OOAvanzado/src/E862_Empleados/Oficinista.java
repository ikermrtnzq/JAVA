package E862_Empleados;

public abstract class Oficinista extends Empleado{

    public Oficinista(String nombre, double salarioActual, int notaEvaluacion) {
        super(nombre, salarioActual, notaEvaluacion);
    }

    public void subirSueldo(double ipc) {
        double incremento = 0;

        if ( this.notaEvaluacion == 1) incremento = ipc - 1;
        else if (this.notaEvaluacion == 2) incremento = ipc;
        else if (this.notaEvaluacion == 3) incremento = ipc + 1.5;
        else {
            System.out.println("Nota de evaluación inválida. No se aplicará incremento.");
            return;
        }

        double nuevoSalario = this.salario + (this.salario * (incremento / 100));
        this.salario = nuevoSalario;
    }

}
