package df008;

import java.util.Scanner;

public class CalculadoraFatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculadora Fatorial \n");
        System.out.println("Escolha um valor de 1 a 12:");

        long valor = input.nextLong();
        long fatorial = valor;

        while (valor > 1) {
            fatorial = fatorial *(valor -1);
            valor--;
        }

        System.out.println("\nO resultado é: " + fatorial);
    }
}
