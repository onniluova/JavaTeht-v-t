package src.Moduuli3.tehtavisto2.tehtava1;

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        Bus bus = new Bus();

        car.start();
        car.getInfo();
        car.stop();

        motorcycle.start();
        motorcycle.getInfo();
        motorcycle.stop();

        bus.start();
        bus.getInfo();
        bus.stop();
    }
}
