package src.Moduuli3.tehtavisto2.tehtava1;

interface Vehicle {
    void start();
    void stop();
    void getInfo();
}

class Car implements Vehicle {
    String information = "Mitsubishi, 1.6l, 2003";

    public String getInformation() {
        return information;
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
        System.out.println(information);
    }
}
class Motorcycle implements Vehicle {
    String information = "Honda, 1.2l, 2005";

    public String getInformation() {
        return information;
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
        System.out.println(information);
    }
}

class Bus implements Vehicle {
    String information = "Volvo, 2.0l, 2007";

    public String getInformation() {
        return information;
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
        System.out.println(information);
    }
}