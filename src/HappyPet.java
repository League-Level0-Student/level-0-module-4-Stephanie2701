import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String a=JOptionPane.showInputDialog("what kind of pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			for (int i = 0; i <7 ; i++) {
				
			
			int ask = JOptionPane.showOptionDialog(null, "what do you want to do to make your pet happy?", "Life's of pets", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "cuddle", "take a walk", "clean up poop" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if(ask==0) {
				Cuddle();
			}
			else if(ask==1) {
				Walk();
			}
			else if(ask==2) {
				CleanUpPoop();
			}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

			if(happinessLevel==3) {
				JOptionPane.showMessageDialog(null, "You love your pet!");
				System.exit(0);	
			}
			
		
	}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
		
	private static void Cuddle() {
		JOptionPane.showMessageDialog(null, "purr");
		happinessLevel++;
	}
	private static void Walk() {
		JOptionPane.showMessageDialog(null, "drinks water");
		happinessLevel++;
	}
	private static void CleanUpPoop() {
		JOptionPane.showMessageDialog(null, "runs in circles");
		happinessLevel++;
	}
	
}