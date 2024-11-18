import java.io.*;

// parent class
class Device {
    private String deviceName;

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceName() {
        return this.deviceName + " is a Device";
    }
}

// child class
class Bulb extends Device {
    public static void main(String gg[]) {
        // parent class can store the reference
        // of instance of child classes
        Device device = new Bulb();

        // set the device name to bulb
        System.out.println("Device name is Bulb");
        device.setDeviceName("Bulb");

        // print the device name
        System.out.println(device.getDeviceName());
    }
}