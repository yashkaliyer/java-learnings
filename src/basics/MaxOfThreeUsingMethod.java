package basics;
import java.util.Scanner;
public class MaxOfThreeUsingMethod {
public static int max(int x,int y,int z){
    if(x>=y && x>=z){
        return x;
    }
    else if (y>=x && y>=z){
        return y;
    }
    else
        return z;

}

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=sc.nextInt();
        System.out.println("Enter the Second number");
        int num2=sc.nextInt();
        System.out.println("Enter the Third number");
        int num3=sc.nextInt();
    int result = max(num1,num2,num3);
        System.out.println("Max = "+result);
    }

}
