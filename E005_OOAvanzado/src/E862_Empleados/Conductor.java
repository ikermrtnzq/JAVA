package E862_Empleados;

public class Conductor extends Empleado {
    protected String tipoCarnet;
    protected boolean[] carnets = new boolean[4];

    public Conductor(String nombre, double salarioActual, int notaEvaluacion, String tipoCarnet) {
        super(nombre, salarioActual, notaEvaluacion);
        this.tipoCarnet = tipoCarnet;
        setCarnets(tipoCarnet);
    }

    private void setCarnets(String tipoCarnet) {
        for (int i = 0; i < tipoCarnet.length(); i++) {
            if (tipoCarnet.charAt(i) == 'A') carnets[0] = true;
            else if (tipoCarnet.charAt(i) == 'B') carnets[1] = true;
            else if (tipoCarnet.charAt(i) == 'C') carnets[2] = true;
            else if (tipoCarnet.charAt(i) == 'D') carnets[3] = true;
        }
    }


    public void subirSueldo(double ipc) {
        double incremento = 0;

        if ( this.notaEvaluacion == 1) incremento = ipc - 2;
        else if (this.notaEvaluacion == 2) incremento = ipc - 0.5 ;
        else if (this.notaEvaluacion == 3) incremento = ipc;
        else {
            System.out.println("Nota de evaluación inválida. No se aplicará incremento.");
            return;
        }
        if (carnets[1]) incremento = incremento + 0.5;
        if (carnets[2]) incremento = incremento +1;
        if (carnets[3]) incremento = incremento + 2;


        double nuevoSalario = this.salario + (this.salario * (incremento / 100));
        this.salario = nuevoSalario;
    }
}
