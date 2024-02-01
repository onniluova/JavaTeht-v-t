package src.Moduuli3.tehtavisto2.tehtava4;

interface Vehicle {
    void start();
    void stop();
    void getInfo();
    void increaseSpeed();
    void lowerSpeed();
    void calculateFuelEfficiency();
}

interface ElectricVehicle extends Vehicle {
    void charge();
    boolean isElectric();
}

abstract class AbstractVehicle implements Vehicle {
    String information;
    int maxSpeed;
    int currentSpeed = 0;

    double fuelEfficiency;

    public AbstractVehicle(String information, int maxSpeed, double fuelEfficiency) {
        this.information = information;
        this.maxSpeed = maxSpeed;
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public void start() {
        System.out.println("Vehicle is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Vehicle is stopping...");
    }

    @Override
    public void getInfo() {
        System.out.println(information + " Huippunopeus: " + maxSpeed);
    }

    @Override
    public void increaseSpeed() {
        System.out.println("Vehicle is increasing speed...");
        while (currentSpeed < maxSpeed) {
            currentSpeed += 25;
            System.out.println(currentSpeed + " Kmh");
        }
        System.out.println("Vehicle is at max speed.");
    }

    @Override
    public void lowerSpeed() {
        System.out.println("Vehicle is decreasing speed...");
        if (currentSpeed > 0) {
            currentSpeed--;
            System.out.println(currentSpeed + " Kmh");
        }
    }

    @Override
    public void calculateFuelEfficiency() {
        System.out.println("Fuel efficiency " + fuelEfficiency);
    }
}

abstract class AbstractElectricVehicle extends AbstractVehicle implements ElectricVehicle {
    public AbstractElectricVehicle(String information, int maxSpeed, double fuelEfficiency) {
        super(information, maxSpeed, fuelEfficiency);
    }

    @Override
    public void charge() {
        System.out.println("Electric vehicle is charging...");
    }

    @Override
    public boolean isElectric() {
        return true;
    }
}
class Car extends AbstractVehicle {
    public Car() {
        super("Mitsubishi, 100hp, 2003", 200, 30);
    }
}

class Motorcycle extends AbstractVehicle {
    public Motorcycle() {
        super("Honda, 25hp, 2005", 250, 15);
    }
}

class Bus extends AbstractVehicle {
    public Bus() {
        super("Volvo, 700hp, 2007", 150, 5);
    }
}

class ElectricCar extends AbstractElectricVehicle {
    public ElectricCar() {
        super("Tesla, 80kwh, 2023", 200, 10);
    }
}

class ElectricMotorcycle extends AbstractElectricVehicle {
    public ElectricMotorcycle() {
        super("Energica, 15kwh, 2022", 125, 10);
    }
}