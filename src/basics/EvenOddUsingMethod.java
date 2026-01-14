package basics;
import java.util.Scanner;
public class EvenOddUsingMethod {
    public void OddEven(int n){
        if(n%2==0){
            System.out.println("Even");
        }
        else
            System.out.println("Odd");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num  =  sc.nextInt();
        EvenOddUsingMethod obj = new EvenOddUsingMethod();
        obj.OddEven(num);
    }
}
