/**
 * @author Unmesh Manore
 * Program - Find whether given number is prime number or not
 */
import java.util.*;
public class Program5 
{
	//Main method
	public static void main(String args[])
	{
		//Declaring variables
		int num1;
		boolean prime=true;
		
		//Creating scanner object for accepting user inputs
		Scanner obj = new Scanner(System.in);
				
		//Accepting user input
		System.out.println("Enter number to check if it is a prime number : ");
		num1=obj.nextInt();
		
		//Initializing for loop to check if user input is a prime number
		for (int i=2; i < num1; i++)
		{
			if ((num1%i) == 0)
			{
				System.out.println("Number "+num1+" is not a prime number");
				prime=false;
				break;				
			}
		}
		if (prime == true)
		{
			System.out.println("Number "+num1+" is a prime number");
		}
		obj.close();
	}
}
