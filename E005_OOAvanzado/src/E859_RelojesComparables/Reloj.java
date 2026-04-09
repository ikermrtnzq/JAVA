package E859_RelojesComparables;
import java.util.*;


public class Reloj implements Comparable<Reloj> {
    private int H =0;
    private int M =0;
    private int TOTALMINUTOS =0;


    public Reloj() {
        this.H = 8;
        this.M = 15;
    }
    public Reloj(int i) {
        this.TOTALMINUTOS = i;

        TOTALMINUTOS = TOTALMINUTOS % (24 * 60);
        this.H = TOTALMINUTOS / 60;
        this.M = TOTALMINUTOS % 60;
    }

    public Reloj(int i, int i1) {
       this.H = i;
        this.M = i1;
    }

    public String toString() {
        return String.format("%02d:%02d", this.H, this.M);
    }

    public void tick() {
        this.M = this.M + 1;
    }

    public void sumarMinutos(int i) {
        this.M = this.M + i;

        ajustarexcesos();
    }

    public void restarMinutos(int i) {
        this.M = this.M - i;

        ajustarexcesos();
    }
    public void ajustarexcesos(){

        while(M >= 60){
            H++;
            M = M - 60;
        }
        while(M < 0){
            H--;
            M = M + 60;
        }
        while(this.H >= 24){
            H = H - 24;
        }
        while(H < 0){
            H = H + 24;
        }

    }

    public int diferenciaMinutos(Reloj reloj3) {
        return Math.abs( ( (this.H * 60) + this.M) - ( (reloj3.H * 60) + reloj3.M) );
    }

    @Override
    public int compareTo(Reloj o) {
        int totalminutos1 = (this.H*60) + this.M;
        int totalminutos2 = (o.H*60) + o.M;

        if (totalminutos1 > totalminutos2) return 1;
        else if (totalminutos1 < totalminutos2) return -1;
        else return 0;
    }


    //public Reloj diferenciaReloj(Reloj reloj3) {}
}
