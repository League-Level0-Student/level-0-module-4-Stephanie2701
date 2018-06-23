
import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {
		for (int i = 0; i < 100000; i++) {
			
		

		// 1. Get 2 numbers from the user and convert them to integer.
		String N = JOptionPane.showInputDialog("Enter one number");
		int number = Integer.parseInt(N);
		String M = JOptionPane.showInputDialog("Enter second number");
		int number2 = Integer.parseInt(M);

		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "choose an operation", "calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "add", "subtract", "multiply", "divide" }, null);
	
	// 5. Call the methods created in steps 3 and 4 to perform the appropriate
	// operation.
		if(operation==0) {
			add(number, number2);
		}
		else if(operation==1) {
			subtract(number, number2);
		}
		else if(operation==2) {
			multiply(number, number2);
		}
		else if (operation==3) {
			divide(number, number2);
		}
	// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
		}

	// 3. Create method for addition operation.
	// Method should create pop-up that shows equation and solution, eg. 45 + 25 =
	// 70.
	// HINT: use 'static void add(int num1, num2) { ... }
	}
	private static void add(int num1, int num2) {
		JOptionPane.showMessageDialog(null, num1 + "+" +num2+"="+(num1+num2));
	}

	// 4. Create similar methods for subtraction, multiplication and division.
	private static void subtract(int num1, int num2) {
		JOptionPane.showMessageDialog(null, num1 + "-" +num2+"="+(num1-num2));
	}

	private static void multiply(int num1, int num2) {
		JOptionPane.showMessageDialog(null, num1 + "*" +num2+"="+(num1*num2));
	}

	private static void divide(int num1, int num2) {
		JOptionPane.showMessageDialog(null, num1 +"/" +num2+"="+(num1/num2));

	}

}
