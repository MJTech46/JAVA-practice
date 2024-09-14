import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // constructing a BufferedReader obj
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a string: ");
        String str = reader.readLine();

        System.out.println("You entered: ");
        System.out.println("\t"+str);
    }

}
