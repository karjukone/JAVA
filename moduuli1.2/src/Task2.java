import java.util.Scanner;

public class Task2 {
    private final double side1;
    private final double side2;

    public Task2(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public void hypotenuse() {
        double hypo = (side1 * side1) + (side2 * side2);
        System.out.printf("The length of the hypotenuse is: %.2f ", Math.sqrt(hypo));
    }

    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the 1st side of the triangle: ");
        double length1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the length of the 2nd side:");
        double length2 = Double.parseDouble(scanner.nextLine());
        Task2 sides = new Task2(length1, length2);

        sides.hypotenuse();

        scanner.close();
    }
}
