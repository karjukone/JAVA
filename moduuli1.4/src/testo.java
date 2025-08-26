import java.util.Scanner;

public class testo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask for array size
        System.out.print("Enter the size of the array: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];

        // Step 2: Ask user to fill array
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        // Step 3: Create new array to store unique values
        int[] uniqueArr = new int[n];
        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {
            int current = arr[i];
            boolean alreadyExists = false;

            // Check if current number already exists in uniqueArr
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueArr[j] == current) {
                    alreadyExists = true;
                    break;
                }
            }

            // If not found, add it to uniqueArr
            if (!alreadyExists) {
                uniqueArr[uniqueCount] = current;
                uniqueCount++;
            }
        }

        // Step 4: Print the resulting array (only the filled part)
        System.out.print("Array without duplicates: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(uniqueArr[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
