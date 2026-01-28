package exceptions;
import java.util.*;
public class DivideTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the first number:");
            int a = sc.nextInt();
            System.out.println("Enter the second number");
            int b = sc.nextInt();
            int result = a/b;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e){
            System.out.println("cannot divide by zero");
        }
        catch (InputMismatchException e){
            System.out.println("Enter the valid numbers");
        }
        finally {
            System.out.println("program ended");
        }
        sc.close();
    }

}
