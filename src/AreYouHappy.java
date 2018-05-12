import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog(null, "Are you Happy?");
		if (answer.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
		}
		if (answer.equals("no")) {
			String hi = JOptionPane.showInputDialog(null, "Do you want to be happy?");

			if (hi.equals("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
			}
			if (hi.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change something.");

			}
		}

	}
}
