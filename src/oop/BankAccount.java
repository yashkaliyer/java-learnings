package oop;

public class BankAccount {
    int AccountNumber;
    String name;
    int bankBalance;
     public void deposit(int d){
        bankBalance=d+bankBalance;
         System.out.println("Deposited Amount: " + d);
         System.out.println("current Balance: " + bankBalance);

     }
     public void credit(int c ){
         if (bankBalance>c){
             bankBalance=bankBalance-c;
             System.out.println("Credited Amount: " + c);
             System.out.println("current Balance: " + bankBalance);
         }
         else
             System.out.println("Not enough Balance");

     }
     public void displayDetails(){
         System.out.println("Account Number: " +AccountNumber );
         System.out.println("Account holder's Name: " + name);
         System.out.println("BankBalance: " + bankBalance);


     }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.name="bhagat";
        b1.AccountNumber= 1234567;
        b1.bankBalance=33000;

        b1.credit(3000);
        b1.deposit(200);
        b1.displayDetails();
    }

}
