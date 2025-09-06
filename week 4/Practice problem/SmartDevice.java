public class SmartDevice {
    private String deviceName;
    private String location;
    private boolean isOnline;
    private double powerConsumption;
    private String[] connectedDevices;
    private int connectionCount;

    // Constructor with parameter names matching field names
    public SmartDevice(String deviceName, String location,
                       boolean isOnline, double powerConsumption) {
        this.deviceName = deviceName;
        this.location = location;
        this.isOnline = isOnline;
        this.powerConsumption = powerConsumption;
        this.connectedDevices = new String[5];
        this.connectionCount = 0;
    }

    // Method using this for parameter disambiguation
    public void updateLocation(String location) {
        this.location = location;
        System.out.println(this.deviceName + " moved to " + this.location);
    }

    public void updatePowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
        System.out.println("Power consumption updated for " + this.deviceName);
    }

    // Method returning this for chaining
    public SmartDevice setOnline(boolean isOnline) {
        this.isOnline = isOnline;
        return this;
    }

    public SmartDevice connectToDevice(String deviceName) {
        if (this.connectionCount < this.connectedDevices.length) {
            this.connectedDevices[this.connectionCount] = deviceName;
            this.connectionCount++;
            System.out.println(this.deviceName + " connected to " + deviceName);
        }
        return this; // Enable method chaining
    }

    public SmartDevice rename(String deviceName) {
        String oldName = this.deviceName;
        this.deviceName = deviceName;
        System.out.println("Device renamed from " + oldName + " to " + this.deviceName);
        return this;
    }

    public void displayDeviceInfo() {
        System.out.println("\n=== " + this.deviceName + " INFO ===");
        System.out.println("Location: " + this.location);
        System.out.println("Status: " + (this.isOnline ? "Online" : "Offline"));
        System.out.println("Power: " + this.powerConsumption + "W");
        System.out.println("Connections: " + this.connectionCount);
        for (int i = 0; i < this.connectionCount; i++) {
            System.out.println(" -> " + this.connectedDevices[i]);
        }
    }

    // Method that calls other methods using this
    public void performInitialSetup() {
        this.setOnline(true);
        System.out.println(this.deviceName + " initial setup completed");
    }

    public static void main(String[] args) {
        System.out.println("=== SMART HOME DEVICE NETWORK ===");

        // Create devices with parameter names matching field names
        SmartDevice device1 = new SmartDevice("Thermostat", "Living Room", false, 5.5);
        SmartDevice device2 = new SmartDevice("LightBulb", "Bedroom", true, 1.2);

        // Test method chaining using returned this
        device1.setOnline(true)
               .connectToDevice("Alexa")
               .rename("Living Room Thermostat")
               .connectToDevice("SmartHub");

        // Demonstrate this keyword in various contexts
        device1.updateLocation("Hallway");
        device1.updatePowerConsumption(6.0);
        device1.displayDeviceInfo();

        // Show parameter disambiguation scenarios
        device2.updateLocation("Guest Room");
        device2.updatePowerConsumption(1.5);
        device2.displayDeviceInfo();

        // Method that calls other methods using this
        device2.performInitialSetup();