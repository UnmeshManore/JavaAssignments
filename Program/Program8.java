/**
 * @author Unmesh Manore
 * Program - Print factorial of all the numbers between given range
 */
import java.util.*;
public class Program8
{
	//Main method
	public static void main(String args[])
	{
		//Declaring variables
		int startRange,endRange,factorial;
		
		//Creating scanner object for accepting user inputs
		Scanner obj = new Scanner(System.in);
				
		//Accepting start range input
		System.out.println("Enter start range number : ");
		startRange=obj.nextInt();
		
		//Accepting start range input
		System.out.println("Enter end range number : ");
		endRange=obj.nextInt();
		
		//Initializing loop to cycle number from start range value to end range value
		
		for (int j = startRange;j <= endRange; j++)
		{
			//Reinitializing value at every iteration
			factorial=1;
			
			if (j==1)
			{
				System.out.println("Factorial of "+j+" is 1");
			}
			else
			{		
				//Initializing for loop for finding factorial of user input number
				for (int i=j;i>0;i--)
				{
					factorial=factorial*i;
				}
				
				System.out.println("Factorial of "+j+" is "+factorial);
			}
		}
		obj.close();
	}
}
