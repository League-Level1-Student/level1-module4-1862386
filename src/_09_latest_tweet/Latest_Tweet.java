package _09_latest_tweet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Latest_Tweet {
	public static void main(String[] args) {
		JPanel p = new JPanel();
		JFrame f = new JFrame("The Amazing Tweet Retriever");
		JTextField i = new JTextField(5);
		JButton b = new JButton("Search the Twitterverse!");
		f.add(p);
		p.add(i);
		p.add(b);
		f.setVisible(true);
		f.pack();
	}
}
