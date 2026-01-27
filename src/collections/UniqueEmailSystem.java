package collections;
import java.util.*;
public class UniqueEmailSystem {
    public static void main(String[] args) {
        HashSet<String> emails = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i<=10; i++){
            System.out.println("Enter the email no: " + i);
            String email = sc.next();
            emails.add(email);
        }
        System.out.println("total Emails entered: 10");
        System.out.println("Unique Emails no: " + emails.size());
        System.out.println("Unique Emails: " + emails);
        sc.close();
    }
}
