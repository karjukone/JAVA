public class CarDriver {
    public static void main(String[] args) {
        Car myCar;
        SportsCar sportsCar;

        myCar = new Car("Toyota Corolla");
        Car car1 = new Car("Tesla", 20, 50);
        sportsCar = new SportsCar("M2", 0, 0);
        Bus bus = new Bus("Bussinen");

        myCar.fillTank();
        sportsCar.fillTank();

        for (int i = 0; i < 2; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h." + " Gasolinelevel: " + myCar.getGasolineLevel() );
        }

        for (int i = 0; i < 2; i++) {
            sportsCar.accelerate();
            System.out.println(sportsCar.getTypeName() + ": speed is " + sportsCar.getSpeed() + " km/h." + " Gasolinelevel: " + sportsCar.getGasolineLevel());
        }


        while (myCar.getSpeed() > 0) {
            myCar.decelerate(3);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        while (sportsCar.getSpeed() > 0) {
            sportsCar.decelerate(30);
            System.out.println(sportsCar.getTypeName() + ": speed is " + sportsCar.getSpeed() + " km/h");
        }

        System.out.println(myCar.getGasolineLevel());
        System.out.println(sportsCar.getGasolineLevel());

        sportsCar.setTargetSpeed(60);
        System.out.println(sportsCar.getTargetSpeed());

        System.out.println(sportsCar.isCruiseOn());
        System.out.println(sportsCar.turnOnCruiseControl());

        sportsCar.updateCruiseControl();

        sportsCar.turnOffCruiseControl();

        bus.passengerEnter(5);
        bus.passengerEnter(10);
        System.out.println("The bus has " + bus.getPassengers() + " passengers");
        bus.passengerExit(7);
        System.out.println("The bus has " + bus.getPassengers() + " passengers");


    }
}