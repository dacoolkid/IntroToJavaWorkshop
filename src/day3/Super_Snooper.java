package day3;

import javax.swing.JOptionPane;

public class Super_Snooper {
	public static void main(String[] args) {
		JOptionPanq.showMessageDialog(null, "I am your father.");
		String ssn = JOptionPane.showInputDialog("What Is Your Social Security Number");
		String Name = JOptionPane.showInputDialog("What Is Your Name");
		String School = JOptionPane.showInputDialog("What Was The Name Of Your Elementary School");
		String Card = JOptionPane.showInputDialog("What Is Your Credit Card Information");
		JOptionPane.showConfirmDialog(null, "Is this information correct?"
				+ "\n" + ssn
				+ "\n" + Name
				+ "\n" + School
				+ "\n" + Card);
		JOptionPane.showConfirmDialog(null, "Click Yes To Confirm!!!!");
		JOptionPane.showConfirmDialog(null, "You Won!!!!!!!!! Fill Out This Completely Legitamate Survey To Win 1000000000000000000000000000000000000000 Pennies!!!!");
		
	}
}
