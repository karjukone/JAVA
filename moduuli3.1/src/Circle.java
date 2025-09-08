public class Circle extends Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.type = "circle";
        this.color = "yellow";
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return this.type + " is " + this.color + " and area is";
    }
}
