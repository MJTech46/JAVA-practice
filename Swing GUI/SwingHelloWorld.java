import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingHelloWorld {
    public static void main(String[] args) {
        // Create the JFrame (window)
        JFrame frame = new JFrame("Hello World");

        // Add a JLabel with "Hello World" text
        frame.add(new JLabel("Hello, World!", JLabel.CENTER));

        // Set the frame size and behavior
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
