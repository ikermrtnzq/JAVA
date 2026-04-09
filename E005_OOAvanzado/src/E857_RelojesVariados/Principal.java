package E857_RelojesVariados;

public class Principal {

    public static void main(String[] args) {

        //RelojAnalogico reloj = new RelojAnalogico();

        RelojTextual relojText1 = new RelojTextual(17, 0);
        RelojDigital relojDigital1 = new RelojDigital(23, 54);
        RelojTextualIngles relojTextIng1 = new RelojTextualIngles(13, 30);
        RelojTextual relojText2 = new RelojTextual(23, 15);
        RelojDigital relojDigital2 = new RelojDigital(12, 30);
        RelojTextualIngles relojTextIng2 = new RelojTextualIngles(13, 37);

        System.out.println(relojText1);
        System.out.println(relojDigital1);
        System.out.println(relojTextIng1);
        System.out.println(relojText2);
        System.out.println(relojDigital2);
        System.out.println(relojTextIng2);
    }
}
