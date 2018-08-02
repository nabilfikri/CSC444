import javax.swing.*;

public class DisplayAppletInFrame extends JApplet {
  public DisplayAppletInFrame() {
    add(new JLabel("Great!", JLabel.CENTER));
  }
  
  public static void main(String[] args) {
    // Create a frame
    JFrame frame = new JFrame("Applet is in the frame");

    // Create an instance of the applet
    DisplayAppletInFrame applet = new DisplayAppletInFrame();

    // Add the applet to the frame
    frame.add(applet);

    // Display the frame
    frame.setSize(300, 100);
    frame.setLocationRelativeTo(null); // Center the frame   
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
