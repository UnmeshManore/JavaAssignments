/**
 * @author Unmesh Manore
 * Program - Find whether the given number is Armstrong number or not
 */
import java.util.*;
public class Program10 
{
	public static void main(String args[])
	{
		//Initializing variables
		int num1,len,numTemp,digitTotal,finalTotal=0;
		char temp;
		
		//Creating scanner object for accepting user inputs
		Scanner obj = new Scanner(System.in);
				
		//Accepting user input to check if number is Armstrong number
		System.out.println("Enter the number to check if it is Armstrong number : ");
		num1=obj.nextInt();
		
		//Checking and assigning the length of num1 to variable
		len=String.valueOf(num1).length();

		for (int i = 0;i < len; i++)
		{
			//Getting each digit from number
			temp = String.valueOf(num1).charAt(i);
			//Converting digit from char to integer
			numTemp=Character.getNumericValue(temp);
			//Getting value of digit raised to the power of length
			digitTotal=(int) Math.pow(numTemp, len);
			//Adding total of each digit raised to the power of length
			finalTotal=finalTotal+digitTotal;
		}
		
		//Checking if number is Armstrong number
		if (num1 == finalTotal)
		{
			System.out.println("Number "+num1+" is an Armstrong number");
		}
		else
		{
			System.out.println("Number "+num1+" is not an Armstrong number");
		}
		obj.close();		
	}	
}
