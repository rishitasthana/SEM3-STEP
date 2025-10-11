// All classes in one file: TransportTest.java

abstract class Vehicle {
    protected int speed;
    protected String fuelType;

    public Vehicle(int speed, String fuelType) {
        this.speed = speed;
        this.fuelType = fuelType;
    }

    public abstract void startEngine();
}

interface Maintainable {
    void serviceInfo();
}

class Car extends Vehicle implements Maintainable {
    private String model;

    public Car(int speed, String fuelType, String model) {
        super(speed, fuelType);
        this.model = model;
    }

    @Override
    public void startEngine() {
        System.out.println(model + " engine started. Speed: " + speed + " km/h, Fuel: " + fuelType);
    }

    @Override
    public void serviceInfo() {
        System.out.println(model + " requires servicing every 10,000 km.");
    }
}

public class TransportTest {
    public static void main(String[] args) {
        Car myCar = new Car(180, "Petrol", "Honda City");
        myCar.startEngine();
        myCar.serviceInfo();
    }
}