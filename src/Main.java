import Model.*;
import Service.DeanService;
import Service.StudentService;
import Service.TeacherService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DeanService deanService = new DeanService();
        TeacherService teacherService = new TeacherService();
        StudentService studentServiceservice = new StudentService();
        WorkerService workerService = new WorkerService();
        Student A = studentServiceservice.createStudent();
        Student B = studentServiceservice.createStudent();
        Student[ ]students = {A,B,};
        A.printInfo();
        System.out.println("******************l");
        B.printInfo();
        System.out.println("Dean profile");
        System.out.println("************************");
        Dean X = deanService.createDean();
        Dean Y = deanService.createDean();
        X.printInfo();
        System.out.println("********************");
        Y.printInfo();
        System.out.println("Teacher profile");
        System.out.println("*************************");
        Teacher L = teacherService.createTeacher();
        Teacher M = teacherService.createTeacher();
        L.printInfo();
        System.out.println("********************");
        M.printInfo();
        System.out.println("Enter Worker profile");
        System.out.println("******************************");
        Worker S = workerService.createWorker();
        Worker P = workerService.createWorker();
        S.printinfo();
        System.out.println("*********************");
        P.printinfo();
        System.out.println("*************");
        System.out.println("min age student");
        studentServiceservice.minAge(students).printInfo();




    }
}












