package collections;
import java.util.ArrayList;
import java.util.Scanner;
public class FilterEvenNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner (System.in);
        for(int i = 1; i <= 5;i++){
            System.out.println("Enter the element no " + i + ":");
            int n = sc.nextInt();
            list.add(n);
        }
        System.out.println(" Even numbers in the list :");
        for(int n :list){
            if (n%2==0){
                System.out.println(n);
            }
        }
    }

}
