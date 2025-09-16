public class Car extends AbstractVehicle {
    public Car() {
        super("Car", "Petrol", "Red", 30.5); // mpg
    }

    public String getInfo() {
        return "Car Information:\nType: " + type + "\nFuel: " + fuel + "\nColor: " + color +
                "\nFuel Efficiency: " + fuelEfficiency + " mpg";
    }
}