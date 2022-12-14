package Service;

import Model.Student;

import java.util.Objects;
import java.util.Scanner;

public class StudentService {
    public Student createStudent () {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.println("enter name of student");
        String name = scanner.next();
        student.setFirstName(name);
        System.out.println("enter last name of student");
        String lastName = scanner.next();
        student.setLastName(lastName);
        System.out.println("enter age of student");
        int age = scanner.nextInt();
        student.setAge(age);
        System.out.println("are you Armenian? answer 'yes' or 'no' ");
        boolean isArmenian = Objects.equals(scanner.next(), "yes");
        student.setArmenian(isArmenian);
        System.out.println("enter student gender");
        String s = scanner.next();
        char gender = s.charAt(0);
        student.setGender(gender);
        System.out.println("enter student mark");
        double mark = scanner.nextDouble();
        student.setMark(mark);
        student.printInfo();


        return student;
    }
}

