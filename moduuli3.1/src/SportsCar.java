public class SportsCar extends Car {


    public SportsCar(String typeName, double gasolineLevel, double speed) {
        super(typeName, gasolineLevel, speed);
    }

    @Override
    public void accelerate() {
        if (getGasolineLevel() > 0) {
            setSpeed(getSpeed() + 20);
            setGasolineLevel(Math.max(0, getGasolineLevel() - 10));
        } else {
            setSpeed(0);
            turnOffCruiseControl();
        }
    }

    @Override
    public void updateCruiseControl() {
        if (!isCruiseOn()) return;

        if (getGasolineLevel() <= 0) {
            turnOffCruiseControl();
            System.out.println("Cruise control off: no gasoline.");
            return;
        }

        if (getSpeed() < getTargetSpeed()) {
            accelerate();
        } else if (getSpeed() > getTargetSpeed()) {
            decelerate(20);
        }
    }
}
