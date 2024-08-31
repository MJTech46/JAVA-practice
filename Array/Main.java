// Array examples
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // declaration / allocation
        int[] numbers = new int[20];
        for(int i=0; i<numbers.length; i++)
            numbers[i] = 1 + (int) (Math.random() * 100); // generate 1 to 100 ints
        
        // printing the array elements using for-each loop
        System.out.println("Array elements: ");
        for(int i : numbers)
            System.out.print(i + " ");
        
        // sorting array using built-in method
        Arrays.sort(numbers);
        System.out.println("\n\n***Sorting completed***\n");

        // printing the array elements after sorting
        System.out.println("Array elements: ");
        for(int i : numbers)
            System.out.print(i + " ");
        
    }
}
