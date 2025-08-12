package Aula11;

public class Technical extends Student {
    private String professionalRegistration;

    public void toPractice() {
        System.out.println("Is practicing.");
    }

    public String getProfessionalRegistration() {
        return professionalRegistration;
    }

    public void setProfessionalRegistration(String professionalRegistration) {
        this.professionalRegistration = professionalRegistration;
    }
}