package encapsulation;


/*
Encapsulation

Encapsulation is the mechanism of bundling the data
(variables) and the code (methods) that manipulates the data into a
single unit, called a class.

 */


public class BankAccount {
    // balance is encapsulated and protected from direct access
    //it can only be modified through the deposit and withdraw methods, ensuring data integrity.
    private double balance;


    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
