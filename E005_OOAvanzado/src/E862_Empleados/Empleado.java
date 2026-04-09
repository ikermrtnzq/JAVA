package E862_Empleados;

public  abstract  class Empleado {
    protected String nombre;
    protected double salario;
    protected int notaEvaluacion;

    public Empleado(String nombre, double salario, int notaEvaluacion){
        this.nombre = nombre;
        this.salario = salario;
        this.notaEvaluacion = notaEvaluacion;
    }
    public abstract void subirSueldo(double ipc);

    public void presentate(){
        System.out.printf("\nHola, me llamo %s, cobro %.0f y mi nota de evaluacion es %d\n", nombre, salario, notaEvaluacion);
    }
}
