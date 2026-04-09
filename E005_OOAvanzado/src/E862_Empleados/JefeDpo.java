package E862_Empleados;

public class JefeDpo extends Oficinista{

    public JefeDpo(String nombre, double salarioActual, int notaEvaluacion) {
        super(nombre, salarioActual, notaEvaluacion);
    }

    @Override
    public void subirSueldo(double ipc) {
        double incremento = 0;

        if (this.notaEvaluacion == 1) incremento = (ipc - 1) + 3;
        else if (this.notaEvaluacion == 2) incremento = ipc + 3;
        else if (this.notaEvaluacion == 3) incremento = ipc + 1.5 + 3;
        else {
            System.out.println("Nota de evaluación inválida. No se aplicará incremento.");
            return;
        }

        double nuevoSalario = this.salario + (this.salario * (incremento / 100));
        this.salario = nuevoSalario;
    }

}
