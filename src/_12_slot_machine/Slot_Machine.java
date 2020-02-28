package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Slot_Machine implements ActionListener {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JLabel l = new JLabel();
	JLabel a = new JLabel();
	JLabel b = new JLabel();
	JButton spin = new JButton("Spin!");
	Random numberGenerator = new Random();
	int x = numberGenerator.nextInt(3);

	public static void main(String[] args) {
		Slot_Machine rob = new Slot_Machine();
		rob.createGUI();
	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
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
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		spin.addActionListener(this);
		f.add(p);
		p.add(l);
		p.add(a);
		p.add(b);
		p.add(spin);
		f.setVisible(true);
		f.pack();

	}

	public void actionPerformed(ActionEvent e) {

		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == spin) {
			
			p.removeAll();
			p.add(spin);
			for (int i = 0; i < 3; i++) {
				x = numberGenerator.nextInt(3);
				System.out.println(x);

				if (x == 0) {
					JLabel d = new JLabel();
					try {
						d = createLabelImage("Cherry.jpg");
					} catch (MalformedURLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					p.add(d);
				} else if (x == 1) {
					JLabel j = new JLabel();
					try {
						j = createLabelImage("Lime.jpg");
					} catch (MalformedURLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					p.add(j);

				} else {
					JLabel o = new JLabel();
					try {
						o = createLabelImage("Orange.jpg");
					} catch (MalformedURLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					p.add(o);
				}

			}
			
			f.pack();

		}

	}

}