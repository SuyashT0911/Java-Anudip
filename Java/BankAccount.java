import java.util.*;
public class BankAccount {
    static int balance=5000;
    public static int withdraw(int amount)
    {
        int result = 0;
        try {
            
            if(balance>amount && amount<0) {
                throw new Exception("Balance is low");
            }            else{
                 result = balance - amount;
                System.out.println("withdraw is succesfully");
                balance = result;
            }
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
    }
    public static int deposit(int amount)
    {
        balance = balance + amount;
        return balance;
    }
    public static void main(String[] args) {
        int amount;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the withdraw amount");
        amount=scanner.nextInt();
        System.out.println("status"+withdraw(amount));
        System.out.println("Enter the deposit amount");
        amount=scanner.nextInt();
        System.out.println("status"+deposit(amount)); 
    }
}
