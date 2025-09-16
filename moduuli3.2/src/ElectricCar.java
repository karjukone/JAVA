public class ElectricCar extends AbstractVehicle {
    public ElectricCar() {
        super("Electric Car", "Electric", "White", 0.18); // kWh/km
    }

    public void charge() {
        System.out.println(type + " is charging...");
    }

    public String getInfo() {
        return "Electric Car Information:\nType: " + type + "\nFuel: " + fuel + "\nColor: " + color +
                "\nEnergy Efficiency: " + fuelEfficiency + " kWh/km";
    }
}