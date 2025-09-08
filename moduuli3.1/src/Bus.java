public class Bus extends Car {

    private int passengers;

    public Bus(String typeName) {
        super(typeName);
        this.passengers = 0;
    }

    public void passengerEnter(int number) {
        passengers += number;
    }

    public void passengerExit(int number) {
        passengers -= number;
    }

    public int getPassengers() {
        return passengers;
    }
}
