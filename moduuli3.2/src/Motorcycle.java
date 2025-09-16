public class Motorcycle extends AbstractVehicle {
    public Motorcycle() {
        super("Motorcycle", "Gasoline", "Black", 50.0); // mpg
    }

    public String getInfo() {
        return "Motorcycle Information:\nType: " + type + "\nFuel: " + fuel + "\nColor: " + color +
                "\nFuel Efficiency: " + fuelEfficiency + " mpg";
    }
}