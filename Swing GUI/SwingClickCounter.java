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
        JLabel label = new JLabel("Click the button :)", JLabel.CENTER);

        // Create a JButton
        JButton button = new JButton("Click Me");

        // Create counter variables
        final int[] count = {1};
        final int maxCount = 10;

        // Add an ActionListener to the button to handle button clicks
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(count[0] < maxCount){
                    // Update the label text and increment the counter
                    label.setText("Clicks: " + count[0]);
                    count[0]++;
                } else {
                    label.setText("Congratulation! you clicked "+ count[0] +" times");
                    frame.remove(button);
                }
                
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
