package inheritance;

public class DevicesController {
    public static void main(String[] args) {
        Fan f1 = new Fan(110, "Living Room Fan", false);
        Light l1 = new Light(112, "Bathroom Light", false);
        AC a1 = new AC(111, "Bedroom AC", false);
        Speaker s1 = new Speaker(115, "Bedroom Speaker", false);

        f1.turnOn();
        f1.setSpeed(4);
        f1.getStatus();

        l1.turnOn();
        l1.setBrightness(5);
        l1.getStatus();

        a1.turnOn();
        a1.setTemp(24);
        a1.getStatus();

        s1.turnOn();
        s1.setVolume(45);
        s1.getStatus();
    }
}
