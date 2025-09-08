public class Rectangle extends Shape{
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        this.type = "rectangle";
        this.color = "blue";
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return this.type + " is " + this.color + " and area is";
    }
}
