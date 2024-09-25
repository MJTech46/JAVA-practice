import java.io.FileWriter;
import java.io.IOException;

public class UsingFileWriter {
    public static void main(String[] args) {
        String filePath = "./textFile.txt";
        String content = "This is the content to write into file";

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

