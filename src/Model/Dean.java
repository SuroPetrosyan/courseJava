package Model;

public class Dean extends Human{
    private String degree;

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
    public void printInfo() {
        super.printInfo();
        System.out.println(degree + ":" + "Degree");

    }
}
