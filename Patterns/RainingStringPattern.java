import java.lang.Thread;

public class RainingStringPattern {

    // making a delay method
    public static void sleep(long ms) throws InterruptedException{
	    Thread.sleep(ms, 0);
    }

    public static void main(String[] args) {

        char[] availableString = " abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] finalString = "Hello world".toCharArray();
        String currentString = "";

        for (char key : finalString) {
            for (char string : availableString) {
                System.out.println(currentString + string);
                if (key == string) {
                    currentString = currentString + key;
                    break;
                }
                // delay
                try {
                    sleep(30);
                } catch (Exception e) {
                    System.out.println("Exception :" + e);
                }
            }
        }

    }
}

/* Expected output */
// Hello worl 
// Hello worla
// Hello worlb
// Hello worlc
// Hello world
