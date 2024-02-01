package src.Moduuli3.tehtavisto1.tehtava2;

public class BusTest {
    public static void main(String[] args) {
        // Create a new Bus instance
        Bus bus = new Bus("City Bus");

        // Test accelerate
        bus.accelerate();
        System.out.println("Test accelerate: Expected speed 10, Actual speed " + bus.getSpeed());

        // Test decelerate
        bus.decelerate(5);
        System.out.println("Test decelerate: Expected speed 5, Actual speed " + bus.getSpeed());

        // Test set and get target speed
        bus.setTargetSpeed(50);
        System.out.println("Test set/get target speed: Expected 50, Actual " + bus.getTargetSpeed());

        // Test turn on cruise control
        bus.turnOnCruiseControl();
        System.out.println("Test turn on cruise control: Expected true, Actual " + bus.isCruiseControlOn);

        // Test passenger enter
        bus.passengerEnter((byte) 5);
        System.out.println("Test passenger enter: Expected 5, Actual " + bus.getNumberOfPassgengers());

        // Test fill tank
        bus.fillTank();
        System.out.println("Test fill tank: Expected 100, Actual " + bus.getGasolineLevel());

        // Test turn off cruise control
        bus.turnOffCruiseControl();
        System.out.println("Test turn off cruise control: Expected false, Actual " + bus.isCruiseControlOn);
    }
}