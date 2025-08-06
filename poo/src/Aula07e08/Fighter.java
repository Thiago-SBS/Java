package Aula07e08;

public class Fighter {
    private String name;
    private String nationality;
    private int age;
    private double height;
    private double weight;
    private String category;
    private int victories;
    private int loses;
    private int draw;

    public Fighter(String nm, String na, int ag, double hg, double wg, int vt, int ls, int dw) {
        name = nm;
        nationality = na;
        age = ag;
        height = hg;
        setWeight(wg);
        victories = vt;
        loses = ls;
        draw = dw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        setCategory();
    }

    public String getCategory() {
        return category;
    }

    private void setCategory() {
        if (weight < 52.2) {
            category = "Invalid.";
        } else if (weight <= 70.3) {
            category = "Light";
        } else if (weight <= 83.9) {
            category = "medium";
        } else if (weight <= 120.2) {
            category = "Heavy";
        } else {
            category = "Invalid.";
        }
    }

    public int getVictories() {
        return victories;
    }

    public void setVictories(int victories) {
        this.victories = victories;
    }

    public int getLoses() {
        return loses;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public void toPresent() {
        System.out.println("--------------------------------------");
        System.out.println("IIIIIT'SS TIIIIMEEEEE!!!");
        System.out.println("Now entering the arena, " + getName());
        System.out.println("Directly from " + getNationality());
        System.out.println("At " + getAge() + " years old and " + getHeight() + " meters tall");
        System.out.println("weighing " + getWeight() + " Kg");
        System.out.println(getVictories() + " victories");
        System.out.println(getLoses() + " loses and");
        System.out.println(getDraw() +" draws!");
        System.out.println("--------------------------------------");
    }

    public void status() {
        System.out.println("Fighter: " + getName());
        System.out.println("Nationality: " + getNationality());
        System.out.println("Age: " + getAge());
        System.out.println("Height: " + getHeight());
        System.out.println("Weight: " + getWeight() + "Kg");
        System.out.println("Category: " + getCategory());
        System.out.println("Victories: " + getVictories());
        System.out.println("Loses: " + getLoses());
        System.out.println("Draw: " + getDraw() + "\n");
    }

    public void winFight() {
        setVictories(getVictories() + 1);
    }

    public void loseFight() {
        setLoses(getLoses() + 1);
    }

    public void drawFight() {
        setDraw(getDraw() + 1);
    }
}