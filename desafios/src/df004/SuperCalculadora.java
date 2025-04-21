package df004;

import java.util.Scanner;

public class SuperCalculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Infome um valor: ");
        double num  = teclado.nextDouble();

        double div = num%2;
        double high = Math.pow(num,3);
        double square = Math.sqrt(num);
        double cube = Math.cbrt(num);
        double abs = Math.abs(num);

        System.out.printf("Resto da Divisão por 2: %.2f \n", div);
        System.out.printf("Elevado ao cubo: %.2f \n", high);
        System.out.printf("Raiz quadrada: %,2f \n", square);
        System.out.printf("Raiz Cúbica: %.2f \n", cube);
        System.out.printf("Valor Abisoluto: %.2f \n", abs);
    }
}
