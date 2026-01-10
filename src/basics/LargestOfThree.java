package basics;
import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the A: ");
        a=sc.nextInt();
        System.out.println("Enter the B: ");
        b=sc.nextInt();
        System.out.println("Enter the C: ");
        c=sc.nextInt();

        if (a>b && a>c){
            System.out.println("A is the Largest Number");
        }
        else if (b>a && b>c){
            System.out.println("B is the Largest Number");
        }
        else if(c>a && c>b){
            System.out.println("C is the largest Number");
        }
        else
            System.out.println(" All the Numbers are equal");
        sc.close();
    }
}
