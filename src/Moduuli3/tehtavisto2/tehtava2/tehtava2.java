package src.Moduuli3.tehtavisto2.tehtava2;

interface Vehicle {
    void start();
    void stop();
    void getInfo();
}

abstract class AbstractVehicle implements Vehicle {
    String information;
    int maxSpeed;

    public AbstractVehicle(String information, int maxSpeed) {
        this.information = information;
        this.maxSpeed = maxSpeed;
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
}

class Car extends AbstractVehicle {
    public Car() {
        super("Mitsubishi, 1.6l, 2003", 200);
    }
}

class Motorcycle extends AbstractVehicle {
    public Motorcycle() {
        super("Honda, 1.2l, 2005", 250);
    }
}

class Bus extends AbstractVehicle {
    public Bus() {
        super("Volvo, 2.0l, 2007", 150);
    }
}