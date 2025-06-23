package interfaces;

public class Car implements Engine, Break {

    @Override
    public void brake() {
        System.out.println("Car applies break");
    }

    @Override
    public void start() {
        System.out.println("Car starts");
    }

    @Override
    public void stop() {
        System.out.println("Car stops");
    }

    @Override
    public void acc() {
        System.out.println("Car accelerates");
    }
}
