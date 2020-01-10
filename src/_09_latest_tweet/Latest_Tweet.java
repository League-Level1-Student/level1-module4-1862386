package _09_latest_tweet;

import java.awt.event.ActionListener;

import javax.management.Query;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Latest_Tweet {
	public static void main(String[] args) {
		
	}
	void setup() {
		JPanel p = new JPanel();
		JFrame f = new JFrame("The Amazing Tweet Retriever");
		JTextField i = new JTextField(5);
		JButton b = new JButton("Search the Twitterverse!");
		f.add(p);
		p.add(i);
		p.add(b);
		f.setVisible(true);
		f.pack();
	p.addActionListener((ActionListener) this);
	
	}
 void checkButton () {
	JButton buttonPressed = (JButton) e.getSource();
	buttonPressed.addActionListener((ActionListener) this);
	if (buttonPressed == true) {
		System.out.println();	
	}
		
		//Switch Statement
		//int x = ...
		//switch(x) {
		//case 0 :
		// break;
		//case 1:
		//break;
		//default:
		//break
		//}
		//What is the value that i am checking. "less flexible than an else if".
	
	
	
	
	
	private String getLatestTweet(String searchingFor) {

	    Twitter twitter = new TwitterFactory().getInstance();

	    AccessToken accessToken = new AccessToken(
	        "2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
	        "vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
	    twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
	        "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
	    twitter.setOAuthAccessToken(accessToken);

	Query query = new Query();
	    try {
	        QueryResult result = twitter.search(query);
	        return result.getTweets().get(0).getText();
	    } catch (Exception e) {
	        System.err.print(e.getMessage());
	        return "";
	    }
	}
}
}

