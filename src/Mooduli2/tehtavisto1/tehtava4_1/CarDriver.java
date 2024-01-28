
package src.Mooduli2.tehtavisto1.tehtava4_1;

public class CarDriver {

    public static void main(String[] args) {
        Car myCar;

        myCar = new Car("Toyota Corolla");
        myCar.fillTank();

        // Testing acceleration and deceleration
        for(int i = 0; i < 6; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        while(myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        // Testing cruise control
        System.out.println("Testing Cruise Control:");
        myCar.setTargetSpeed(70);  // Set target speed for cruise control
        boolean cruiseControlStatus = myCar.turnOnCruiseControl();  // Attempt to turn on cruise control
        if (cruiseControlStatus) {
            System.out.println("Cruise Control turned on successfully.");
        } else {
            System.out.println("Failed to turn on Cruise Control.");
        }
        System.out.println("Current target speed: " + myCar.getTargetSpeed() + " km/h");
        myCar.turnOffCruiseControl();  // Turn off cruise control
        System.out.println("Cruise Control turned off.");
    }
}