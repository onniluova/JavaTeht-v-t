package src.Moduuli3.tehtavisto2.tehtava2;

interface Vehicle {
    void start();
    void stop();
    void getInfo();
    void increaseSpeed();
    void lowerSpeed();
}

abstract class AbstractVehicle implements Vehicle {
    String information;
    int maxSpeed;
    int currentSpeed;

    public AbstractVehicle(String information, int maxSpeed, int currentSpeed) {
        this.information = information;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
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
            currentSpeed+=25;
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
}

class Car extends AbstractVehicle {
    public Car() {
        super("Mitsubishi, 1.6l, 2003", 200, 0);
    }
}

class Motorcycle extends AbstractVehicle {
    public Motorcycle() {
        super("Honda, 1.2l, 2005", 250, 0);
    }
}

class Bus extends AbstractVehicle {
    public Bus() {
        super("Volvo, 2.0l, 2007", 150, 0);
    }
}