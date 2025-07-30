package Aula02;

public class Pen {
    String model;
    String color;
    float tip;
    int load;
    boolean covered;

    void stats () {
        System.out.println("Model: " + this.model);
        System.out.println("One " + this.color + " Pen");
        System.out.println("Tip: " + this.tip);
        System.out.println("Load: " + this.load);
        System.out.println("Is it covered? " + this.covered);
    }

    void scribble () {
        if (this.covered == true) {
            System.out.println("ERRO! I can't scribble with the pen capped.\n");
        } else {
            System.out.println("I'm scribbling.\n");
        }
    }

    void cover () {
        this.covered = true;
    }

    void uncover () {
        this.covered = false;
    }
}