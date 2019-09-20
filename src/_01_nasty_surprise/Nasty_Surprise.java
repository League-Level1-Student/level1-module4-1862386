package _01_nasty_surprise;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Nasty_Surprise implements ActionListener {
	JButton b = new JButton ("Trick");
	JButton j = new JButton ("Treat");

public static void main(String[] args) {
	Nasty_Surprise ns = new Nasty_Surprise ();
	ns.Gui();
}			

void Gui (){
	
	JPanel p = new JPanel ();
	JFrame f = new JFrame ();
	f.add(p);
	p.add(b);
	p.add(j);
	f.setVisible(true);
	
	b.addActionListener(this);
	j.addActionListener(this);
	
	
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton pressed = (JButton) e.getSource();
	if (pressed == j) {
		showPictureFromTheInternet("https://www.gannett-cdn.com/presto/2019/09/04/USAT/ef30f670-f37c-4d63-ad69-e9ebb068c08c-EPA_USA_TRUMP_HURRICANE_DORIAN.JPG?width=540&height=&fit=bounds&auto=webp");
	}
	if (pressed == b) {
		showPictureFromTheInternet("https://cdn2-www.dogtime.com/assets/uploads/2011/03/puppy-development.jpg");
	}
}
private void showPictureFromTheInternet(String imageUrl) {
    try {
         URL url = new URL(imageUrl);
         Icon icon = new ImageIcon(url);
         JLabel imageLabel = new JLabel(icon);
         JFrame frame = new JFrame();
         frame.add(imageLabel);
         frame.setVisible(true);
         frame.pack();
    } catch (MalformedURLException e) {
         e.printStackTrace();
    }
}
}


