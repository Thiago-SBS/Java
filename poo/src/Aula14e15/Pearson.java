package Aula14;

public abstract class Pearson {
    protected String name;
    protected int age;
    protected String gender;
    protected int experience;

    public Pearson(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.experience = 0;
    }

    protected int winExperience() {

        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String toString() {
        return "Pearson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", experience=" + experience +
                '}';
    }
}