import javax.swing.JOptionPane;

public class primeornot {
public static void main(String[] args) {
	
	
	
	String o=JOptionPane.showInputDialog("choose a number");
	

	int num=Integer.parseInt(o);
	
	for (int i = 1; i < 100; i++) {
		
		if(num%i==0 || num%num==0) {
			System.out.println("it' not a prime");
		}
		else if(num/i == 1) {
			System.out.println("its a composite number");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
