import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UsingBufferedWriter {
    public static void main(String[] args) {
        String filePath = "./textFile.txt";
        String content = "This is the content to write into file";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
