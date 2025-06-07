package inheritance;

public class SmartDevice {
    private long deviceId;
    private String deviceName;
    private Boolean isOn;

    public static void main(String[] args) {

    }

    public SmartDevice(long deviceId, String deviceName, boolean isOn){
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.isOn = isOn;
    }

    public long getDeviceId(){
        return deviceId;
    }

    public String getDeviceName(){
        return deviceName;
    }

    public boolean isOn(){
        return isOn;
    }

    public void turnOn(){
        isOn = true;
        System.out.println(deviceName + " is turned On");
    }

    public void turnOff(){
        isOn = false;
        System.out.println();
    }

    public void getStatus() {
        System.out.println(deviceName + "(ID: " + deviceId + " ) is " + (isOn ? "ON" : "OFF"));
    }
}
