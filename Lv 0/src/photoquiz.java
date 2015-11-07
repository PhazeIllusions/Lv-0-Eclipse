
// Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.jar.Pack200;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class photoquiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);
		Frame quizWindow2 = new Frame();
		quizWindow2.setVisible(true);
		Frame quizWindow3 = new Frame();
		quizWindow3.setVisible(true);


		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the
		// image, and select “Copy Image URL”)
		String dog = "https://www.petfinder.com/wp-content/uploads/2012/11/dog-how-to-select-your-new-best-friend-thinkstock99062463.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component imageHolder = createImage(dog);
		;
		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
		quizWindow.add(imageHolder);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String answer = JOptionPane.showInputDialog("What animal is this?");
		// 7. print "CORRECT" if the user gave the right answer
		if (answer.equals("Dog")) {
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "Incorrect!");
		}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		quizWindow.remove(imageHolder);
		// 10. find another image and create it
		String cat = "https://i.ytimg.com/vi/GchUiYAmlLM/maxresdefault.jpg";
		// 11. add the second image to the quiz window
		Component imageHolder2 = createImage(cat);
		quizWindow2.add(imageHolder2);
		// 12. pack the quiz window
		quizWindow2.pack();
		String cat2 = "https://i.ytimg.com/vi/GchUiYAmlLM/maxresdefault.jpg";
		// 11. add the second image to the quiz window
		Component imageHolder3 = createImage(cat2);
		quizWindow3.add(imageHolder3);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String answer2 = JOptionPane.showInputDialog("What animal is this?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (answer2.equals("Cat")) {
			JOptionPane.showMessageDialog(null, "Correct!");
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect!");
		}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener())
}
