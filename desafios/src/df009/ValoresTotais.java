package df009;

import java.util.Scanner;

public class ValoresTotais {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um valor (0 interrompe).");

        int number = input.nextInt();
        int values = 0;
        int even = 0;
        int odd = 0;
        int up100 = 0;
        float average = 0;
        int averageCalc = 0;

        while (number != 0) {

            values++;

            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            if (number > 99) {
                up100++;
            }

            averageCalc = averageCalc + number;

            System.out.println("Informe um valor (0 interrompe)");
            number = input.nextInt();
        }

        average = averageCalc/values;


        System.out.println("\nResultado:");
        System.out.println("--------------------");
        System.out.println("Total de Valores: " + values);
        System.out.println("Total de Pares: " + even);
        System.out.println("Total de Ímpares: " + odd);
        System.out.println("Acima de 100: " + up100);
        System.out.println("Média dos Valores: " + average);
    }
}
