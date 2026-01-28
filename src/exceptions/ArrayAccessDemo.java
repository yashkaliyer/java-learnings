package exceptions;
import java.util.*;
public class ArrayAccessDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
       try {

           for (int i = 0; i <= 4; i++) {
               System.out.println("enter the element no: " + i);
               arr[i] = sc.nextInt();
           }
           System.out.println("Enter the index to access:");
           int index = sc.nextInt();
           System.out.println("value : " + arr[index]);
       }
       catch (ArrayIndexOutOfBoundsException e){
           System.out.println("enter valid index");
       }
       finally {
           System.out.println("program ended"
           );
           sc.close();
       }

    }
}
