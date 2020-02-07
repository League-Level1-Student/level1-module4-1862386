package _12_slot_machine;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Slot_Machine {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JLabel l = new JLabel();
	JLabel a = new JLabel();
	JLabel b = new JLabel();
	JButton e = new JButton("Spin!");

	public static void main(String[] args) {
		Slot_Machine rob = new Slot_Machine();
		rob.createGUI();
	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}

	void createGUI() {
		
		try {
			a = createLabelImage("Cherry.jpg");
			b = createLabelImage("Lime.jpg");
			l = createLabelImage("Orange.jpg");
			System.out.println("Hi");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		f.add(p);
		p.add(l);
		p.add(a);
		p.add(b);
		p.add(e);
		f.setVisible(true);
		f.pack();

	}
}
