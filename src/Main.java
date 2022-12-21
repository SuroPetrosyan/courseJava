import Model.Dean;
import Model.Human;
import Model.Student;
import Model.Teacher;
import Service.StudentService;
import Service.TeacherService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    }

    Human human = new Human();
    Teacher teacher = new Teacher();
    Dean dean = new Dean();
    StudentService service = new StudentService();
    Student A = service.createStudent();
    Student B = service.createStudent();
    TeacherService service1 = new TeacherService();


}














