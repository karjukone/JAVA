import java.util.Scanner;

public class Testi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.parseInt(scanner.nextLine());

        int sum = first + second + third;
        int product = first * second * third;

        // TÄRKEÄÄ:
        // Jos tekisimme "sum / 3", Java tekisi kokonaislukujakolaskun (int),
        // jolloin tulos esim. 13/3 olisi 4 eikä 4.3333...
        // Ratkaisu: käytetään 3.0 (double) tai castataan sum doubleksi
        double average = sum / 3.0;

        System.out.println("The sum of the numbers is " + sum);
        System.out.println("The product of the numbers is " + product);
        System.out.println("The average of the numbers is " + average);
    }
}

