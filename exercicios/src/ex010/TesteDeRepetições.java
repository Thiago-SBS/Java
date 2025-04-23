package ex010;

import javax.swing.*;
import java.util.Scanner;

public class TesteDeRepetições {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int cc = 0; cc<=3; cc++){
            System.out.println("Cambalhota" + cc);
        }

        for (int aa = 0; aa <= 100; aa+=10) {
            System.out.println(aa);
        }
    }
}
