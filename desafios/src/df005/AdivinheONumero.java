package df005;

import java.util.Scanner;

public class AdivinheONumero {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        byte valor = -2;
        byte ale = -1;

        while (valor != ale) {
            System.out.println("Vou pensar em um numero de 1 a 5. Tente adivinhar qual é.");
            valor = t.nextByte();
            ale = (byte) (1 + Math.random() * (6 - 1));
            if (valor == ale) {
                System.out.println("Você acetou!");
            } else {
                System.out.println("Você errou, pensei em " + ale);
            }
        }
    }
}