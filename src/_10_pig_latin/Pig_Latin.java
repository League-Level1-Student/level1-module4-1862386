package _10_pig_latin;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Pig_Latin {
	void Tweet() {
		JPanel p = new JPanel();
		JFrame f = new JFrame("Jake's Pig Latin Translator");
		JTextField i = new JTextField(5);
		JButton b = new JButton("Translate!");
		JTextField e = new JTextField(5);
		f.add(p);
		p.add(i);
		p.add(b);
		p.add(e);
		f.setVisible(true);
		f.pack();

	}

	public static void main(String[] args) {
		Pig_Latin pig = new Pig_Latin();
		pig.Tweet();
	}

	private static boolean isLetter(char c) {
		return ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'));
	}

	private static String pigWord(String word) {
		int split = firstVowel(word);
		return word.substring(split) + "-" + word.substring(0, split) + "ay";
	}

	public String translate(String s) {
		String latin = "";
		int i = 0;
		while (i < s.length()) {
// Take care of punctuation and spaces
			while (i < s.length() && !isLetter(s.charAt(i))) {
				latin = latin + s.charAt(i);
				i++;
			}
// If there aren't any words left, stop.
			if (i >= s.length())
				break;
// Otherwise we're at the beginning of a word.
			int begin = i;
			while (i < s.length() && isLetter(s.charAt(i))) {
				i++;
			}
// Now we're at the end of a word, so translate it.
			int end = i;
			latin = latin + pigWord(s.substring(begin, end));
		}
		return latin;
	}

	private static int firstVowel(String word) {
		word = word.toLowerCase();
		for (int i = 0; i < word.length(); i++)
			if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
					|| word.charAt(i) == 'u')
				return i;
		return 0;
	}
}
