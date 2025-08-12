package Aula09;

public class Aula09 {
    public static void main(String[] args) {

        Person p1 = new Person("Pedro", 22, "M");
        Person p2 = new Person("Maria", 25, "F");

        Book l1 = new Book("Aprendendo Java", "José da Silva", 300, p1);
        Book l2 = new Book("Le Petit Prince", "Antoine de Saint-Exupéry", 96, p2);
        Book l3 = new Book("POO para Iniciantes", "Maria Candido", 800, p1);

        System.out.println(l2.details());
    }
}
