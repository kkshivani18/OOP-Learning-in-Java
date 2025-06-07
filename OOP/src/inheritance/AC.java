package inheritance;

public class AC extends SmartDevice{

    private int temp;

    public AC(long deviceId, String deviceName, boolean isOn) {
        super(deviceId, deviceName, isOn);
    }

    public void setTemp(int temp){
        this.temp = temp;
        System.out.println(getDeviceName() + " temperature set to: " + temp);
    }

    public int getTemp(){
        return temp;
    }

    @Override
    public void getStatus(){
        super.getStatus();
        System.out.println(getDeviceName() + " temperature is : " + temp);
    }
}
