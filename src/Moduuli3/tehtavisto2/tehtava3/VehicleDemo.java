package src.Moduuli3.tehtavisto2.tehtava3;

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        Bus bus = new Bus();
        ElectricCar electricCar = new ElectricCar();
        ElectricMotorcycle electricMotorcycle = new ElectricMotorcycle();


        electricCar.start();
        electricCar.charge();
        electricCar.getInfo();

        motorcycle.start();
        motorcycle.getInfo();
        motorcycle.stop();

        bus.start();
        bus.getInfo();
        bus.stop();
    }
}
