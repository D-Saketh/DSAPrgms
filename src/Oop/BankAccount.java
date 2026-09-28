package Oop;
import java.util.*;
public class BankAccount {
    private String AccName;
    private int AccNum;
    private double balance;

    BankAccount(String AccName, int AccNum) {
        this.AccName = AccName;
        this.AccNum = AccNum;
        this.balance = 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount after deposit " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.print("Balance is " + balance);
        } else {
            System.out.print("Not available ");
        }
    }

    public void checkBalance() {
        System.out.print("Balance is " + balance);
    }

    public void displayDetails() {
        System.out.print("AccName is " + AccName);
        System.out.print("AccNum is " + AccNum);
    }
}
    class Banker {
        public static void main(String args[]) {
            Scanner S = new Scanner(System.in);
            String AccName = S.nextLine();
            //S.nextLine();
            int AccNum = S.nextInt();
            BankAccount bank = new BankAccount(AccName, AccNum);
            while (true) {

                System.out.println("\n1.Deposit");
                System.out.println("2.Withdraw");
                System.out.println("3.Check Balance");
                System.out.println("4.Display Details");
                System.out.println("5.Exit");

                System.out.print("Enter Choice : ");
                int choice = S.nextInt();

                switch (choice) {

                    case 1:
                        System.out.print("Amount : ");
                        bank.deposit(S.nextDouble());
                        break;

                    case 2:
                        System.out.print("Amount : ");
                        bank.withdraw(S.nextDouble());
                        break;

                    case 3:
                        bank.checkBalance();
                        break;

                    case 4:
                        bank.displayDetails();
                        break;

                    case 5:
                        System.out.println("Thank You");
                        return;

                    default:
                        System.out.println("Invalid Choice");
                }
            }
        }
    }

