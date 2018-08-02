import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class TestCheckAndRadio extends JFrame{

	public TestCheckAndRadio(){
		setLayout(new BorderLayout());

		JPanel pnlRadio = new JPanel(new FlowLayout());
		JPanel pnlCheck = new JPanel(new FlowLayout());
		ButtonGroup bgRadio = new ButtonGroup();
		ButtonGroup bgCheck = new ButtonGroup();
		
		JRadioButton rbDesktop = new JRadioButton("Desktop Application");
		JRadioButton rbWeb = new JRadioButton("Web-base Application");
		JRadioButton rbMobile = new JRadioButton("Mobile Application");
		
		bgRadio.add(rbDesktop);
		bgRadio.add(rbWeb);
		bgRadio.add(rbMobile);
		
		JCheckBox cbPHP = new JCheckBox("PHP");
		JCheckBox cbASP = new JCheckBox("ASP");
		JCheckBox cbJSP = new JCheckBox("JSP");
		
//		bgCheck.add(cbPHP);
//		bgCheck.add(cbASP);
//		bgCheck.add(cbJSP);
		
		pnlRadio.add(rbDesktop);
		pnlRadio.add(rbWeb);
		pnlRadio.add(rbMobile);
		
		pnlCheck.add(cbPHP);
		pnlCheck.add(cbASP);
		pnlCheck.add(cbJSP);
		
		add(pnlRadio, BorderLayout.NORTH);
		add(pnlCheck, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		
		TestCheckAndRadio frame = new TestCheckAndRadio();
	    frame.setTitle("Test Radio Button and Check Box");
	    frame.setSize(450, 100);
	    frame.setLocationRelativeTo(null);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	}

}
