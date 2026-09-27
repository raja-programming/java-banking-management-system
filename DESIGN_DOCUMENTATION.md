# Banking Management System - Design Documentation

## Class Diagram

```text
+----------------------+
| BankOperations       |
| <<interface>>        |
+----------------------+
| + deposit(amount)    |
| + withdraw(amount)   |
| + getBalance()       |
+----------------------+
           ^
           |
+----------------------+
| BankAccount          |
| <<abstract>>         |
+----------------------+
| - accountNumber      |
| - accountHolderName  |
| - balance            |
| - transactions       |
+----------------------+
| + deposit()          |
| + getBalance()       |
| + showAccountDetails() |
| + showTransactionHistory() |
+----------------------+
           ^
           |
+----------------------+
| SavingsAccount       |
+----------------------+
| + withdraw()         |
+----------------------+

+----------------------+
| Transaction          |
+----------------------+
| - type               |
| - amount             |
| - dateTime           |
+----------------------+

+------------------------------+
| BankingManagementSystem      |
+------------------------------+
| + main()                     |
| + readNumber()               |
| + readAmount()               |
+------------------------------+