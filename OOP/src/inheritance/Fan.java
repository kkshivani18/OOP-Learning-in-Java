package inheritance;

public class Fan extends SmartDevice{
    private int speed;

    public Fan(long deviceId, String deviceName, boolean isOn) {
        super(deviceId, deviceName, isOn);
        this.speed = speed;
    }

    public void setSpeed(int speed){
        this.speed = speed;
        System.out.println(getDeviceName() + " speed set to: " + speed);
    }

    public int getSpeed(){
        return speed;
    }

    @Override
    public void getStatus(){
        super.getStatus();
        System.out.println("Fan speed: " + speed);
    }
}
