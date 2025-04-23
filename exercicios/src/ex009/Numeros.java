package ex009;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, s=0;
        String resp;

        do {
            System.out.println("Digite um número: ");
            n = input.nextInt();
            s += n;
            System.out.println("Quer continuar? [sim/nâo]");
            resp = input.next();
        } while (resp.equals("sim"));

        System.out.println("A soma de todos os valores é: " + s);
    }
}
