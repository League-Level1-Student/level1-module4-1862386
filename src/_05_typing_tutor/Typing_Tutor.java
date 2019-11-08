package _05_typing_tutor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Typing_Tutor {
public static void main(String[] args) {
	JPanel p = new JPanel();
	JButton b = new JButton("Type or Die!!");
	JFrame f = new JFrame();
	f.add(p);
	p.add(b);

	f.setVisible(true);
	
}
}
