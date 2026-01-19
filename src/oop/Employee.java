package oop;

public class Employee {

    // Instance variables
    int employeeId;
    String name;
    double salary;

    Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }


    void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Rahul", 35000);
        Employee e2 = new Employee(102, "Amit", 42000);

        e1.displayDetails();
        System.out.println("-----");
        e2.displayDetails();
    }
}
