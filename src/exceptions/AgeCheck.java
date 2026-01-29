package exceptions;
import java.util.*;
class AgeException extends Exception{
    public AgeException(String string){
        super(string);
    }
}
public class AgeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age ");
        int age = sc.nextInt();
        try {
            if(age>=18) {
                System.out.println("You are eligible for voting");
            }else
                throw new AgeException("minor");

        } catch (AgeException e) {
            System.out.println(e.getMessage() );
        }
    }
}
