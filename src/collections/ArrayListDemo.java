package collections;
import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First element of list");
        int n1= sc.nextInt();
        list.add(n1);
        System.out.println("Enter the Second element of list");
        int n2= sc.nextInt();
        list.add(n2);
        System.out.println("Enter the Third element of list");
        int n3= sc.nextInt();
        list.add(n3);
        System.out.println("Enter the Forth  element of list");
        int n4= sc.nextInt();
        list.add(n4);
        System.out.println("Enter the Fifth element of list");
        int n5= sc.nextInt();
        list.add(n5);
        System.out.println(list);
        System.out.println("Size of list: " + list.size());
        System.out.println("Element in 3rd index: " + list.get(3));
        System.out.println("Remove the 3rd index: " + list.remove(3));
        System.out.println("Size of the list (after removing):  " + list.size());
    }
}
