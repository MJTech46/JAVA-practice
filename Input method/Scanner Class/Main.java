import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // constructing a Scanner class obj
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scan.nextLine();

        System.out.println("You entered: ");
        System.out.println("\t"+str);
    }
}