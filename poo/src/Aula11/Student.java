package Aula11;

public class Student extends Person {
    private int registration;
    private String course;

    public void payMonthlyFee() {
        System.out.println("Payment was made.\n");
    }

    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}