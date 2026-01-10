package basics;
import java.util.Scanner;
public class LargestOfTwo {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number A: ");
        a=sc.nextInt();
        System.out.println("Enter the Number B: ");
        b=sc.nextInt();
        if (a>b){
            System.out.println("A is larger than B");
        }
        else if (b>a) {
            System.out.println("B is the larger than the A");
        }
        else
            System.out.println("Both the numbers are Equal");
        sc.close();
    }
}
