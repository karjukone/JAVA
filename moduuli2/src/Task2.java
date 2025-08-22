/* formula for fahrenheit to celcius convertion: (F - 32)/ 1.8    */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a temperature in Fahrenheit: ");
        double temp = Double.parseDouble(scanner.nextLine());

        double celcius = (temp - 32) / 1.8;

        System.out.printf("The temperature in Celsius %.1f", celcius);

        scanner.close();
    }
}
