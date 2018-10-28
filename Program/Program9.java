/**
 * @author Unmesh Manore
 * Program - Find whether the given number is palindrome or not
 */
import java.util.*;
public class Program9 
{
	public static void main(String args[])
	{
		//Initializing string objects
		String userInput,reverseString = "";
		
		//Initializing variables
		int length,numCheck;
		
		//Creating scanner object for accepting user inputs
		Scanner obj = new Scanner(System.in);
				
		//Accepting start range input
		System.out.println("Enter the number to check for palindrome : ");
		userInput=obj.nextLine();
		//Validating if entered input is number
		try 
		{
			numCheck=Integer.parseInt(userInput);
			length = userInput.length();
			
			//Initializing loop
			for (int i = length-1; i >= 0; i--)
			{
				//Reversing the user input and storing in variable
				reverseString = reverseString +userInput.charAt(i);
			}
			
			if (userInput.equals(reverseString))
			{
				System.out.println(userInput+" is a palindrome");
			}
			else
			{
				System.out.println(userInput+" is not a palindrome");
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println("Entered input is not a number");
		}
		obj.close();
	}

}