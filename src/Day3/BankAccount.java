package Day3;

public class BankAccount {

    private double balance;
    private double accountLimit;

    public BankAccount() {
        balance = 0.0;
        accountLimit = 5000;
    }

    public BankAccount(double blnc, double limit) {
        balance = blnc;
        accountLimit = limit;
    }

    public void deposit(double amount) {
        if (amount <= 5000) {
            this.balance += amount;
        } else
            System.out.println("Transaction canceled. Max deposit - 5000 | Your deposit: " + amount);
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else
            System.out.println("There is not enough funds.");
    }

    public void printBalance() {
        System.out.println("Current balance= " + this.balance);
    }

    public void transferBalance(BankAccount acc, double transferAmt) {
        if (this.balance >= transferAmt) {
            acc.deposit(transferAmt);
            this.withdraw(transferAmt);
        } else
            System.out.println("Transfer canceled. You are trying to transfer " + transferAmt + " units, but only " + getBalance() + " are available.");
    }

    public double getBalance() {
        return this.balance;
    }

    public double getAccountLimit() {
        return this.accountLimit;
    }

    public void setAccountLimit(double limit) {
        this.accountLimit = limit;
    }
}

class Main {
    public static void main(String[] args) {
        // CREATING OBJECT
        BankAccount a1 = new BankAccount(10, 5000);
        BankAccount b2 = new BankAccount(20, 5000);

        // TESTING TASK 1
        System.out.print("Withdraw more money from a1 \n");
        a1.withdraw(15);


        // TESTING TASK 2
        System.out.print("depositing more money to a1 \n");
        a1.deposit(6000);


        // TESTING TASK 3
        System.out.print("a1: ");
        a1.printBalance();
        System.out.print("\nb2: ");
        b2.printBalance();
        System.out.print("\n");
        System.out.print("Transferring from a1 account to b1 account \n");
        a1.transferBalance(b2, 350);
        System.out.print("a1: ");
        a1.printBalance();
        System.out.print("\nb2: ");
        b2.printBalance();
        System.out.print("\n");

    }
}
