// All classes in one file: VehicleTest.java

abstract class Vehicle {
    // Abstract method start()
    public abstract void start();

    // Non-abstract method fuelType()
    public void fuelType() {
        System.out.println("Uses fuel");
    }
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with key");
    }
}

class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bike starts with kick");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        // Vehicle reference pointing to Car
        Vehicle v1 = new Car();
        v1.start();
        v1.fuelType();

        // Vehicle reference pointing to Bike
        Vehicle v2 = new Bike();
        v2.start();
        v2.fuelType();
    }
}