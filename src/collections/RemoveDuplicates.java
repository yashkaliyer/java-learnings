package collections;
import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i =1;i<=10;i++){
            System.out.println("Enter the element no: " + i );
            int n = sc.nextInt();
            list.add(n);
        }
        HashSet<Integer> set = new HashSet<>(list);
        ArrayList<Integer> uniqueList = new ArrayList<>(set);
        System.out.println("Unique elements: " + uniqueList);

    }
}
