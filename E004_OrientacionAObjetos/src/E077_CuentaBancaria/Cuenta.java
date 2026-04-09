package E077_CuentaBancaria;

public class Cuenta {
    private double saldo;
    private double descubierto;
    private double inicializacion = 50;

    Cuenta(){
        saldo = inicializacion;
    }
    Cuenta(double descubierto){
        this.saldo = inicializacion;
        this.descubierto = descubierto;


    }
    public void ingresarCajero(double cantidad){
        this.saldo = this.saldo + cantidad;
    }

    public void extraerCajero(double cantidad){
        if (this.saldo < cantidad) throw new RuntimeException("Saldo INSUFICIENTE");
        else this.saldo = this.saldo - cantidad;
    }
    public void cargarRecibo(double cantidad){
        if (this.descubierto == 0 && this.saldo > cantidad) this.saldo = saldo-cantidad;
        else  if (this.descubierto == 0 && this.saldo < cantidad) throw new RuntimeException("Saldo INSUFICIENTE");

        if ( this.descubierto != 0 && this.saldo > cantidad ) this.saldo = this.saldo - cantidad;
        else if ( this.descubierto != 0 && this.saldo < cantidad ){
            if (this.descubierto + this.saldo >= cantidad){
                this.descubierto = (this.saldo - cantidad) + this.descubierto;
                this.saldo = 0;
            } else if (this.descubierto + this.saldo <= cantidad) throw new RuntimeException("Saldo INSUFICIENTE");
        }

    }

    public String toString() {
        return String.format("%.2f", saldo);
    }

    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Cuenta)) return false;

        Cuenta otro = (Cuenta) obj;

        return (this.saldo == otro.getValor());
    }

    private double getValor() {
        return saldo;
    }

    public Object clone() {
         Cuenta clon = new Cuenta();
         clon.saldo = this.saldo;
         clon.descubierto = this.descubierto;
         return clon;
    }

    public int obtenerdescubierto(){
        return (int) this.descubierto;
    }
    public boolean poseeDescubierto(){
        if (this.descubierto != 0) return true;
        else return false;
    }
}
