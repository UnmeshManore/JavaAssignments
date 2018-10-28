/**
 * @author Unmesh Manore
 * Program - Find biggest/smallest number among 3 numbers
 */
import java.util.*;
public class Program1
{
	//Main method
	public static void main(String args[])
	{
		//Declaring variables
		int num1,num2,num3,maxValue;
		
		//Creating scanner object for accepting user inputs
		Scanner obj = new Scanner(System.in);
		
		//Accepting first integer input
		System.out.println("Enter value of first number : ");
		num1=obj.nextInt();
		
		//Accepting second integer input
		System.out.println("Enter value of second number : ");
		num2=obj.nextInt();
		
		//Accepting third integer input
		System.out.println("Enter value of third number : ");
		num3=obj.nextInt();
		
		//Checking the max value of the 3 user inputs and assigning to maxValue variable
		maxValue=(num1>num2)?num1:num2;
		maxValue=(maxValue>num3)?maxValue:num3;
		
		//Displaying biggest number of the 3 input numbers
		System.out.println("Biggest number among the 3 input numbers is : "+maxValue);
		obj.close();
	}
}