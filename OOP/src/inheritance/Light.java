package inheritance;

public class Light extends SmartDevice{

    private int brightness;

    public Light(long deviceId, String deviceName, boolean isOn) {
        super(deviceId, deviceName, isOn);
    }

    public void setBrightness(int brightness){
        this.brightness = brightness;
        System.out.println(getDeviceName() + " brightness set to: " + brightness);
    }

    public int getBrightness(){
        return brightness;
    }

    @Override
    public void getStatus(){
        super.getStatus();
        System.out.println(getDeviceName() + "brightness is: " + brightness);
    }
}
