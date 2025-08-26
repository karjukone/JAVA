import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        String[] first = {"Kalle", "Pekka", "Minna", "Mika", "Teuvo", "Kullervo", "Alisa", "Maisa"};
        String[] last = {"Mäkinen", "Kivi", "Tirkkonen", "Kuusinen", "Koivisto", "Nosturi"};

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("How many random names to generate: ");
        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {
            int index1 = random.nextInt(first.length);
            int index2 = random.nextInt(last.length);
            String name = first[index1] + " " + last[index2];
            System.out.println(name);
        }

        scanner.close();
    }
}
