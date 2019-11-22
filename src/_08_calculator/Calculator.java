package _08_calculator;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
public static void main(String[] args) {
	
}
Calculator () {
	Calculator c = new Calculator();
	JPanel p = new JPanel();
	JButton b = new JButton("Add");
	JButton u = new JButton("Sub");
	JButton t = new JButton("Mul");
	JButton o = new JButton("Div");
	JFrame f = new JFrame("Calculator");
	JTextField i = new JTextField();
	JTextField j = new JTextField();
	f.add(p);
	p.add(b);
	p.add(u);
	p.add(t);
	p.add(o);
	p.add(i);
	p.add(j);
	f.setVisible(true);
	b.addActionListener((ActionListener) this);
	u.addActionListener((ActionListener) this);
	t.addActionListener((ActionListener) this);
	o.addActionListener((ActionListener) this);
	
}
}
