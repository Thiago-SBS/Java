package df002;

import java.util.Scanner;

public class SomarValores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número:");
        float n1 = teclado.nextFloat();
        System.out.println("Digite outro número");
        float n2 = teclado.nextFloat();
        System.out.println("O resultado é = " + (n1+n2));
    }
}
