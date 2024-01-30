package src.Moduuli3.tehtavisto2.tehtava4;

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
        System.out.println(electricCar.calculateFuelEfficiency() + " kWh/100km");

        motorcycle.start();
        motorcycle.getInfo();
        motorcycle.stop();
        System.out.println(motorcycle.calculateFuelEfficiency() + " l/100km");

        bus.start();
        bus.getInfo();
        bus.stop();
    }
}
