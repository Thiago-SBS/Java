package df003;

import java.time.LocalDate;
import java.time.Year;
import java.util.Scanner;

public class Nascimento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Seu ano de nascimento: ");
        int anoNasc = teclado.nextInt();
        LocalDate data = LocalDate.now();
        int ano = data.getYear();
        System.out.println("Você tem " + (ano-anoNasc) + " anos.");
    }
}
