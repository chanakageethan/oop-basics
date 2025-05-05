


import abstraction.Bike;
import abstraction.Car;
import encapsulation.BankAccount;
import inheritance.Dog;

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

        //----------------------------------------------------------------------------
        //abstraction
        Car car = new Car();
        Bike bike = new Bike();
        car.move();
        bike.move();
        //----------------------------------------------------------------------------

        //----------------------------------------------------------------------------
        //Inheritance
        Dog myDog = new Dog();
        myDog.eat();  // Inherited method from Animal
        myDog.bark(); // Method in Dog
        //----------------------------------------------------------------------------

    }
}