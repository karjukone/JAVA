import java.util.Scanner;

/* 1 luoti 13,28 grammaa
* 1 naula on 424,96 grammaa
* 1 leviskä on 8499,2 grammaa eli 1 leviskä on 640 luotia*/

public class Task3 {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the weight in grams: ");
        double weight = Double.parseDouble(scanner.nextLine());

        int leiviska = (int)(weight / 8499.2);
        double new_weight = weight % 8499.2;
        int naula = (int)(new_weight / 424.96);
        new_weight = new_weight % 424.96;
        double luoti = new_weight / 13.28;


        System.out.printf("%.0f grams is %d leiviskä, %d luoti and %.2f luoti", weight, leiviska, naula, luoti);

        scanner.close();
    }
}
