/**
 * @author Unmesh Manore
 * Program - Print the mathematical table of give number
 */
import java.util.*;
public class Program3 
{
	//Main method
	public static void main(String args[])
	{
		//Declaring variables
		int tableNum;
		
		//Creating scanner object for accepting user inputs
		Scanner obj = new Scanner(System.in);
		
		//Accepting user input
		System.out.println("Enter number for which mathematical table is to be printed : ");
		tableNum=obj.nextInt();
		
		//Initializing for loop for printing mathematical table of user input
		for (int i=1;i<11;i++)
		{
			System.out.println(tableNum+" * "+i+" = "+(tableNum*i));
		}
		obj.close();
	}
}
