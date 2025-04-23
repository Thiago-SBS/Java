package ex011;

import java.util.Arrays;

public class VetoresAuto {
    public static void main(String[] args) {
        int v[] = new int[20];
        Arrays.fill(v, 0);

        for (int valor:v) {
            System.out.println(valor);
        }
    }
}
