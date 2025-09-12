import java.util.Scanner;
public class E023_CuadradoConAsteriscos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el ancho de la figura: ");
        int anchoNum = sc.nextInt();

        System.out.println("Introduzca el altura de la figura: ");
        int alturaNum = sc.nextInt();

        System.out.format("Que figura quieres dibujar :\na)1 Cuadrado \nb)2 Triangulo \nc)3 Rectangulo\n ");
        int figura = sc.nextInt();

        if (figura == 1){
            String anchoDibujo = E023_CuadradoConAsteriscos.dibujarAnchoCuadrado(anchoNum);
            String alturaDibujo = E023_CuadradoConAsteriscos.dibujarAltoCuadrado(anchoNum);

            System.out.println("Dibujando cuadrado........ ");

            System.out.println(anchoDibujo);
            for (int i = 1; i < anchoNum-1; i++){
                System.out.println(alturaDibujo);
            }
            System.out.println(anchoDibujo);
        }else if (figura == 2){
            System.out.format("Que triangulo prefieres :\na)1 = Rectangulo \nb)2 = Simétrico\n ");
            int tipoTriangulo = sc.nextInt();
            if (tipoTriangulo == 1){
                System.out.println("Problemas técnicos, no se puede dibujar ahora mismo........ ");
                System.out.println("No se ha podido profe........ ");

            } else if (tipoTriangulo == 2) {
                System.out.println("Problemas técnicos, no se puede dibujar ahora mismo........ ");
                System.out.println("No se ha podido profe........ ");

            }
        }else if (figura == 3){
            String anchoDibujo = E023_CuadradoConAsteriscos.dibujarAnchoCuadrado(anchoNum);
            String alturaDibujo = E023_CuadradoConAsteriscos.dibujarAltoCuadrado(anchoNum);

            System.out.println("Dibujando rectangulo........ ");
            System.out.println(anchoDibujo);
            for (int i = 1; i < alturaNum-1; i++){
                System.out.println(alturaDibujo);
            }
            System.out.println(anchoDibujo);
        }
    }
    public static String dibujarAnchoCuadrado(int anchoNum) {
        String asteriscos ="";
        for (int i = 1;i <=anchoNum; i++){
            asteriscos = asteriscos + "* ";
        }
        return asteriscos;
    }
    public static String dibujarAltoCuadrado(int anchoNum) {
        String asteriscos ="* ";
        for (int i = 1;i <=anchoNum-2; i++){
            asteriscos = asteriscos + "  ";
        }
        asteriscos = asteriscos + "*";
        return asteriscos;
    }
    public static String dibujarAnchoRectangulo(int anchoNum) {
        String asteriscos ="";
        for (int i = 1;i <=anchoNum; i++){
            asteriscos = asteriscos + "* ";
        }
        return asteriscos;
    }
    public static String dibujarAltoRectangulo(int anchoNum, int alturaNum) {
        String asteriscos ="* ";
        for (int i = 1;i <=anchoNum-2; i++){
            asteriscos = asteriscos + "  ";
        }
        asteriscos = asteriscos + "*";
        return asteriscos;
    }
}