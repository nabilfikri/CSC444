import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.*;

class CombineLayoutGUI extends JFrame implements ActionListener, ItemListener
{
	public JLabel lblPartA, lblPartB, lblPercentage, lblresPartA, lblresPartB, lblTotal;
	public JTextField tfPartA, tfPartB, tfresPartA, tfresPartB, tfTotal;
	public JButton btnprocess, btnclear,btnexit;
	public JRadioButton rbPartA, rbPartB;
	public ButtonGroup radioGroup;
	public Container cont;
	public BorderLayout layout;
	public JPanel panelNorth, panelCenter, panelSouth, panelNorthA, panelNorthB;

	public CombineLayoutGUI()
	{
		super("Test 1 Processing Module");
		layout = new BorderLayout();
		cont = getContentPane();
		cont.setLayout(layout);

		lblPartA = new JLabel("Mark Part A : ", SwingConstants.LEFT);
		lblPartB = new JLabel("Mark Part B : ", SwingConstants.LEFT);
		lblPercentage = new JLabel("Percentage :: ", SwingConstants.CENTER);
		lblresPartA = new JLabel("Result for Part A :", SwingConstants.LEFT);
		lblresPartB = new JLabel("Result for Part B :", SwingConstants.LEFT);
		lblTotal = new JLabel("Total Part (A + B) :", SwingConstants.LEFT);

		tfPartA = new JTextField(4);
		tfPartB = new JTextField(4);
		tfresPartA = new JTextField(4);
		tfresPartA.setEditable(false);
		tfresPartB = new JTextField(4);
		tfresPartB.setEditable(false);
		tfTotal = new JTextField(4);
		tfTotal.setEditable(false);

		btnprocess = new JButton("Process");
		btnclear = new JButton("Clear");
		btnexit = new JButton("Exit");

		rbPartA = new JRadioButton("A-40%");
		rbPartB = new JRadioButton("B-60%");

		radioGroup = new ButtonGroup();
		radioGroup.add(rbPartA);
		radioGroup.add(rbPartB);

		panelNorth = new JPanel();
		panelNorth.setLayout(new GridLayout(2,0));

		panelNorth.setBorder(new TitledBorder (new EtchedBorder(), "Data"));

		panelNorthA = new JPanel();
		panelNorthA.setLayout(new GridLayout(2,2));

		panelNorthB = new JPanel();
		panelNorthB.setLayout(new GridLayout(1,3));

		panelCenter = new JPanel();
		panelCenter.setLayout(new GridLayout(3,2));
		panelCenter.setBorder(new TitledBorder (new EtchedBorder(), "Result"));

		panelSouth = new JPanel();
		panelSouth.setLayout(new GridLayout(1,3));

		panelNorthA.add(lblPartA);
		panelNorthA.add(tfPartA);
		panelNorthA.add(lblPartB);
		panelNorthA.add(tfPartB);

		panelNorthB.add(lblPercentage);
		panelNorthB.add(rbPartA);
		panelNorthB.add(rbPartB);

		panelCenter.add(lblresPartA);
		panelCenter.add(tfresPartA);
		panelCenter.add(lblresPartB);
		panelCenter.add(tfresPartB);
		panelCenter.add(lblTotal);
		panelCenter.add(tfTotal);

		panelSouth.add(btnprocess);
		panelSouth.add(btnclear);
		panelSouth.add(btnexit);

		panelNorth.add(panelNorthA);
		panelNorth.add(panelNorthB);

		rbPartA.addItemListener(this);
		rbPartB.addItemListener(this);

		btnprocess.addActionListener(this);
		btnclear.addActionListener(this);
		btnexit.addActionListener(this);

		cont.add(panelNorth, BorderLayout.NORTH);
		cont.add(panelCenter, BorderLayout.CENTER);
		cont.add(panelSouth, BorderLayout.SOUTH);

		setSize(450, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e)
	{
		int PartA = Integer.parseInt(tfPartA.getText());
		int PartB = Integer.parseInt(tfPartB.getText());


		if (e.getSource()==btnprocess) {
			double total = PartA * 0.4 + PartB * 0.6;
			tfTotal.setText(""+total);
			}
		else if (e.getSource()==btnclear){
			tfPartA.setText("");
			tfPartB.setText("");
			tfresPartA.setText("");
			tfresPartB.setText("");
			tfTotal.setText("");
		}
		else if (e.getSource()==btnexit)
			System.exit(0);
	}

	public void itemStateChanged(ItemEvent e)
	{
		int PartA = Integer.parseInt(tfPartA.getText());
		int PartB = Integer.parseInt(tfPartB.getText());

		if (e.getSource()==rbPartA){
			double resPartA = .4 * PartA;
			tfresPartA.setText("");
			tfresPartA.setText(""+resPartA);
		}
		else {
			double resPartB = .6 * PartB;
			tfresPartB.setText("");
			tfresPartB.setText(""+resPartB);
		}
	}

	public static void main(String[] args)
	{

	CombineLayoutGUI exercise = new CombineLayoutGUI();

	}


}