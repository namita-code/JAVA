import java.util.Scanner;

abstract class Account {
    String customerName;
    String accountNumber;
    double balance;

    Account(String customerName, String accountNumber, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    abstract void displayBalance();
}

class Savings extends Account {
    double interestRate;

    Savings(String customerName, String accountNumber, double balance, double interestRate) {
        super(customerName, accountNumber, balance);
        this.interestRate = interestRate;
    }

    
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited:" + amount);
    }

   
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew:" + amount);
        } else {
            System.out.println("No balance");
        }
    }

    void computeAndDepositInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest deposit:" + interest);
    }

    
    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

class CurAcct extends Account {
    double minBalance;
    double serviceCharge;

    CurAcct(String customerName, String accountNumber, double initialBalance, double minBalance, double serviceCharge) {
        super(customerName, accountNumber, initialBalance);
        this.minBalance = minBalance;
        this.serviceCharge = serviceCharge;
    }

   
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

   
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
            checkForMinimumBalance();
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    void checkForMinimumBalance() {
        if (balance < minBalance) {
            balance -= serviceCharge;
            System.out.println("Penalty" + serviceCharge);
        }
    }

  
     void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account savingsAccount = new Savings("Namita", "S001", 1000, 5);
        Account currentAccount = new CurAcct("Yesh", "C001", 500, 200, 10);

        System.out.println("Namita");
        savingsAccount.displayBalance();
        savingsAccount.deposit(200);
        savingsAccount.withdraw(150);
        ((Savings) savingsAccount).computeAndDepositInterest();
        
        savingsAccount.displayBalance();

        System.out.println();
        System.out.println("Yesh");
        currentAccount.displayBalance();
        currentAccount.deposit(300);
        currentAccount.withdraw(400);
        currentAccount.withdraw(100); //
        currentAccount.displayBalance();
       
            }
}

