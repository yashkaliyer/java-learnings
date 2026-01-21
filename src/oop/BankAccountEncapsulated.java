package oop;

public class BankAccountEncapsulated {
    private int accountNumber;
    private int balance;
    public void deposit(int amount){
        balance = balance+amount;
    }
    public BankAccountEncapsulated(int accountNumber, int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void withdraw(int amount){
        if (amount <= balance){
            balance = balance - amount;
        }
        else
            System.out.println("you don't have money sir");

    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccountEncapsulated e1 = new BankAccountEncapsulated(12345,4000);
        e1.deposit(2000);
        e1.withdraw(20);
        System.out.println(e1.getBalance());
    }
}
