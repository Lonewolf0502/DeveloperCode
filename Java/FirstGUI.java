package SwingDemp;


import javax.swing.JFrame;
import javax.swing.JLabel;

public class FirstGUI {
public static void main(String[] args) {
	Abc obj = new Abc();
	
}
}
class Abc extends JFrame{          // CardLayout
	public Abc() {
		
		
		JLabel l = new JLabel("Hello World");
		JLabel l1 = new JLabel("Welcome Aditya");
		
		add(l);
		add(l1);
		setLayout(new FlowLayout()); //FlowLayout GridLayout NullLayout;
		setVisible(true);//obj.show();
		setSize(400,400);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
}
