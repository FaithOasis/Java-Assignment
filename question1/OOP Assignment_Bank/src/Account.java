
public class Account extends Bank {
    public Account(String accountName, double balance) {
        super(accountName, balance);
    }
    @Override
    protected void withdraw(double amount) throws AmountExceedsBalance {
        if (amount > balance) {
            recordTransaction(accountName + "failed to withdraw $" + "due to insufficient funds");
            throw new AmountExceedsBalance("Amount exceeds your current balance");
        }
        balance -= amount;
        System.out.println("You have successfully withdrawn $" + amount);
        recordTransaction(accountName + "withdrew $" + amount + " New Balance: $" + balance);
    }
    @Override
    protected void deposit(double amount) throws InvalidDepositAmount {
        if (amount <= 0) {
            throw new InvalidDepositAmount("Deposit an amount greater than 0");
        } else {
            balance += amount;
            System.out.println("You have successfully deposited $" + amount);
            recordTransaction(accountName + "deposited $" + amount + "| New balance: $" + balance);
        }
    }
    @Override
    protected double getBalance() {
        System.out.println("Current Balance: $" + balance);
        recordTransaction(accountName + "checked balance | Balance: $" + balance);
        return balance;
    }
}

