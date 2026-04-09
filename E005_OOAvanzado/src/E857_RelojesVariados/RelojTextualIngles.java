package E857_RelojesVariados;

public class RelojTextualIngles extends Reloj {

    public RelojTextualIngles(int h, int m) {
        super(h, m);
    }

    public String toString() {
        String[] horasIngles = {
                "twelve", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve","one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten",
                "eleven"
        };
        String hora = horasIngles[this.H];

        String[] minutosIngles = {
                "o'clock","one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen",
                "cuarter", "sixteen", "seventeen", "eighteen",
                "nineteen", "twenty", "twenty-one", "twenty-two",
                "twenty-three", "twenty-four", "twenty-five",
                "twenty-six", "twenty-seven", "twenty-eight",
                "twenty-nine", "half", "thirty-one",
                "thirty-two", "thirty-three", "thirty-four",
                "thirty-five", "thirty-six", "thirty-seven",
                "thirty-eight", "thirty-nine", "forty",
                "forty-one", "forty-two", "forty-three",
                "forty-four", "forty-five", "forty-six",
                "forty-seven", "forty-eight", "forty-nine",
                "fifty", "fifty-one", "fifty-two",
                "fifty-three", "fifty-four", "fifty-five",
                "fifty-six", "fifty-seven", "fifty-eight",
                "fifty-nine", "sixty"
        };

        String minuto = minutosIngles[this.M];

        if ((this.M == 15 ||this.M == 30) && this.H <= 12 ) return String.format("It's %s past %s (AM)",minuto, hora);
        else if ((this.M == 15 ||this.M == 30) && this.H >= 12 ) return String.format("It's %s past %s (PM)",minuto, hora);
        else {
            if (this.H <= 12 ) return String.format("Its %s minutes past %s (AM)",minuto, hora);
            else return String.format("Its %s minutes past %s (PM)",minuto, hora);
        }
    }
}
