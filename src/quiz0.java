
import javax.swing.JOptionPane;

public class quiz0 {
	public static void main(String[] args) {

		String v = JOptionPane.showInputDialog("what do you call a dinosaur that is sleeping?");

		if (v.equalsIgnoreCase("a dino-snore")) {
			JOptionPane.showMessageDialog(null, "you are no fun");
		} else {
			JOptionPane.showMessageDialog(null, "A dino-snore!");
		}

	}
}
