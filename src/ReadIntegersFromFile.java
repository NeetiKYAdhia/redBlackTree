import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadIntegersFromFile {
    public static int[] readIntegersFromFile(String filePath) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            // Read lines from the file
            String line;
            StringBuilder content = new StringBuilder();
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }

            // Split the content into an array of strings
            String[] numbersAsString = content.toString().split("\\s+");

            // Convert strings to integers
            int[] integers = new int[numbersAsString.length];
            for (int i = 0; i < numbersAsString.length; i++) {
                integers[i] = Integer.parseInt(numbersAsString[i]);
            }

            return integers;
        }
    }
}
