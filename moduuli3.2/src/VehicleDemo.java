public class VehicleDemo {
    public static void main(String[] args) {
        System.out.println("Vehicle Demonstration\n");

        Vehicle[] vehicles = {
                new Car(),
                new ElectricCar(),
                new Motorcycle(),
                new ElectricMotorcycle(),
                new Bus()
        };

        for (Vehicle v : vehicles) {
            v.start();
            v.stop();

            if (v instanceof ElectricVehicle) {
                ((ElectricVehicle) v).charge();
            }

            System.out.println(v.getInfo());
            System.out.println("Efficiency Value: " + v.calculateFuelEfficiency());
            System.out.println();
        }
    }
}