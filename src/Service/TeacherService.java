package Service;

import Model.Human;
import Model.Teacher;

import java.util.Scanner;


public class TeacherService {
    public Teacher createTeacher () {
        Scanner scanner = new Scanner(System.in);
        Teacher teacher = new Teacher();
        System.out.println("***************************");
        System.out.println("First Name");
        String firstName = scanner.next();
        teacher.setFirstName(firstName);
        System.out.println("Last Name");
        String lastName = scanner.next();
        teacher.setLastName(lastName);
        System.out.println("Age");
        int age = scanner.nextInt();
        teacher.setAge(age);
        System.out.println("Experience");
        double experience = scanner.nextDouble();
        teacher.setExperience(experience);
        System.out.println("**************************");
        return teacher;
    }
}
