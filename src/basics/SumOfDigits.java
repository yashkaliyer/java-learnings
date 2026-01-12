package basics;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int digit=0;
        int sum = 0;
        while(n>0){
            digit=n%10;
            sum+=digit;
            n=n/10;
        }
        System.out.println("Sum of digits is: " + sum);
    }
}
