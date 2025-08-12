package Aula11;

public class Aula11 {
    public static void main(String[] args) {
        //Person p1 = new Person(); metodo abstrato não pode gerar objetos!
        Visitor v1 = new Visitor();
        v1.setName("Thiago");
        v1.setAge(24);
        v1.setGender("M");
        Student s1 = new Student();
        s1.setName("Gabriel");
        s1.setAge(24);
        s1.setGender("M");
        s1.setRegistration(991127);
        s1.setCourse("TI");
    }
}