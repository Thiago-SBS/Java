package Aula03;

public class Pen {
    public String model;
    public String color;
    private float tip;
    protected int load;
    protected boolean covered;

    public void stats () {
        System.out.println("Model: " + this.model);
        System.out.println("Pen color: " + this.color);
        System.out.println("Tip: " + this.tip);
        System.out.println("Load: " + this.load);
        System.out.println("Is it covered? " + this.covered);
    }

    public void scribble () {
        if (this.covered == true) {
            System.out.println("ERRO! I can't scribble with the pen capped.\n");
        } else {
            System.out.println("I'm scribbling.\n");
        }
    }

    protected void cover () {
        this.covered = true;
    }

    protected void uncover () {
        this.covered = false;
    }
}