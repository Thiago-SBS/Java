package Aula10;

public class Aula10 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Student p2 = new Student();
        Teacher p3 = new Teacher();
        Employee p4 = new Employee();

        p1.setName("Pedro");
        p2.setName("Maria");
        p3.setName("Cláudio");
        p4.setName("Fabiana");

        p2.setCourse("T.I.");
        p3.setSalary(2500.75);
        p4.setSector("Stock");
    }
}
