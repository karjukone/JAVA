public class Bus extends AbstractVehicle {
    private int capacity;

    public Bus() {
        super("Bus", "Diesel", "Yellow", 22.0); // l/100km
        this.capacity = 40;
    }

    public String getInfo() {
        return "Bus Information:\nType: " + type + "\nFuel: " + fuel +
                "\nColor: " + color + "\nCapacity: " + capacity + " passengers" +
                "\nFuel Efficiency: " + fuelEfficiency + " l/100km";
    }
}