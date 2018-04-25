//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String x=JOptionPane.showInputDialog("how many nickles do you have?");

		// Convert their answer to an int using Integer.parseInt()
		int nickles=Integer.parseInt(x);
		// Ask the user how many dimes they have, and convert their answer
		String y=JOptionPane.showInputDialog("how may dimes do you have?");
		int dimes=Integer.parseInt(y);
		
		// Ask the user how many quarters they have, and convert their answer
		String z=JOptionPane.showInputDialog("how many quaters do you have?");
		int quaters=Integer.parseInt(z);

		// Calculate how much money the user has and save it in a double variable 
		
		double cash = (nickles*0.05)+(dimes*0.10)+(quaters*0.25);
		

		// Tell the user how much money they have
		JOptionPane.showMessageDialog(null, cash);
	}
}

