package E907_Potencia;

public class principal {
    public static void main(String[] args) {
        int base = 5;
        int exponente = 4;
        int resultado = potenciaRecursiva(base, exponente);

        System.out.printf("El resultado de elevar la base %d a el exponente %d: %d\n ", base, exponente,resultado );
    }
    public static int potenciaRecursiva(int base, int exponente) {
        int resultado = base;

        if (exponente == 0) resultado = 1;
        else if (exponente == 1) resultado = base;
        else resultado = resultado * potenciaRecursiva(base, exponente - 1);

        return resultado;
    }
}
