package basics;
import java.util.Scanner;
public class PrimeNumbersUsingMethod {
    public static void isPrime(int num) {
        for (int a = 1; a <= num; a++) {
            int count = 0;

            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(a + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        isPrime(num);
    }
}

