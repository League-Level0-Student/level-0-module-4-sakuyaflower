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
String nickels = JOptionPane.showInputDialog(null,"How many nickels do u have with you right now?");
		// Convert their answer to an int using Integer.parseInt()
int nickelz = Integer.parseInt(nickels);
		// Ask the user how many dimes they have, and convert their answer
String dimes = JOptionPane.showInputDialog(null,"How many dimes do u have with you right now?");
		// Ask the user how many quarters they have, and convert their answer
int dimez = Integer.parseInt(dimes);
		// Calculate how much money the user has and save it in a double variable 
double monies=dimez*.1+nickelz*.05;
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null,"You have "+monies);
	}
}

