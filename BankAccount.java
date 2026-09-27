import java.util.ArrayList;

public abstract class BankAccount implements BankOperations {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    protected ArrayList<Transaction> transactions = new ArrayList<>();

    public BankAccount(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be greater than zero.");
        }

        balance = balance + amount;
        transactions.add(new Transaction("Deposit", amount));
        System.out.println("Deposit successful.");
    }

    public void showAccountDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: Rs." + balance);
    }

    public void showTransactionHistory() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
        } else {
            System.out.println("\n--- Transaction History ---");

            for (Transaction transaction : transactions) {
                System.out.println(transaction);
            }
        }
    }
}