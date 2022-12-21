package Service;

import Model.Human;
import Model.Teacher;

import java.util.Scanner;

public class TeacherService {
    public Teacher createTeacher () {
        Scanner scanner1 = new Scanner(System.in);
        Teacher teacher = new Teacher();
        System.out.println("***************************");
        System.out.println("First Name");
        String firstName = scanner1.next();
        teacher.setFirstName(firstName);
        System.out.println("Last Name");
        String lastName = scanner1.next();
        teacher.setLastName(lastName);
        System.out.println("Age");
        int age = scanner1.nextInt();
        teacher.setAge(age);
        System.out.println("Experience");
        double experience = scanner1.nextDouble();
        teacher.setExperience(experience);
        System.out.println("**************************");
        return teacher;
    }
}
