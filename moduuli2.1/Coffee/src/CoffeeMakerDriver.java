public class CoffeeMakerDriver {
    public static void main(String[] args) {
        CoffeeMaker myCoffee = new CoffeeMaker("espresso", 30);

        if (!myCoffee.isOn())
            myCoffee.pressOnOff();


        System.out.println("Coffee maker is on");
        System.out.println("Coffee type is: " + myCoffee.setType(myCoffee.type));
        System.out.println("Coffee amount is: " + myCoffee.setAmount(myCoffee.amount) + " ml");
        myCoffee.pressOnOff();
        System.out.println("Coffee maker is off");

    }
}
