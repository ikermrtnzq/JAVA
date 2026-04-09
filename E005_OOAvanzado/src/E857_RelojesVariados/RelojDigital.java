package E857_RelojesVariados;

public class RelojDigital extends Reloj {
    public RelojDigital(int h, int m) {
        super(h, m);
    }

    public String toString() {
        return String.format("%02d:%02d", this.H, this.M);
    }
}
