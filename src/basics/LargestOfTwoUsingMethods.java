package basics;
import java.util.Scanner;
public class LargestOfTwoUsingMethods {
    public int large(int x, int y){
        if(x>y){
            return x;
        }
      else
          return y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the A");
        int a = sc.nextInt();
        System.out.println("Enter the B");
        int b = sc.nextInt();
        LargestOfTwoUsingMethods obj = new LargestOfTwoUsingMethods();
        int large = obj.large(a,b);
        System.out.println("large = "+ large);
    }
}
