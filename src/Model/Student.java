package Model;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private boolean isArmenian;
    private char gender;
    private double mark;

    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setArmenian(boolean armenian) {
        isArmenian = armenian;

    }

    public boolean isArmenian() {
        return isArmenian;
    }

    public void setGender(char gender) {
        this.gender = gender;

    }

    public char getGender() {
        return gender;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public double getMark() {
        return mark;
    }

    public void printInfo() {
        System.out.println("First Name" + ": " + firstName);
        System.out.println("Last Name" +  ":  " + lastName);
        System.out.println("age" + ":  "  + age);
        System.out.println("is Armenian" +  ":  "+ (isArmenian?"yes":"no"));
        System.out.println("gender" +  ":  " + gender);
        System.out.println("mark" + ":  "+  mark);
    }
}



