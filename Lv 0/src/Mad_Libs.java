import javax.swing.JOptionPane;

public class Mad_Libs
{
	public static void main(String[] args) {
		String adjective=	JOptionPane.showInputDialog("Enter an adjective");
		String noun=	JOptionPane.showInputDialog("Enter a noun");
		String verb=	JOptionPane.showInputDialog("Enter a present-tense verb");
		JOptionPane.showMessageDialog(	null,"There once was a " + adjective + " person, his name was " + noun + " the person was " + verb + " at the moment.");
	}
}

