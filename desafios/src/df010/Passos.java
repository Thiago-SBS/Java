package df010;

import java.util.Scanner;

public class Passos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha um número de 1 a 5 para iniciar:");
        byte start = input.nextByte();
        System.out.println("Escolha um número de 6 a 20 para ser o fim:");
        byte end = input.nextByte();
        System.out.println("Escolha um número de 1 a 4 para ser o intervalo:");
        byte interval = input.nextByte();;

        System.out.println("\nResultado:");
        System.out.println("---------------");

        for (int result = start; result <= end; result += interval) {
            System.out.println(result);
        }

    }
}
