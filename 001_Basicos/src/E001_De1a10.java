
public class E001_De1a10 {
    public static void main(String[] args) {

        System.out.println("-------------Hecho con for------------");

        for (int i = 1; i <= 10; i++) {

            System.out.println("i = " + i);
        }

        System.out.println("---------Hecho con while-------------");

        int i = 1;
        while (i <= 10) {
            System.out.println("i = " + i);
            i++;
        }

        System.out.println("---------Hecho con do while-------------");

        i = 1;
        do {
            System.out.println("i = " + i);
            i++;
        } while (i <= 10);
    }
}