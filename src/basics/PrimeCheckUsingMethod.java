package basics;
import java.util.Scanner;
public class PrimeCheckUsingMethod {
    public void checkPrime(int n){
        int count= 0;
        for(int i = 1; i<=n;i++){
            if (n%i==0){
                 count++;
            }
        }
        if (count==2){
            System.out.println("prime number");
        }
        else System.out.println("Not a prime number");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        PrimeCheckUsingMethod obj = new PrimeCheckUsingMethod();
        obj.checkPrime(num);
    }
}
