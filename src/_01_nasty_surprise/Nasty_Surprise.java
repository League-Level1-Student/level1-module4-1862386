package _01_nasty_surprise;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Nasty_Surprise {
public static void main(String[] args) {
	JButton b = new JButton ("Trick");
	JButton j = new JButton ("Treat");
	JPanel p = new JPanel ();
	JFrame f = new JFrame ();
	f.add(p);
	p.add(b);
	p.add(j);
	f.setVisible(true);
}			
}
