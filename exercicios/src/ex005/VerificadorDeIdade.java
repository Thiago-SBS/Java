package ex005;

import java.time.LocalDate;
import java.util.Scanner;

public class VerificadorDeIdade {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Seu ano de nacimento: ");
        int anoNasc = t.nextInt();
        LocalDate data = LocalDate.now();
        int ano = data.getYear();
        int idade = ano-anoNasc;
        String res = (idade>=18) ?"Maior de idade":"Menor de idade";
        System.out.println(res);
    }
}
