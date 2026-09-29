package ExercicioPOO;

public class BankAccount {
    
    public String holder;
    public double balance;

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public  double getBalance() {
        return balance;
    }

    public boolean hasBalance() {
        return balance > 0;
    }
}