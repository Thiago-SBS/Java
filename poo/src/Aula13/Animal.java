package Aula12;

public abstract class Animal {
    protected double weight;
    protected int age;
    protected int bodyParts;


    public abstract void move();
    public abstract void toFeed();
    public abstract void makeSound();
}