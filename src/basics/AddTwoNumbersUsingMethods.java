package basics;
import java.util.Scanner;
public class AddTwoNumbersUsingMethods {
    public int sum(int x,int y){
        return x+y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the A");
        int a = sc.nextInt();
        System.out.println("Enter the B");
        int b = sc.nextInt();
        AddTwoNumbersUsingMethods obj = new AddTwoNumbersUsingMethods();
        int sum = obj.sum(a,b);
        System.out.println("A + B = "+sum);

    }

}
