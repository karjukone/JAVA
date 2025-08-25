import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int score = 0;
            for (int i = 1; i <= 10; i++) {
                int a = (int) (Math.random() * 10) + 1;
                int b = (int) (Math.random() * 10) + 1;
                System.out.print(i + ": what is " + a + " x " + b + "? ");
                int answer = scanner.nextInt();

                if (answer == a * b) {
                    System.out.println("correct");
                    score++;
                } else {
                    System.out.println("Wrong");
                }

            }
            if (score == 10) {
                System.out.println("Congrats! You finished");
                break;
            } else {
                System.out.println("You scored " + score + "/10... Try again");
            }
        }

        scanner.close();
    }
}
