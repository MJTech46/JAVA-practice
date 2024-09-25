import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class WriteAllLines {
    public static void main(String[] args) {
        String filePath = "./textFile.txt";
        List<String> content = Arrays.asList("Line 1", "Line 2", "Line 3");

        try {
            Files.write(Paths.get(filePath), content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
