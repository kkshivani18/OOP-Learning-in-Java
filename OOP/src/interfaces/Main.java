package interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
        Engine car = new Car();

//        car.speed;   // error because object is of Car class not Engine and (the right side thing Object determines what we can access and what not)
        car.start();
        car.acc();
//        car.brake();
        car.stop();

        NewCar newC = new NewCar();
        newC.start();
        newC.upgradeEngine();
    }
}
