package E857_RelojesVariados;

public class RelojTextual extends Reloj {

    public RelojTextual(int h, int m) {
        super(h, m);
    }

    public String toString() {
        String[] horas = {
                "doce", "una", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez",
                "once", "doce", "una", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez",
                "once",
        };
        String hora = horas[this.H];

        String[] minutos = {
                "en punto", "uno", "dos", "tres", "cuatro", "cinco",
                "seis", "siete", "ocho", "nueve", "diez", "once",
                "doce", "trece", "catorce", "cuarto", "dieciséis",
                "diecisiete", "dieciocho", "diecinueve", "veinte",
                "veintiuno", "veintidós", "veintitrés", "veinticuatro",
                "veinticinco", "veintiséis", "veintisiete", "veintiocho",
                "veintinueve", "media", "treinta y uno", "treinta y dos",
                "treinta y tres", "treinta y cuatro", "treinta y cinco",
                "treinta y seis", "treinta y siete", "treinta y ocho",
                "treinta y nueve", "cuarenta", "cuarenta y uno", "cuarenta y dos",
                "cuarenta y tres", "cuarenta y cuatro", "cuarenta y cinco",
                "cuarenta y seis", "cuarenta y siete", "cuarenta y ocho",
                "cuarenta y nueve", "cincuenta", "cincuenta y uno", "cincuenta y dos",
                "cincuenta y tres", "cincuenta y cuatro", "cincuenta y cinco",
                "cincuenta y seis", "cincuenta y siete", "cincuenta y ocho",
                "cincuenta y nueve", "en punto"
        };

        String minuto = minutos[this.M];

        if (this.H >= 12 && this.H <=20) return String.format("Son las %s y  %s de la tarde", hora, minuto);
        if (this.H >= 12 && this.H >20) return String.format("Son las %s y %s de la noche", hora, minuto);
        else return String.format("Son las %s y %s de la mañana", hora, minuto);
    }
}
