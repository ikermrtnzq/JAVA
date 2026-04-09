package E909_CadenaAlReves;

public class principal {
    public static void main(String[] args) {

        StringBuilder cadena =new StringBuilder("ajos");
        String cadenaAlreves = "";

        System.out.printf("La cadena \"%s\" escrita al revés es: %s ", cadena, cadenaAlRevesRecursiva(cadena, cadenaAlreves, cadena.length()));

    }
    public static String cadenaAlRevesRecursiva(StringBuilder cadena, String cadenaAlReves,int longitud) {

        if (cadenaAlReves.length() != longitud) {
            cadenaAlReves  = cadenaAlReves + cadena.charAt(cadena.length()-1);
            cadena = new StringBuilder(cadena.substring(0, cadena.length() - 1));
            return cadenaAlRevesRecursiva(cadena,cadenaAlReves, longitud);
        }
        return cadenaAlReves;
    }
}
