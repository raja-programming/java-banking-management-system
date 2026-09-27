public interface BankOperations {
    void deposit(double amount);
    boolean withdraw(double amount);
    double getBalance();
}