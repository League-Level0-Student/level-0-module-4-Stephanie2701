import javax.swing.JOptionPane;

public class warmup {
public static void main(String[] args) {
	String x=JOptionPane.showInputDialog("Enter a word");
	String y=JOptionPane.showInputDialog("Enter a number");
	int number=Integer.parseInt(y);
		for (int i = 0; i< number; i++) {

		System.out.println(x);
	}
	
		
	}
}

