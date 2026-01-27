package collections;
import java.util.*;
public class StudentIdTracker {
    public static void main(String[] args) {
        HashSet<Integer> studentID = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter the Student ID no: " + i);
            int studentId = sc.nextInt();
            studentID.add(studentId);
        }
        System.out.println("Student IDs: " + studentID);
        System.out.println("Total unique Students: " + studentID.size());
    sc.close();
    }
}
