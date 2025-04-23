package ex011;

import java.util.Arrays;

public class VetorTeste {
    public static void main(String[] args) {
        int num[] = {3,5,1,8,4};
        Arrays.sort(num);

        for (int valor: num) {
            System.out.println(valor);
        }
    }
}
