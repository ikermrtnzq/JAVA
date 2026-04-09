package E856_AnimalesNombre;

public abstract class Animal {
    protected int vitalidad;
    protected String nombre;

    public Animal(int vitalidad, String nombre) {
        this.vitalidad = vitalidad;
        this.nombre = nombre;
    }
    public Animal(String nombre) {
        this.vitalidad = 100;
        this.nombre = nombre;
    }
    public String toString(){
        System.out.printf("\nNombre: %s  energía: %d\n", this.nombre, this.vitalidad);
        return null;
    }

    public void hablar() {
        if (this.vitalidad <= 0) this.vitalidad = 0;
        else this.vitalidad = this.vitalidad - 5;
    }

    public abstract void comer(int cantidadComida);

}
