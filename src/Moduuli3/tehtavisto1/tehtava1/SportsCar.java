package src.Moduuli3.tehtavisto1.tehtava1;

public class SportsCar {
    private float speed;
    private float gasolineLevel;
    final private String typeName;
    int gasolineTankCapacity = 150;
    int topSpeed = 200;
    private static final float FUEL_CONSUMPTION_RATE = 0.1f;
    private static final float CRUISE_CONTROL_EFFICIENCY = 0.05f;

    private float targetSpeed;
    private boolean isCruiseControlOn;
    private static final int MIN_CRUISE_SPEED = 30;
    private static final int MAX_CRUISE_SPEED = 150;

    public SportsCar(String typeName) {
        speed = 0;
        gasolineLevel = 0;
        this.typeName = typeName;
        this.isCruiseControlOn = false;
        this.targetSpeed = 0;
    }

    public void accelerate() {
        if (!isCruiseControlOn) {
            if (this.speed < this.topSpeed) {
                this.speed += 15;
                this.gasolineLevel -= FUEL_CONSUMPTION_RATE * 10;
            }
        } else {
            if (this.speed < this.targetSpeed) {
                this.speed += 5;
                this.gasolineLevel -= CRUISE_CONTROL_EFFICIENCY * 5;
            }
            if (this.speed > this.targetSpeed) {
                turnOffCruiseControl();
            }
        }
    }

    public void decelerate(int amount) {
        if (!isCruiseControlOn) {
            if (this.speed > 0) {
                this.speed -= amount;
            }
        } else {
            if (this.speed > this.targetSpeed) {
                this.speed -= 5;
            }
            if (this.speed < this.targetSpeed) {
                turnOffCruiseControl();
            }
        }
    }
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
        if (this.targetSpeed >= MIN_CRUISE_SPEED && this.targetSpeed <= MAX_CRUISE_SPEED) {
            this.speed = this.targetSpeed; // Set the speed to target speed before turning on cruise control
            this.isCruiseControlOn = true;
            return true;
        } else {
            System.out.println("Cannot activate cruise control. Target speed must be between " + MIN_CRUISE_SPEED + " and " + MAX_CRUISE_SPEED + " km/h.");
            return false;
        }
    }

    public float getGasolineLevel() {
        return this.gasolineLevel;
    }

    public void turnOffCruiseControl() {
        this.isCruiseControlOn = false;
    }

    public void fillTank() {
        this.gasolineLevel = this.gasolineTankCapacity;
    }
}
