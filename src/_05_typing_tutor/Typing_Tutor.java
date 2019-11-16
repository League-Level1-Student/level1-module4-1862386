package _05_typing_tutor;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Typing_Tutor implements KeyListener {
public static void main(String[] args) {
	Typing_Tutor t = new Typing_Tutor();
	t.run();


}
static char generateRandomLetter() {
    Random r = new Random();
    return ((char) (r.nextInt(26) + 'a'));

}
void run() {
	JPanel p = new JPanel();
	//JButton b = new JButton("Type or Die!!");
	JFrame f = new JFrame("Type or Die");
	char currentLetter;
	currentLetter = generateRandomLetter();
	JLabel l = new JLabel();
	l.setText(currentLetter+"");
	System.out.println(currentLetter);
	l.setVisible(true);
	p.add(l);
	f.add(p);
	f.addKeyListener(this);
	//p.add(b);
	f.setVisible(true);
	l.setFont(l.getFont().deriveFont(28.0f));
	l.setHorizontalAlignment(JLabel.CENTER);

}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}




