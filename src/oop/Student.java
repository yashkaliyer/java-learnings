package oop;

public class Student {
    String name;
    int rollNumber;
    String className;
    String schoolName;
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Class: " + className);
        System.out.println("School: " + schoolName);
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Rahul";
        s1.rollNumber = 12;
        s1.className = "10th";
        s1.schoolName = "ABC Public School";

        s1.displayDetails();
    }
}
