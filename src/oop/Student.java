package oop;

public class Student {

    // Instance variables (data)
    String name;
    int rollNumber;
    String className;
    String schoolName;

    // Method (behavior)
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Class: " + className);
        System.out.println("School: " + schoolName);
    }

    public static void main(String[] args) {

        // Creating an object of Student
        Student s1 = new Student();

        // Assigning values to object variables
        s1.name = "Rahul";
        s1.rollNumber = 12;
        s1.className = "10th";
        s1.schoolName = "ABC Public School";

        // Calling method using object
        s1.displayDetails();
    }
}
