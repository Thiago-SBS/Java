package df012;

import java.util.Scanner;

public class CalculadoraFatorial2 {

    public static void main(String[] args) {
        System.out.println("Calculadora Fatorial\n");
        long valor = getInputNumber();
        long fatorial = valor;

        long resultFatorial = calculer(valor, fatorial);
        System.out.println("A soma vale " + resultFatorial);
    }

    public static long getInputNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha um valor de 1 a 5:");
        long value = input.nextByte();

        return value;
    }

    public static long calculer(long valor, long fatorial) {

        while (valor > 1) {
            fatorial = fatorial *(valor -1);
            valor--;
        }
        return fatorial;
    }
}
