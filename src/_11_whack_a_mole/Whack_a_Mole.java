package _11_whack_a_mole;

import java.awt.Container;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Whack_a_Mole {
	public static void main(String[] args) {
		Whack_a_Mole w = new Whack_a_Mole();
		w.drawButtons();
	}

	void drawButtons() {
		JPanel p = new JPanel();
		JFrame f = new JFrame("Whack a Button for Fame and Glory");
		for (int i = 0; i < 24; i++) {
			JButton b = new JButton();
			p.add(b);
		}
		f.add(p);
		f.setVisible(true);
		f.setSize(640, 640);

	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int generateRandomIntIntRange() {
		Random r = new Random();
		return r.nextInt((24 - 1) + 1) + 1;
	}
}
