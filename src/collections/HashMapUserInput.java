package collections;
import java.util.*;
public class HashMapUserInput {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roll no:");
        int n = sc.nextInt();
        System.out.println("Enter the Name: ");
        String name = sc.next();
        map.put(n,name);
        System.out.println("Roll no: " + n + " is " + map.get(n));

    }
}
