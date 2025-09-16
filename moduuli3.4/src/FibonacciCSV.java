import java.io.FileWriter;
import java.io.IOException;

public class FibonacciCSV {
    public static void main(String[] args) {
        final int count = 60;
        long[] fibonacci = new long[count];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < count; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        try (FileWriter writer = new FileWriter("fibonacci.csv")) {
            writer.write("Index,Fibonacci\n");
            for (int i = 0; i < count; i++) {
                writer.write(i + "," + fibonacci[i] + "\n");
            }
            System.out.println("Fibonacci sequence saved to fibonacci.csv");
        } catch (IOException e) {
            System.err.println("Error writing CSV file: " + e.getMessage());
        }
    }
}