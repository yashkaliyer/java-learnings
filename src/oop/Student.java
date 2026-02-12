package oop;
// yash
public class Student extends Person{
    int rollno;
    int marks;
    public Student( String name,int age,int rollno,int marks){
        super(name,age);
        this.rollno=rollno;
        this.marks=marks;

    }
    void displayStudent() {
        displayPerson();
        System.out.println("Roll Number: " + rollno);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Yash", 20, 101, 85);
        s1.displayStudent();
    }
}
