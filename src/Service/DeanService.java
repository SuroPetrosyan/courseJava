package Service;

import Model.Dean;

import java.util.Scanner;

public class DeanService {
    public Dean createDean (){
        Scanner scanner = new Scanner(System.in);
        Dean dean = new Dean();
        System.out.println("*********************");
        System.out.println("First Name");
        String firstName = scanner.next();
        dean.setFirstName(firstName);
        System.out.println("Last Name");
        String lastName = scanner.next();
        dean.setLastName(lastName);
        System.out.println("Age");
        int age = scanner.nextInt();
        dean.setAge(age);
        System.out.println("Degree");
        String degree = scanner.next();
        dean.setDegree(degree);
        System.out.println("*******************************");
        return dean;

    }
}
