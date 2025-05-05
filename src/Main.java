


import abstraction.Bike;
import abstraction.Car;
import encapsulation.BankAccount;
import inheritance.Dog;
import polymorphism.Circle;
import polymorphism.Rectangle;
import polymorphism.Shape;

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

        //----------------------------------------------------------------------------
        //Polymorphism
        Shape myShape = new Circle(); // Polymorphic reference
        myShape.draw(); // Outputs "Drawing a circle

        Shape myShape2 = new Rectangle();
        myShape2.draw();
        //----------------------------------------------------------------------------

    }
}