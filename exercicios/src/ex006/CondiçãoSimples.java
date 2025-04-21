package ex006;

import java.util.Scanner;

public class CondiçãoSimples {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Nota da primeira prova: ");
        float n1 = t.nextFloat();
        System.out.println("Nota da segunda prova: ");
        float n2 = t.nextFloat();
        float m = (n1+n2)/2;
        if (m>=9) {
            System.out.println("Parabéns, sua média é " + m);
        } else {
            System.out.println("Sua média é " + m);
        }
    }
}
