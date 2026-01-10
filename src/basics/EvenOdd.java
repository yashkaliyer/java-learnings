package basics;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n%2==0){
            System.out.println("Number is Even");}
            else {
                System.out.println("Number is odd");
            }
        }

    }

