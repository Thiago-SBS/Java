package Aula11;

public class Teacher extends Person {
    private String specialty;
    private double salary;

    public void increase (double increase) {
        setSalary(getSalary() + increase);
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}