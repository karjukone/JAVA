public class ElectricMotorcycle extends AbstractVehicle {
    public ElectricMotorcycle() {
        super("Electric Motorcycle", "Electric", "Blue", 0.12); // kWh/km
    }

    public void charge() {
        System.out.println(type + " is charging...");
    }

    public String getInfo() {
        return "Electric Motorcycle Information:\nType: " + type + "\nFuel: " + fuel + "\nColor: " + color +
                "\nEnergy Efficiency: " + fuelEfficiency + " kWh/km";
    }
}