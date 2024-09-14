// GUI
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // no constructor is needed 

        String str = JOptionPane.showInputDialog("Enter a string:");
        JOptionPane.showMessageDialog(null, "You entered: " + str);
    }
}
