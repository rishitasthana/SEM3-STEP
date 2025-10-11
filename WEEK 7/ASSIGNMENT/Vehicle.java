// Transportation Fleet Management - Dynamic Method Dispatch

abstract class Vehicle {
    protected String id;

    public Vehicle(String id) {
        this.id = id;
    }

    // Unified dispatch method
    public abstract void dispatch();
}

// Bus class
class Bus extends Vehicle {
    private String route;
    private int passengerCapacity;

    public Bus(String id, String route, int passengerCapacity) {
        super(id);
        this.route = route;
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void dispatch() {
        System.out.println("Bus " + id + " dispatched on route " + route +
                " with capacity " + passengerCapacity + " passengers.");
    }
}

// Taxi class
class Taxi extends Vehicle {
    private String pickupLocation;
    private String dropoffLocation;
    private double distance; // in km

    public Taxi(String id, String pickupLocation, String dropoffLocation, double distance) {
        super(id);
        this.pickupLocation = pickupLocation;
        this.dropoffLocation = dropoffLocation;
        this.distance = distance;
    }

    @Override
    public void dispatch() {
        double fare = 50 + distance * 15; // base fare + per km
        System.out.println("Taxi " + id + " dispatched from " + pickupLocation +
                " to " + dropoffLocation + ". Estimated fare: ₹" + fare);
    }
}

// Train class
class Train extends Vehicle {
    private String schedule;
    private int carCount;

    public Train(String id, String schedule, int carCount) {
        super(id);
        this.schedule = schedule;
        this.carCount = carCount;
    }

    @Override
    public void dispatch() {
        System.out.println("Train " + id + " dispatched as per schedule: " + schedule +
                " with " + carCount + " cars.");
    }
}

// Bike class
class Bike extends Vehicle {
    private String station;
    private boolean isElectric;

    public Bike(String id, String station, boolean isElectric) {
        super(id);
        this.station = station;
        this.isElectric = isElectric;
    }

    @Override
    public void dispatch() {
        System.out.println("Bike " + id + " (" + (isElectric ? "Electric" : "Manual") +
                ") available at " + station + " station for eco-friendly trips.");
    }
}

// Demo class
public class TransportFleetDemo {
    public static void main(String[] args) {
        Vehicle[] fleet = new Vehicle[4];
        fleet[0] = new Bus("B12", "Central Park - City Mall", 50);
        fleet[1] = new Taxi("T7", "Airport", "Hotel Grand", 18.5);
        fleet[2] = new Train("TR3", "08:00 AM, Platform 2", 10);
        fleet[3] = new Bike("BK21", "Metro Station", true);

        for (Vehicle v : fleet) {
            v.dispatch();
            System.out.println();
        }
    }
}