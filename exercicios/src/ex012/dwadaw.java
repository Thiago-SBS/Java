package ex012;

public class dwadaw {
    public static void main(String[] args) {
        int v0 = 3;
        int v1 = v0++;
        int v2 = ++v1;
        v1 += v0;
        v2 += --v1;

        System.out.println(v0);
        System.out.println(v1);
        System.out.println(v2);
    }
}
