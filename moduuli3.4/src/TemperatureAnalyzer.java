import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.time.*;
import java.time.format.*;
import java.util.*;

public class TemperatureAnalyzer {
    public static void main(String[] args) {
        String url = "https://users.metropolia.fi/~jarkkov/temploki.csv";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        List<Double> temperatures = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new URL(url).openStream(), StandardCharsets.ISO_8859_1))) {

            String headerLine = reader.readLine();
            if (headerLine == null) {
                System.out.println("CSV is empty.");
                return;
            }

            String[] headers = headerLine.split(";");
            int timeIndex = Arrays.asList(headers).indexOf("Aika");
            int tempIndex = Arrays.asList(headers).indexOf("UlkoTalo");

            if (timeIndex == -1 || tempIndex == -1) {
                System.out.println("Required columns not found.");
                return;
            }

            String line;
            while ((line = reader.readLine()) != null) {
                String[] columns = line.split(";");

                if (columns.length <= Math.max(timeIndex, tempIndex))
                    continue;

                String dateTimeStr = columns[timeIndex];
                String tempStr = columns[tempIndex].replace(',', '.');

                try {
                    LocalDateTime dateTime = LocalDateTime.parse(dateTimeStr, formatter);
                    if (dateTime.toLocalDate().equals(LocalDate.of(2023, 1, 1))) {
                        double temperature = Double.parseDouble(tempStr);
                        temperatures.add(temperature);
                    }
                } catch (DateTimeParseException | NumberFormatException e) {
                }
            }


        if (temperatures.isEmpty()) {
                System.out.println("No data found for January 1, 2023.");
            } else {
                double average = temperatures.stream().mapToDouble(Double::doubleValue).average().orElse(0);
                System.out.printf("Average UlkoTalo temperature on 2023-01-01: %.2f °C%n", average);
            }

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }


}
}