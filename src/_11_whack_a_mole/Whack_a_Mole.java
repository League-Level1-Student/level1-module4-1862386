package _11_whack_a_mole;

import java.awt.Container;
import java.sql.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class Whack_a_Mole {
	public static void main(String[] args) {
		Whack_a_Mole w = new Whack_a_Mole();
		w.drawButtons();
	}
	public static int generateRandomIntIntRange() {
		Random r = new Random();
		return r.nextInt((24));
		
	}
	void drawButtons() {
		JPanel p = new JPanel();
		JFrame f = new JFrame("Whack a Button for Fame and Glory");
		int r = generateRandomIntIntRange();
		for (int i = 0; i < 24; i++) {
			JButton b = new JButton();
			p.add(b);
			if (i == r) {
			b.setText("mole!");
			}
		}
		f.add(p);
		f.setVisible(true);
		f.setSize(672, 150);

	}
	//if (mousePressed == b) {
			
//	}
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
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	}

}
