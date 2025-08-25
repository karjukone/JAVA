import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter end: ");
        int end = Integer.parseInt(scanner.nextLine());
        System.out.println("Prime numbers: ");

        for (int num = start; num <= end; num++) {
            if (num > 1) {
              boolean prime = true;

              for (int i = 2; i * i <= num; i++) {
                  if (num % i == 0) {
                      prime = false;
                      break;
                  }
              }

              if (prime) {
                  System.out.print(num + " ");
              }
            }
        }
        scanner.close();

    }
}
