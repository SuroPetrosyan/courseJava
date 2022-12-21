package Service;

import Model.Dean;

import java.util.Scanner;

public class DeanService {
    public Dean createDean (){
        Scanner scanner2 = new Scanner(System.in);
        Dean dean = new Dean();
        System.out.println("*********************");
        System.out.println("First Name");
        String firstName = scanner2.next();
        dean.setFirstName(firstName);
        System.out.println("Last Name");
        String lastName = scanner2.next();
        dean.setLastName(lastName);
        System.out.println("Age");
        int age = scanner2.nextInt();
        dean.setAge(age);
        System.out.println("Degree");
        String degree = scanner2.next();
        dean.setDegree(degree);
        System.out.println("*******************************");
        return dean;

    }
}
