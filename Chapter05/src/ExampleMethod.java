import javax.swing.JApplet;
import javax.swing.JLabel;

public class ExampleMethod extends JApplet{
	
	JLabel lbl;
	
	public ExampleMethod() {
		lbl = new JLabel("Example...");
	}
	
	@Override
	public void init() {
		add(lbl);
		System.out.println("method init() invoked.");
	}
	
	@Override
	public void start() {
		System.out.println("method start() invoked.");
	}
	
	@Override
	public void stop() {
		System.out.println("method stop() invoked.");
	}
	
	@Override
	public void destroy() {
		System.out.println("method destroy() invoked.");
	}
}
