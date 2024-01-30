package src.Moduuli3.tehtava2;;

public class Bus {
    private float speed;
    private float gasolineLevel;
    final private String typeName;
    int gasolineTankCapacity = 100;
    int topSpeed = 200;

    byte numberOfPassengers = 0;

    private float targetSpeed;
    public boolean isCruiseControlOn;
    private static final int MIN_CRUISE_SPEED = 30;
    private static final int MAX_CRUISE_SPEED = 150;

    public Bus(String typeName) {
        speed = 0;
        gasolineLevel = 0;
        this.typeName = typeName;
        this.isCruiseControlOn = false;
        this.targetSpeed = 0;
    }

    public void accelerate() {
        if (!isCruiseControlOn) {
            if (this.speed < this.topSpeed) {
                this.speed += 10;
            }
        } else {
            if (this.speed < this.targetSpeed) {
                this.speed += 5;
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

    public float getGasolineLevel() {
        return this.gasolineLevel;
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

    public void passengerEnter(byte boardingPassengers) {
        numberOfPassengers += boardingPassengers;
    }
    public byte getNumberOfPassgengers() {
        return numberOfPassengers;
    }

    public void turnOffCruiseControl() {
        this.isCruiseControlOn = false;
    }

    public void fillTank() {
        this.gasolineLevel = this.gasolineTankCapacity;
    }
}
