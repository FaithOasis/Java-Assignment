import java.io.*;
abstract class Bank {
    protected String accountName;
    protected double balance;

    public Bank(String accountName, double balance){
        this.accountName = accountName;
        this.balance = balance;
    }

    protected abstract void deposit(double amount) throws InvalidDepositAmount;
    protected abstract void withdraw(double amount)  throws AmountExceedsBalance;
    protected abstract double getBalance();

    protected void recordTransaction(String message){
        try (PrintWriter writer = new PrintWriter(new FileWriter("Bank.txt", true))){
            writer.println(message); //todo: edit


            System.out.println("Transaction has been recorded");
        }
        catch (IOException e){
            System.out.println("There was an error recording the transaction" + e.getMessage());
        }
    }
}


