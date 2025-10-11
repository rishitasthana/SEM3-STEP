// All classes in one file: VehicleFuelTest.java

abstract class Vehicle {
    public abstract void start();

    public void stop() {
        System.out.println("Vehicle stopped.");
    }
}

interface Fuel {
    void refuel();
}

class Car extends Vehicle implements Fuel {
    @Override
    public void start() {
        System.out.println("Car started.");
    }

    @Override
    public void refuel() {
        System.out.println("Car is refueling.");
    }
}

public class VehicleFuelTest {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.stop();
        myCar.refuel();
    }
}