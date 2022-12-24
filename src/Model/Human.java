package Model;

public class Human {
    private String firstName;
    private String lastName;
    private int age=2022;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 1905 && age < 2022)
            this.age = age;
    }

    public void printInfo() {
        System.out.println(firstName + ":" + "First Name");
        System.out.println(lastName + ":" + "Last Name");
        System.out.println(age + ":" + "Age");
    }
}