package E856_AnimalesNombre;


public abstract class Mamifero extends Animal{
    public Mamifero(int vitalidad, String nombre) {
        super(vitalidad, nombre);
    }
    public Mamifero(String nombre){
        super(nombre);
    }

}
