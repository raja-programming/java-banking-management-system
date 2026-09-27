public class SavingsAccount extends BankAccount {

    public SavingsAccount(int accountNumber, String accountHolderName) {
        super(accountNumber, accountHolderName);
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
            return false;
        }

        if (amount > getBalance()) {
            System.out.println("Insufficient balance.");
            return false;
        }

        setBalance(getBalance() - amount);
        transactions.add(new Transaction("Withdraw", amount));
        System.out.println("Withdrawal successful.");
        return true;
    }
}