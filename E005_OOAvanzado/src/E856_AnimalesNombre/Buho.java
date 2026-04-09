package E856_AnimalesNombre;

public class Buho extends Ave{
    public Buho(String nombre){
        super(nombre);
    }
    public Buho(int vitalidad, String nombre){
        super(vitalidad, nombre);
    }
    public void hablar() {
        if (this.vitalidad <30 )System.out.println("buuuuuu.....");
        else if (this.vitalidad >30 && vitalidad < 70) System.out.println("bu bu bu");
        else if (this.vitalidad >= 70 ) System.out.println("¡¡BU BU BU!!");
        super.hablar();
    }
    public void comer(int cantidadComida){
        if (cantidadComida == 0)this.vitalidad = this.vitalidad;
        else {
            if (this.vitalidad >=100) this.vitalidad = 100;
            else this.vitalidad = this.vitalidad + (cantidadComida*12);
        }

    }
}

