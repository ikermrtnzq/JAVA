package E855_Animales;

public class Libelula extends Insecto{
    public Libelula() {
        super();
    }

    public Libelula(int vitalidad){
        super(vitalidad);
    }
    public void hablar() {
        if (this.vitalidad <30 )System.out.println("biiiii.....");
        else if (this.vitalidad >30 && vitalidad < 70) System.out.println("bi bi bi");
        else if (this.vitalidad >= 70 ) System.out.println("¡¡BI BI BI!!");
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

