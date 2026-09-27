import java.util.Scanner;

public class BankingManagementSystem {
    static Scanner scanner = new Scanner(System.in);

    static int readNumber(String message) {
        while (true) {
            System.out.print(message);

            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    static double readAmount(String message) {
        while (true) {
            System.out.print(message);

            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid amount. Please enter a valid number.");
            }
        }
    }

    public static void main(String[] args) {
        BankAccount account = new SavingsAccount(1001, "Rajamanickam");

        int choice;

        do {
            System.out.println("\n--- Banking Management System ---");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. View Transaction History");
            System.out.println("5. View Account Details");
            System.out.println("6. Exit");

            choice = readNumber("Enter your choice: ");

            switch (choice) {
                case 1:
                    try {
                        double amount = readAmount("Enter deposit amount: ");
                        account.deposit(amount);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    double amount = readAmount("Enter withdrawal amount: ");
                    account.withdraw(amount);
                    break;

                case 3:
                    System.out.println("Current Balance: Rs." + account.getBalance());
                    break;

                case 4:
                    account.showTransactionHistory();
                    break;

                case 5:
                    account.showAccountDetails();
                    break;

                case 6:
                    System.out.println("Thank you for using the Banking Management System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1 to 6.");
            }

        } while (choice != 6);

        scanner.close();
    }
}