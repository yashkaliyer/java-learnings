package basics;
import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if (n==0){
            System.out.println("The number is Zero");
        }
        else if (n>=1){
            System.out.println("the number is Positive");
        }
        else
            System.out.println("the number is negative");
    }
}
