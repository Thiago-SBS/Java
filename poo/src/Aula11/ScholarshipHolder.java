package Aula11;

public class ScholarshipHolder extends Student {
    private int scholarship;

    public void renewScholarship() {
        System.out.println(getName() + "'s scholarship war renewed.");
    }

    @Override
    public void payMonthlyFee() {
        System.out.println("payment of scholarship holder " + getName() + " made\n");
    }

    public int getScholarship() {
        return scholarship;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }
}