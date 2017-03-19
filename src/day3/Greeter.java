package day3;

import javax.swing.JOptionPane;


public class Greeter {
	
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Please Input Your Name You Silly Willy");
		JOptionPane.showMessageDialog(null, "Hi " + name + "!");
		
	}
	

}
