import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.parseInt(scanner.nextLine());

        int sum = first + second + third;

        System.out.println("The sum of the numbers is " + sum);
        System.out.println("The product of the numbers is " + (first * second * third));
        System.out.println ("The average of the numbers is " + sum / 3.0);

        /*
        Explanation: The given numbers are integer and need to be converted
        (int --> double or float) for the average to be accurate.
        I just put "sum / 3.0" instead of just 3
         */
    }
}