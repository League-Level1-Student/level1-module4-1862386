package _11_whack_a_mole;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class Whack_a_Mole implements ActionListener {
	//Member variables!!
	JPanel p = new JPanel();
	JFrame f = new JFrame("Whack a Button for Fame and Glory");
	public static void main(String[] args) {
		Whack_a_Mole w = new Whack_a_Mole();
		w.drawButtons();
	}

	public static int generateRandomIntIntRange() {
		Random r = new Random();
		return r.nextInt((24));

	}

	void drawButtons() {
		//replacing the value of the variables!!
		 p = new JPanel();
		int r = generateRandomIntIntRange();
		f.add(p);
		f.setVisible(true);
		f.setSize(672, 150);
		for (int i = 0; i < 24; i++) {
			JButton b = new JButton();
			p.add(b);
			b.addActionListener(this);
			if (i == r) {
				b.setText("mole!");
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if (buttonPressed.getText() ==  "mole!") {
		f.remove(p);
		drawButtons();
}
}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("Why would you press it? " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date(molesWhacked);
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}

}
