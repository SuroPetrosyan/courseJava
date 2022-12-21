package Model;

public class Teacher extends Human {
    private double experience;

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public void printInfo (){
        super.printInfo();
        System.out.println(experience+":" + "Experience");
    }
}