package inheritance;

public class Speaker extends SmartDevice{

    private int volume;

    public Speaker(long deviceId, String deviceName, boolean isOn) {
        super(deviceId, deviceName, isOn);
    }

    public void setVolume(int volume){
        this.volume = volume;
        System.out.println(getDeviceName() + " volume set to: " + volume);
    }

    public int getVolume(){
        return volume;
    }

    @Override
    public void getStatus(){
        super.getStatus();
        System.out.println(getDeviceName() + " volume is : " + volume);
    }
}
