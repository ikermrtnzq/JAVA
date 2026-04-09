package E078_CuentaBancariaConInts;

public class Cuenta {

    private int POR_DEFECTO = 100000;
    private int saldo;
    private int descubierto;

    public Cuenta() {
        this.saldo = POR_DEFECTO;
    }
    public Cuenta(double i) {
        this.saldo = POR_DEFECTO;
        this.descubierto =(int) i;
        this.descubierto = this.descubierto*100;
    }
    public void IngresarCajero(double cantidad){
        this.saldo += ((int) cantidad)*100;
    }
    public void ExtraerCajero(double cantidad){
        this.saldo -= ((int) cantidad)*100;
    }
    public void cargarRecibo(double cantidad){
        cantidad = ((int) cantidad)*100;
        if (this.descubierto == 0 && this.saldo >= (int)cantidad) this.saldo -= (int)cantidad;
        else if (this.descubierto == 0 && this.saldo < (int)cantidad) throw new RuntimeException("SALDO INSUFICIENTE");

        if (this.descubierto != 0 && this.saldo  >= (int)cantidad) this.saldo -= (int)cantidad;
        else if (this.descubierto != 0 && this.saldo < (int) cantidad && (this.saldo + this.descubierto) > (int)cantidad){
            this.descubierto = this.descubierto - ((int)cantidad - this.saldo);
            this.saldo = 0;
        }
        else if (this.descubierto != 0 && this.saldo < (int) cantidad && (this.saldo + this.descubierto) < (int)cantidad) {
            throw new RuntimeException("SALDO INSUFICIENTE");
        }
    }

    public Object clone(){
        Cuenta clon = new Cuenta();
        clon.saldo = this.saldo;
        clon.descubierto = this.descubierto;
        return clon;
    }

    public String toString() {
        return String.format("%.2f", ((double)this.saldo)/100);
    }

    public boolean equals(Object obj) {
        if(obj == null) return false;
        if (!(obj instanceof Cuenta)) return false;

        Cuenta otro =(Cuenta) obj;

        return (this.saldo == otro.getValor());
    }

    private int getValor() {
        return this.saldo;
    }
    public double getDescubierto(){
        return ((double)this.descubierto)/100;
    }
    public boolean tieneDescubierto(){
        if(this.descubierto == 0) return false;
        return true;
    }

}

