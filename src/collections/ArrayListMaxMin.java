package collections;
import java.util.*;
public class ArrayListMaxMin {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner (System.in);
        for(int i = 1; i <= 10;i++){
            System.out.println("Enter the element no " + i + ":");
            int n = sc.nextInt();
            list.add(n);
        }
        int max = list.get(0);
        int min = list.get(0);
        for(int n:list){
            if(n>max){
                max = n;
            }
            if(n<min){
                min=n;
            }
        }
        System.out.println("Maximum value: " + max );
        System.out.println("Minimum value: " + min);

    }
}
