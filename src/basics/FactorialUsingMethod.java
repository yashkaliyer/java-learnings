package basics;
import java.sql.SQLOutput;
import java.util.Scanner;
public class FactorialUsingMethod {
    public void factorial(int x){
       int fact = 1;
       for(int i = 1; i<=x;i++){
           fact = fact * i;
       }
        System.out.println("Factorial of " + x + " is: " + fact);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        FactorialUsingMethod obj = new FactorialUsingMethod();
        obj.factorial(num);


    }
}
