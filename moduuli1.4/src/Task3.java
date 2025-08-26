import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        System.out.println("Enter the integers into the array: ");

        int[] newArr = new int[size];
        int count = 0;

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            int index = numbers[i];
            boolean exists = false;

            for (int j = 0; j < count; j++) {
                if (newArr[j] == index) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                newArr[count] = index;
                count++;
            }
        }
        System.out.println("Array w/o duplicants: ");
        for (int i = 0; i < count; i++) {
            System.out.println(newArr[i] + " ");
        }

        scanner.close();
    }
}
