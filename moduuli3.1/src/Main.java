public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 5);
        Triangle triangle = new Triangle(6, 12);

        Shape[] shapes = {circle, rectangle, triangle};

        for(Shape shape : shapes) {
            System.out.printf("\nThe color of %s : %.1f", shape, shape.calculateArea());
        }

    }
}
