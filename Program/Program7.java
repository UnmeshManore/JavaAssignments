/**
 * @author Unmesh Manore
 * Program - Print the factorial of given number
 */
import java.util.*;
public class Program7 
{
	//Main method
	public static void main(String args[])
	{
		//Declaring variables
		int factorial,userInput;
		factorial=1;
		//Creating scanner object for accepting user inputs
		Scanner obj = new Scanner(System.in);
				
		//Accepting user input
		System.out.println("Enter number for which factorial value is to be calculated : ");
		userInput=obj.nextInt();
		
		if (userInput==1)
		{
			System.out.println("Factorial of "+userInput+" is 1");
		}
		else
		{		
			//Initializing for loop for finding factorial of user input number
			for (int i=userInput;i>0;i--)
			{
				factorial=factorial*i;
			}
			
			System.out.println("Factorial of "+userInput+" is "+factorial);
		}
		obj.close();
	}
}
