import java.util.Objects;

public class CoffeeMaker {
    public String type;
    private boolean isOn;
    public int amount;

    public CoffeeMaker(String type, int amount) {
        this.type = type;
        this.amount = amount;
        this.isOn = false;
    }
    
    public void pressOnOff() {
        isOn = !isOn;
    }

    public boolean isOn() {
        return false;
    }

    public String setType(String type) {
        if (isOn) {
            if (Objects.equals(type, "espresso")) {
                type = "espresso";
            } else if (Objects.equals(type, "normal")) {
                type = "normal";
            }
        }
            return type;
    }

    public int setAmount(int amount) {
        if(isOn) {
            if (amount > 80) {
                amount = 80;
            }
            if (amount < 10) {
                amount = 10;
            }
        }
        return amount;
    }
}
