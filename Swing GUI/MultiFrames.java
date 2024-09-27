import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiFrames extends JFrame {

    public MultiFrames() {
        // Set up the frame
        setTitle("My Frame");
        setSize(300, 200);
        // Close only the current frame, not the entire application
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create a button
        JButton newFrameButton = new JButton("Open New Frame");

        // Add action listener to the button
        newFrameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create a new instance of the current class (MyFrame)
                MultiFrames newFrame = new MultiFrames();
                newFrame.setVisible(true); // Make the new frame visible
            }
        });

        // Add button to the frame
        add(newFrameButton);

        // Set the layout
        setLayout(null);
        newFrameButton.setBounds(80, 70, 140, 30);
    }

    public static void main(String[] args) {
        // Create and display the frame
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MultiFrames frame = new MultiFrames();
                frame.setVisible(true);
            }
        });
    }
}
