package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import jdk.nashorn.internal.scripts.JO;

public class Chuckle_Clicker implements ActionListener {
public static void main(String[] args) {
	Chuckle_Clicker jim = new Chuckle_Clicker();
	jim.makeButtons();	
	
}

private void makeButtons() {
	// TODO Auto-generated method stub
	JPanel p = new JPanel();
	JPanel a = new JPanel();
	JButton b = new JButton("joke");
	JButton j = new JButton("punchline");
	JFrame f = new JFrame();
	f.add(a);
	f.add(p);
	p.add(b);
	p.add(j);
	
	f.setVisible(true);
	
	

	b.addActionListener (this);
	

	j.addActionListener(this);
	

	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(null, "Hi");


}
}
