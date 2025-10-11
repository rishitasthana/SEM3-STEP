// Smart Campus IoT System - Safe Downcasting with instanceof

abstract class SmartDevice {
    protected String deviceName;

    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    public void showDevice() {
        System.out.println("Device: " + deviceName);
    }
}

// Smart Classroom
class SmartClassroom extends SmartDevice {
    public SmartClassroom(String deviceName) {
        super(deviceName);
    }

    public void controlLighting(boolean on) {
        System.out.println(deviceName + ": Lighting " + (on ? "ON" : "OFF"));
    }

    public void setAC(int temp) {
        System.out.println(deviceName + ": AC set to " + temp + "°C");
    }

    public void controlProjector(boolean on) {
        System.out.println(deviceName + ": Projector " + (on ? "ON" : "OFF"));
    }
}

// Smart Lab
class SmartLab extends SmartDevice {
    public SmartLab(String deviceName) {
        super(deviceName);
    }

    public void manageEquipment(String equipment, boolean on) {
        System.out.println(deviceName + ": " + equipment + " turned " + (on ? "ON" : "OFF"));
    }

    public void activateSafetySystem() {
        System.out.println(deviceName + ": Safety system activated!");
    }
}

// Smart Library
class SmartLibrary extends SmartDevice {
    public SmartLibrary(String deviceName) {
        super(deviceName);
    }

    public void trackOccupancy(int count) {
        System.out.println(deviceName + ": Current occupancy: " + count);
    }

    public void checkBookAvailability(String book, boolean available) {
        System.out.println(deviceName + ": Book '" + book + "' is " + (available ? "available" : "not available"));
    }
}

// Demo class
public class SmartCampusDemo {
    public static void main(String[] args) {
        SmartDevice[] devices = new SmartDevice[3];
        devices[0] = new SmartClassroom("Room 101");
        devices[1] = new SmartLab("Physics Lab");
        devices[2] = new SmartLibrary("Central Library");

        for (SmartDevice device : devices) {
            device.showDevice();
            // Safe downcasting with instanceof
            if (device instanceof SmartClassroom) {
                SmartClassroom classroom = (SmartClassroom) device;
                classroom.controlLighting(true);
                classroom.setAC(22);
                classroom.controlProjector(true);
            } else if (device instanceof SmartLab) {
                SmartLab lab = (SmartLab) device;
                lab.manageEquipment("Spectrometer", true);
                lab.activateSafetySystem();
            } else if (device instanceof SmartLibrary) {
                SmartLibrary library = (SmartLibrary) device;
                library.trackOccupancy(45);
                library.checkBookAvailability("Data Structures", true);
            }
            System.out.println();
        }
    }
}