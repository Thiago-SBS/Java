package df006;

import java.util.Scanner;

public class Calculadora2Grau {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Calculadora Delta, determine o valor de a:");
        double a = t.nextDouble();
        System.out.println("Determine o valor de b:");
        double b = t.nextDouble();
        System.out.println("Determine o valor de c:");
        double c = t.nextDouble();
        double delta = Math.pow(b,2) - 4 * a * c;

        double x1 = (-b + Math.sqrt(delta))/(2*a);
        double x2 = (-b - Math.sqrt(delta))/(2*a);

        System.out.println("\nResultado: ");
        System.out.println("Delta é = " + delta);

        if (0 > delta) {
            System.out.println("A equação não possue raiz.");
        } else {
            System.out.println("x1= " + x1);
            System.out.println("x2= " + x2);
        }
    }
}
