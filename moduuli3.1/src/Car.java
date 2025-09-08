public class Car {

    private double speed;
    private double gasolineLevel;
    private String typeName;
    private boolean cruiseOn;
    private int targetSpeed;
    private static int MIN_SPEED = 30;
    private static int MAX_SPEED = 150;

    public Car(String typeName) {
        this(typeName, 0, 0);
    }

    public Car(String typeName, double gasolineLevel, double speed) {
        this.typeName = typeName;
        this.gasolineLevel = gasolineLevel;
        this.speed = speed;
        this.cruiseOn = false;
    }

    public void accelerate() {
        if (gasolineLevel > 0) {
            speed += 10;
            gasolineLevel = Math.max(0, gasolineLevel - 1);
        } else {
            speed = 0;
            cruiseOn = false;
        }
    }

    public void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0) {
                speed = Math.max(0, speed - amount);
            }
        } else {
            speed = 0;
        }
    }

    public double getSpeed() {
        return speed;
    }

    public String getTypeName() {
        return typeName;
    }

    public void fillTank() {
        gasolineLevel = 100;
    }

    public double getGasolineLevel() {
        return gasolineLevel;
    }

    protected void setSpeed(double speed) {
        this.speed = speed;
    }

    protected void setGasolineLevel(double gasolineLevel) {
        this.gasolineLevel = gasolineLevel;
    }

    public void setTargetSpeed(int targetSpeed) {
        this.targetSpeed = targetSpeed;
    }

    public int getTargetSpeed() {
        return targetSpeed;
    }

    public boolean turnOnCruiseControl() {
        if (gasolineLevel > 0 && targetSpeed >= MIN_SPEED && targetSpeed <= MAX_SPEED) {
            cruiseOn = true;
            return true;
        } else {
            cruiseOn = false;
            return false;
        }
    }

    public void turnOffCruiseControl() {
        cruiseOn = false;
    }

    public void updateCruiseControl() {
        if (!cruiseOn) return;

        if (gasolineLevel <= 0) {
            cruiseOn = false;
            System.out.println("Cruise control off: no gasoline.");
            return;
        }

        if (speed < targetSpeed) {
            accelerate();
        } else if (speed > targetSpeed) {
            decelerate(5);
        }
    }

    public boolean isCruiseOn() {
        return cruiseOn;
    }
}
