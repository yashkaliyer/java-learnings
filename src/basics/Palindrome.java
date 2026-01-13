package basics;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        int r=0;
        int original = n;
        int digit;
        while(n>0){
            digit = n % 10;
            r=r*10+digit;
            n = n/10;
        }
        if (r == original )
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
