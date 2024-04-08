package Practical;

// Abstract class
abstract class Vehicle {
    // Abstract methods
    public abstract void start();
    public abstract void stop();
}

// Concrete class: Car
class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }
}

// Concrete class: Motorcycle
class Motorcycle extends Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle is stopping...");
    }
}

public class AbstractVehicleDemo {
    public static void main(String[] args) {
        // Creating instances of Car and Motorcycle
        Car myCar = new Car();
        Motorcycle myMotorcycle = new Motorcycle();

        // Demonstrating abstract class methods
        myCar.start();
        myCar.stop();
        myMotorcycle.start();
        myMotorcycle.stop();
    }
}
