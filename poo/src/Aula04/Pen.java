package Aula04;

public class Pen {
    public String model;
    private float tip;
    private String color;
    private boolean cover;

//    public Pen() {
//        this.model = "bic";
//        this.color = "Blue";
//        this.tip = 0.7f;
//        cover();
//    }

    public Pen(String model, String color, float tip) {
        setModel(model);
        this.color = color;
        setTip(tip);
        cover();
    }

    public String getModel() {
        return this.model;
    }
    public void setModel(String m) {
        this.model = m;
    }
    public float getTip() {
        return this.tip;
    }
    public void setTip(float t) {
        this.tip = t;
    }
    public void cover() {
        this.cover = true;
    }
    public void uncover() {
        this.cover = false;
    }
    public void stats() {
        System.out.println("About the pen:");
        System.out.println("Model: " + this.getModel());
        System.out.println("Tip: " + this.getTip());
        System.out.println("Color: " + this.color);
        System.out.println("Cover: " + this.cover);
    }
}