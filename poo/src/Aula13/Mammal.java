package Aula12;

public class Mammal extends Animal {
    private String furColor;

    @Override
    public void move() {
        System.out.println("Running\n");
    }
    @Override
    public void toFeed() {
        System.out.println("breastfeeding\n");
    }
    @Override
    public void makeSound() {
        System.out.println("grunting\n");
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
}