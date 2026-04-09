package E855_Animales;

public class Gato extends Mamifero{

    public Gato (int vitalidad){
        super(vitalidad);
    }
    public Gato(){
        super();
    }
    public void hablar() {
        if (this.vitalidad <30 )System.out.println("miau.....");
        else if (this.vitalidad >30 && vitalidad < 70) System.out.println("miau miau");
        else if (this.vitalidad >= 70 ) System.out.println("¡¡MIAU MIAU MIAU!!");
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
