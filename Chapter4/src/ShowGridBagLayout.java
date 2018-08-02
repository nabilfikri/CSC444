import java.awt.*;

import javax.swing.*;

public class ShowGridBagLayout extends JFrame {

	public ShowGridBagLayout() {
		// Set GridBagLayout in the container
		setLayout(new GridBagLayout());
		
		GridBagConstraints gbc = new GridBagConstraints();
//		gbc.insets = new Insets(5, 5, 5, 5);

		JButton btn1 = new JButton("Button 1");
		gbc.gridx = 0;
		gbc.gridy = 0;
		add(btn1, gbc);
		
		JButton btn2 = new JButton("Button 2");
		gbc.gridx = 1;
		gbc.gridy = 1;
		add(btn2, gbc);
		
		JButton btn3 = new JButton("Button 3");
		gbc.gridx = 2;
		gbc.gridy = 2;
		add(btn3, gbc);
		
		JButton btn4 = new JButton("Button 4");
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 3;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		add(btn4, gbc);
	}

	public static void main(String[] args) {
		ShowGridBagLayout frame = new ShowGridBagLayout();
	    frame.setTitle("Show GridBagLayout");
	    frame.setSize(500, 500);
	    frame.setLocationRelativeTo(null); // Center the frame
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	}
}