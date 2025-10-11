// Smart Home Automation - Safe Downcasting with instanceof

abstract class SmartDevice {
    protected String deviceName;

    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    public void showDevice() {
        System.out.println("Device: " + deviceName);
    }
}

// Smart TV
class SmartTV extends SmartDevice {
    public SmartTV(String deviceName) {
        super(deviceName);
    }

    public void changeChannel(int channel) {
        System.out.println(deviceName + ": Channel set to " + channel);
    }

    public void setVolume(int volume) {
        System.out.println(deviceName + ": Volume set to " + volume);
    }

    public void launchApp(String app) {
        System.out.println(deviceName + ": Launching app " + app);
    }
}

// Smart Thermostat
class SmartThermostat extends SmartDevice {
    public SmartThermostat(String deviceName) {
        super(deviceName);
    }

    public void setTemperature(double temp) {
        System.out.println(deviceName + ": Temperature set to " + temp + "°C");
    }

    public void setHumidity(int humidity) {
        System.out.println(deviceName + ": Humidity set to " + humidity + "%");
    }

    public void enableEnergySaving() {
        System.out.println(deviceName + ": Energy saving mode enabled");
    }
}

// Smart Security System
class SmartSecuritySystem extends SmartDevice {
    public SmartSecuritySystem(String deviceName) {
        super(deviceName);
    }

    public void activateAlarm() {
        System.out.println(deviceName + ": Alarm activated!");
    }

    public void showCameraFeed() {
        System.out.println(deviceName + ": Displaying camera feed");
    }

    public void grantAccess(String user) {
        System.out.println(deviceName + ": Access granted to " + user);
    }
}

// Smart Kitchen Appliance
class SmartKitchenAppliance extends SmartDevice {
    public SmartKitchenAppliance(String deviceName) {
        super(deviceName);
    }

    public void setCookingTime(int minutes) {
        System.out.println(deviceName + ": Cooking time set to " + minutes + " minutes");
    }

    public void setCookingTemperature(int temp) {
        System.out.println(deviceName + ": Cooking temperature set to " + temp + "°C");
    }

    public void selectRecipe(String recipe) {
        System.out.println(deviceName + ": Recipe selected: " + recipe);
    }
}

// Demo class
public class SmartHomeDemo {
    public static void main(String[] args) {
        SmartDevice[] devices = new SmartDevice[4];
        devices[0] = new SmartTV("Living Room TV");
        devices[1] = new SmartThermostat("Hall Thermostat");
        devices[2] = new SmartSecuritySystem("Main Door Security");
        devices[3] = new SmartKitchenAppliance("Smart Oven");

        for (SmartDevice device : devices) {
            device.showDevice();
            // Safe downcasting with instanceof
            if (device instanceof SmartTV) {
                SmartTV tv = (SmartTV) device;
                tv.changeChannel(5);
                tv.setVolume(15);
                tv.launchApp("Netflix");
            } else if (device instanceof SmartThermostat) {
                SmartThermostat thermostat = (SmartThermostat) device;
                thermostat.setTemperature(22.5);
                thermostat.setHumidity(45);
                thermostat.enableEnergySaving();
            } else if (device instanceof SmartSecuritySystem) {
                SmartSecuritySystem security = (SmartSecuritySystem) device;
                security.showCameraFeed();
                security.activateAlarm();
                security.grantAccess("Alice");
            } else if (device instanceof SmartKitchenAppliance) {
                SmartKitchenAppliance kitchen = (SmartKitchenAppliance) device;
                kitchen.selectRecipe("Pasta");
                kitchen.setCookingTime(20);
                kitchen.setCookingTemperature(180);
            }
            System.out.println();
        }
    }
}