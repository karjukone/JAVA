public class Triangle extends Shape{
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        this.type = "triangle";
        this.color = "red";
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public String toString() {
        return this.type + " is " + this.color + " and area is";
    }
}
