package interfaces;

public class NewCar {
    private Engine engine;

    public NewCar(){
        engine = new ElectricEngine();
    }

    public NewCar(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }
}
