package E076_RelojTotalMinutosBasico;

public class Reloj { ;
    private int TOTALMINUTOS =0;

    public Reloj() {
        TOTALMINUTOS = 6000;
    }
    public Reloj(int i) {

        TOTALMINUTOS = i;

    }

    public String toString() {
        ajustarexcesos();
        return String.format("%02d:%02d",TOTALMINUTOS/60, TOTALMINUTOS%60);
    }

    public void tick() {
        TOTALMINUTOS = TOTALMINUTOS + 1;
    }

    public void sumarMinutos(int i) {
        TOTALMINUTOS = TOTALMINUTOS + i;
        ajustarexcesos();

    }

    public void restarMinutos(int i) {
        TOTALMINUTOS = TOTALMINUTOS - i;

        ajustarexcesos();

    }
    public void ajustarexcesos(){

        while (TOTALMINUTOS >= 1440) {
            TOTALMINUTOS -= 1440;
        }
        while (TOTALMINUTOS < 0) {
            TOTALMINUTOS += 1440;
        }
    }


    public int diferenciaMinutos(Reloj reloj3) {
        return Math.abs(this.TOTALMINUTOS - reloj3.TOTALMINUTOS );
    }

    //public Reloj diferenciaReloj(Reloj reloj3) {}
}

