package ex012;

public class Metodos {

    static void soma(int a, int b) {
        int s = a + b;
        System.out.println("A soma é " + s);
    }

    static int soma2(int c, int d) {
        int s2 = c + d;
        return s2;
    }

    public static void main(String[] args) {
        soma(5,2);

        int sm = soma2(7,3);
        System.out.println("A soma vale " + sm);
    }
}
