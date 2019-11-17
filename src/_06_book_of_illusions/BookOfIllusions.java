package _06_book_of_illusions;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import jdk.nashorn.internal.scripts.JO;

/**
 * We’re going to make a slideshow of cool optical illusions. When the user
 * clicks on an illusion, a new one will be loaded.
 **/

public class BookOfIllusions extends MouseAdapter {

	// 1. Make a JFrame variable and initialize it using "new JFrame()"
	JFrame f = new JFrame();

	public void run() {
		// 2. make the frame visible
		f.setVisible(true);
		// 3. set the size of the frame
		f.setSize(800, 800);
		// 4. find 2 images and save them to your project’s default package
		// 5. make a variable to hold the location of your image. e.g. "illusion.jpg"
		String illustion1 = "Opt Ill 1.jpg";
		// 6. create a variable of type "JLabel" but don’t initialize it yet
		JLabel l = new JLabel();
		// 7. use the "loadImage..." methods below to initialize your JLabel
		loadImageFromComputer(illustion1);
		String imageURl = "www.google.com/search?q=optical+illusions&source=lnms&tbm=isch&sa=X&ved=0ahUKEwiAn5vug_LlAhUJXK0KHRnzARgQ_AUIEigB&biw=1451&bih=890#imgrc=_-kYyAgNviFQDM";
		// 8. add your JLabel to the frame
		f.add(l);
		// 9. call the pack() method on the frame
		f.pack();
		// 10. add a mouse listener to your frame (hint: use *this*)
		f.addMouseListener(this);
	}

	public void mousePressed(MouseEvent e) {
		// 11. Print "clicked!" to the console when the mouse is pressed
			System.out.println("clicked!");
		
		// 12. remove everything from the frame that was added earlier
		// 13. load a new image like before (this is more than one line of code)
		String optical1 = "illustion2.jpg";
		loadImageFromComputer(optical1);
		String imageURL = "https://www.google.com/search?q=optical+illusions&source=lnms&tbm=isch&sa=X&ved=0ahUKEwi7mIijhvLlAhVFAqwKHeUKA-wQ_AUIEigB&biw=1451&bih=890#imgrc=k8XsBUqrqGicAM";
		// 14. pack the frame
		f.pack();
	}

	// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups
		
	/*
	 * To use this method, the image must be placed in your Eclipse project under
	 * "default package".
	 */
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

}
