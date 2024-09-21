import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SwingClickCounter {
    public static void main(String[] args) {
        // Create the JFrame (window)
        JFrame frame = new JFrame("Click Counter");

        // Create a JLabel to display the counter value
        JLabel label = new JLabel("Clicks: 0", JLabel.CENTER);

        // Create a JButton
        JButton button = new JButton("Click Me");

        // Create a counter variable
        final int[] count = {0};

        // Add an ActionListener to the button to handle button clicks
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Increment the counter and update the label text
                count[0]++;
                label.setText("Clicks: " + count[0]);
            }
        });

        // Add the label and button to the frame
        frame.add(label, "Center");
        frame.add(button, "South");

        // Set the frame size and behavior
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
