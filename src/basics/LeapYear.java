package basics;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Year: ");
        year= sc.nextInt();
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
        {
            System.out.println("Leap Year");
        }
        else
            System.out.println("Not a Leap Year");
        sc.close();
    }
}
