package collections;
import java.util.*;
 class Student{
     int rollNo;
     String name;
     int age;
     public Student(int rollNo,String name, int age){
         this.rollNo = rollNo;
         this.name = name;
         this.age = age;
     }
     public void display(){
         System.out.println(rollNo + " " + name + " " + age);
     }
 }
public class StudentsMap {
    public static void main(String[] args) {
      HashMap<Integer,Student> map = new HashMap<>();
      Student s1 = new Student(101,"Yash",20);
      Student s2 = new Student(102,"Bhagat",20);
      Student s3 = new Student(103,"Ramesh",21);

      map.put(s1.rollNo, s1);
      map.put(s2.rollNo, s2);
      map.put(s3.rollNo, s3);
      for(Student s : map.values()){
          s.display();
      }


    }
}
