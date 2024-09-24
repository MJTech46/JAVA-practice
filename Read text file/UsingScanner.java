import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UsingScanner {
    public static void main(String[] args) {
        String filePath = "./textFile.txt";

        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
