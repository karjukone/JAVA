import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many integers? ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the integers: ");

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;

        for (int i = 0; i < size; i++) {
            int sum = 0;
            for (int j = i; j < size; j++) {
                sum += numbers[j];

                if (sum > max) {
                    max = sum;
                    start = i;
                    end = j;
                }
            }
        }

        System.out.println("Maximum sum is: " + max);
        System.out.println("Integers: " + (start + 1) + "-" + (end + 1));
        scanner.close();
    }
}
