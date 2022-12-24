package Service;

import Model.Student;

import java.util.Scanner;

public class StudentService {
    public Student createStudent() {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.println("***************************");
        System.out.println("First Name");
        student.setFirstName(scanner.next());
        System.out.println("Last Name");
        student.setLastName(scanner.next());
        System.out.println("Age");
        student.setAge(scanner.nextInt());
        System.out.println("Mark");
        student.setMark(scanner.nextDouble());
        System.out.println("Cource");
        student.setCourse(scanner.nextInt());
        System.out.println("Student ID");
        student.setStudentID(scanner.next());
        System.out.println("***************************");
        return student;

    }

    public Student minAge(Student[] students) {
        Student student = students[0];
        for (int i = 1; i < students.length; i++) {
            int minage = students[0].getAge();
            if (students[i].getAge() < minage) {
                minage = students[i].getAge();
                student = students[i];
            }
        }

        return student;
    }
}

