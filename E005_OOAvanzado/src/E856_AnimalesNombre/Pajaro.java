package E856_AnimalesNombre;

public class Pajaro extends Ave{
    public Pajaro(int vitalidad, String nombre) {
        super(vitalidad, nombre);
    }
    public Pajaro(String nombre){
        super(nombre);
    }

    @Override
    public void hablar() {
        if (this.vitalidad <30 )System.out.println("pio.....");
        else if (this.vitalidad >30 && vitalidad < 70) System.out.println("pio pio");
        else if (this.vitalidad >= 70 ) System.out.println("¡¡PIO PIO PIO!!");
        super.hablar();
    }
    public void comer(int cantidadComida){
        if (cantidadComida == 0)this.vitalidad = this.vitalidad;
        else {
            if (this.vitalidad >=100) this.vitalidad = 100;
            else this.vitalidad = this.vitalidad + (cantidadComida*5);
        }
    }
}
