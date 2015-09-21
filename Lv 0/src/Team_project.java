import javax.swing.JOptionPane;

public class Team_project {
	public static void main(String[] args) {
		String i = JOptionPane.showInputDialog("Pick a number between 1-4");
		int x = Integer.parseInt(i);
		if (x == 1) {
			String w = JOptionPane.showInputDialog("Give me one number");
			String y = JOptionPane.showInputDialog("Give me another number");
			int a = Integer.parseInt(w);
			int b = Integer.parseInt(y);
			System.out.println(a + b);

		} else if (x == 2) {
			String m = JOptionPane
					.showInputDialog("how much does a dinosuar cost?");
			String n = JOptionPane
					.showInputDialog("What would you pay for a dinosaur");
			float g = Float.parseFloat(m);
			float h = Float.parseFloat(n);
			System.out.println(g - h + ": This is what you have to pay");
		} else if (x == 3) {
			String d = JOptionPane.showInputDialog("Type a message");
			System.out.println(d);
		} else if (x == 4) {
			System.exit(0);
		} else {
			System.out.println("error");
		}
	}
}
