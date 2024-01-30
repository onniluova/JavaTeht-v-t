package src.Moduuli3.tehtava1;

public class SportsCarTester {

    public static void main(String[] args) {
        // Creating a new SportsCar instance
        SportsCar mcLaren = new SportsCar("McLaren");

        // Test 1: Accelerating
        mcLaren.accelerate();
        System.out.println("After accelerating, speed: " + mcLaren.getSpeed() + " km/h");

        // Test 2: Decelerating
        mcLaren.decelerate(10);
        System.out.println("After decelerating, speed: " + mcLaren.getSpeed() + " km/h");

        // Test 3: Turning on Cruise Control
        mcLaren.setTargetSpeed(100);
        boolean cruiseControlStatus = mcLaren.turnOnCruiseControl();
        if (cruiseControlStatus) {
            System.out.println("Cruise Control is activated.");
        } else {
            System.out.println("Failed to activate Cruise Control.");
        }

        // Test 4: Fuel Level
        mcLaren.fillTank();
        System.out.println("After filling the tank, fuel level: " + mcLaren.getGasolineLevel() + " liters");

        // Test 5: Check Speed after Cruise Control
        mcLaren.accelerate(); // Assuming this affects speed under cruise control
        System.out.println("Speed while cruise control is active: " + mcLaren.getSpeed() + " km/h");

        // Test 6: Turning off Cruise Control
        mcLaren.turnOffCruiseControl();
        System.out.println("Cruise Control is deactivated.");

        // Add more tests as needed based on the functionalities of SportsCar class
    }
}