package ExceptionHandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FinallyBlock {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("example.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file.");
        } finally {
            try {
                if (reader != null) {
                    reader.close(); // Close the file regardless of exceptions
                }
            } catch (IOException e) {
                System.err.println("An error occurred while closing the file.");
            }
        }
    }
}
