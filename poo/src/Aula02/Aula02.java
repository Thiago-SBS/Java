package Aula02;

public class Aula02 {
    public static void main(String[] args) {

        Pen c1 = new Pen();
        c1.color = "Blue";
        c1.tip = 0.5f;
        c1.covered = false;
        c1.cover();
        c1.stats();
        c1.scribble();

        Pen c2 = new Pen();
        c2.model = "Bic";
        c2.color = "Black";
        c2.uncover();
        c2.stats();
        c2.scribble();

    }
}