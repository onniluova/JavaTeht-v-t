
package src.Moduuli2.tehtavisto1.tehtava4_1;

public class Car {
    private float speed;
    private float gasolineLevel;
    final private String typeName;
    int gasolineTankCapacity = 100;
    int topSpeed = 200;

    // Cruise Control variables
    private float targetSpeed;
    private boolean isCruiseControlOn;
    private static final int MIN_CRUISE_SPEED = 30;
    private static final int MAX_CRUISE_SPEED = 150;

    public Car(String typeName) {
        speed = 0;
        gasolineLevel = 0;
        this.typeName = typeName;
        this.isCruiseControlOn = false;
        this.targetSpeed = 0;
    }

    // Assuming these methods exist, adding cruise control logic
    public void accelerate() {
        if (!isCruiseControlOn) {
            // Normal acceleration logic
            if (this.speed < this.topSpeed) {
                this.speed += 10; // Assuming each acceleration increases speed by 10
            }
        } else {
            // Cruise control acceleration logic
            if (this.speed < this.targetSpeed) {
                this.speed += 5; // Smoother acceleration under cruise control
            }
            if (this.speed > this.targetSpeed) {
                turnOffCruiseControl();
            }
        }
    }

    public void decelerate(int amount) {
        if (!isCruiseControlOn) {
            // Normal deceleration logic
            if (this.speed > 0) {
                this.speed -= amount;
            }
        } else {
            // Cruise control deceleration logic
            if (this.speed > this.targetSpeed) {
                this.speed -= 5; // Smoother deceleration under cruise control
            }
            if (this.speed < this.targetSpeed) {
                turnOffCruiseControl();
            }
        }
    }

    // Cruise Control Methods
    public void setTargetSpeed(float speed) {
        if (speed >= MIN_CRUISE_SPEED && speed <= MAX_CRUISE_SPEED) {
            this.targetSpeed = speed;
        } else {
            System.out.println("Invalid target speed. Must be between " + MIN_CRUISE_SPEED + " and " + MAX_CRUISE_SPEED + " km/h.");
        }
    }

    public float getTargetSpeed() {
        return this.targetSpeed;
    }

    public float getSpeed() {
        return this.speed;
    }

    public String getTypeName() {
        return this.typeName;
    }

    public boolean turnOnCruiseControl() {
        if (this.speed < MIN_CRUISE_SPEED || this.speed > MAX_CRUISE_SPEED) {
            System.out.println("Cannot activate cruise control at this speed.");
            return false;
        }
        this.isCruiseControlOn = true;
        return true;
    }

    public void turnOffCruiseControl() {
        this.isCruiseControlOn = false;
    }

    public void fillTank() {
        this.gasolineLevel = this.gasolineTankCapacity;
    }
}
