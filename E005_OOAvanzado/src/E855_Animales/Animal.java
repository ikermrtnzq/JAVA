package E855_Animales;

public abstract class Animal {
    protected int vitalidad;

    public Animal(int vitalidad) {
        this.vitalidad = vitalidad;
    }
    public Animal() {
        this.vitalidad = 100;
    }

    public void hablar() {
        if (this.vitalidad <= 0) this.vitalidad = 0;
        else this.vitalidad = this.vitalidad - 5;
    }

    public abstract void comer(int cantidadComida);

}
