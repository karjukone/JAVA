import java.util.Scanner;

public class Task1 {
    private final double a;
    private final double b;
    private final double c;

    public Task1(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void quatric() {
        double sqrt = b * b - 4 * a * c;
        if (sqrt < 0 || a == 0) {
            System.out.println("No real roots");
        }
        else if (sqrt == 0) {
            double root = -b / (2 * a);
            System.out.println("One real root: " + root);
        }

        else  {
            double root1 = (-b + Math.sqrt(sqrt)) / (2 * a);
            double root2 = (-b - Math.sqrt(sqrt)) / (2 * a);
            System.out.printf("First root: %f second root: %f ", root1, root2);
        }
    }

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first coefficient: ");
        double coe1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter second: ");
        double coe2 = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter third: ");
        double coe3 = Double.parseDouble(scanner.nextLine());

        Task1 coes = new Task1(coe1, coe2, coe3);

        coes.quatric();
        scanner.close();
    }
}
