package testPackage;

import java.awt.FlowLayout;		// import default windows layout spacing and placement
import javax.swing.JFrame;		// import basic windows features
import javax.swing.JLabel;		// import text and images on screen

public class JFrameGUI extends JFrame {
	
	private JLabel item1;
	
	public JFrameGUI(){
		super("Title Bar");				// adds the title
		setLayout(new FlowLayout());	// adds default layout
		
		item1 = new JLabel("This is a message.");
		item1.setToolTipText("This message will appear when hovering.");
		add(item1);						// adds the item to the window
		
	}
}
