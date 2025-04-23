package ex011;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VetorPos {
    public static void main(String[] args) {
        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        for (int v:vet) {
            System.out.println(v);
        }
        int p = Arrays.binarySearch(vet, 1);
        System.out.println("Encontrei o vetor na posição " + p);
    }
}
