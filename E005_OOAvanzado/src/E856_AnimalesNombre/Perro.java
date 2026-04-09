package E856_AnimalesNombre;


public class Perro extends Mamifero{
    public Perro(int vitalidad, String nombre) {
        super(vitalidad, nombre);

    }
    public Perro(String nombre) {
        super(nombre);
    }
    public void hablar() {
        if (this.vitalidad <30 )System.out.println("guauuu.....");
        else if (this.vitalidad >30 && vitalidad < 70) System.out.println("guau guau");
        else if (this.vitalidad >= 70 ) System.out.println("¡¡GUAU GUAU GUAU!!");
        super.hablar();
    }
    public void comer(int cantidadComida){

        if (cantidadComida == 0)this.vitalidad = this.vitalidad;
        else {
            if (this.vitalidad >=100) this.vitalidad = 100;
            else this.vitalidad = this.vitalidad + (cantidadComida*7);
        }
    }
}
