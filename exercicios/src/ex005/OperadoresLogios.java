package ex005;

public class OperadoresLogios {
    public static void main(String[] args) {
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r;
        r = (x<y ^ y<z) ?true:false;
        System.out.println(r);
    }
}
