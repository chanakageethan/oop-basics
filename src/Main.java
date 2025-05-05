


//abstraction
//inheritance
//polymorphism


import encapsulation.BankAccount;

public class Main {
    public static void main(String[] args) {

        //----------------------------------------------------------------------------
        //encapsulation
        BankAccount bankAccount = new BankAccount(100000);
        System.out.println( bankAccount.getBalance());
        bankAccount.deposit(5000);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(1000);
        System.out.println(bankAccount.getBalance());
        //----------------------------------------------------------------------------




    }
}