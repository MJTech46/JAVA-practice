import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsingBuffer {
    public static void main(String[] args) {
        String filePath = "./textFile.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
