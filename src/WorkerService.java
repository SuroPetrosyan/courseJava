import Model.Worker;

import java.util.Scanner;

public class WorkerService {
    public Worker createWorker(){
        Scanner scanner = new Scanner(System.in);
        Worker worker = new Worker();
        System.out.println("*****************");
        System.out.println("Enter Worker Name");
        worker.setFirstName(scanner.next());
        System.out.println("Enter Worker Lastname");
        worker.setLastName(scanner.next());
        System.out.println("Enter Age of Worker");
        worker.setAge(scanner.nextInt());
        System.out.println("Enter Workexperience");
        worker.setWorkexperience(scanner.nextInt());
        System.out.println("Enter Salary");
        worker.setSalary(scanner.nextInt());
        return worker;

    }
}
