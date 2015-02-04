package ch1;
import javax.swing.JOptionPane;

public class Project1_1 
{
	public static void main(String[] args)
	{
		// Get the user name
		String name = JOptionPane.showInputDialog("What is your name?");
		
		// Ask user what they want to do
		String action = JOptionPane.showInputDialog("What would you like me to do?");
		JOptionPane.showMessageDialog(null, "I'm sorry, " + name + ". I'm afraid I can't do that.");
		System.exit(0);
	}
}
