package src.Moduuli3.tehtavisto2.tehtava2;

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        Bus bus = new Bus();

        car.start();
        car.getInfo();
        car.stop();
        car.increaseSpeed();

        motorcycle.start();
        motorcycle.getInfo();
        motorcycle.stop();

        bus.start();
        bus.getInfo();
        bus.stop();
    }
}
