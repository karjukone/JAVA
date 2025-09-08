import java.util.Random;

public class BankAccount {
    public int accountNumber;
    public int balance;
    public static int accountCounter;
    Random random = new Random();

    public BankAccount(int balance) {
        this.balance = balance;
        this.accountNumber = 100000000 + random.nextInt(99999999);
        accountCounter ++;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public int getTotalAccounts() {
        return accountCounter;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        account1.deposit(500);
        account2.withdraw(800);

        System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());

        System.out.println("Total number of accounts: " + account1.getTotalAccounts());
    }
}