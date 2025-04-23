package df011;

import java.util.Scanner;

public class VetoresErrado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha uma célula de 1 a 9: (Se quiser encerrar digite 0).");
        byte cell = input.nextByte();
        System.out.println("Agora atribua um valor de 1 a 10 a ela:");
        byte value = input.nextByte();

        int cell1 = 0;
        int cell2 = 0;
        int cell3 = 0;
        int cell4 = 0;
        int cell5 = 0;
        int cell6 = 0;
        int cell7 = 0;
        int cell8 = 0;
        int cell9 = 0;

        while (cell != 0 ) {

            if (cell == 1) {
            cell1 = value + cell1;
            } else if (cell == 2) {
                cell2 = value + cell2;
            } else if (cell == 3) {
                cell3 = value + cell3;
            } else if (cell == 4){
                cell4 = value + cell4;
            } else if (cell == 5){
                cell5 = value + cell5;
            } else if (cell == 6){
                cell6 = value + cell6;
            } else if (cell == 7){
                cell7 = value + cell7;
            } else if (cell == 8){
                cell8 = value + cell8;
            } else if (cell == 9){
                cell9 = value + cell9;
            } else if (cell > 9 || cell < 0) {
                System.out.println("Esta celula não existe");
            }

            System.out.println("Escolha uma célula de 1 a 9: (Se quiser encerrar digite 0).");
            cell = input.nextByte();

            if (cell != 0) {
            System.out.println("Agora atribua um valor de 1 a 10 a ela:");
            value = input.nextByte();
            }
        }

        System.out.println("\nResultado:");
        System.out.println("------------------------");
        System.out.println("[1] -> " + cell1);
        System.out.println("[2] -> " + cell2);
        System.out.println("[3] -> " + cell3);
        System.out.println("[4] -> " + cell4);
        System.out.println("[5] -> " + cell5);
        System.out.println("[6] -> " + cell6);
        System.out.println("[7] -> " + cell7);
        System.out.println("[8] -> " + cell8);
        System.out.println("[9] -> " + cell9);
    }
}