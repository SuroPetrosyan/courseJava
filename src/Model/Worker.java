package Model;

public class Worker extends Human {

    private int workexperience;
    private int salary;

    public int getWorkexperience() {
        return workexperience;
    }

    public void setWorkexperience(int workexperience) {
        this.workexperience = workexperience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;

    }
    public void printinfo(){
        super.printInfo();
        System.out.println(workexperience+ ":" + "Workexperience");
        System.out.println(salary+":" +"Salary");
    }
}
