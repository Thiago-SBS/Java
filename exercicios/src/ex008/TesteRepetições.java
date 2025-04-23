package ex008;

public class TesteRepetições {
    public static void main(String[] args) {
        int cc = 0;
        while (cc<10) {
            cc++;

            if (cc == 2 || cc == 4) {
                continue;
            }
            if (cc == 7) {
                break;
            }

            System.out.println("Cambalhota " + cc);

        }
    }
}
