package ex007;

import java.util.Scanner;

public class ProgramaPernas {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Informe o número de pernas:");
        int pernas = t.nextInt();
        String tipo;
        switch (pernas) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Trípede";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6, 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }
        System.out.println("Isso é um( " + tipo);
    }
}
