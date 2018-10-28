/**
 * @author Unmesh Manore
 * Program - Find biggest/smallest number among 'N' numbers
 */
import java.util.*;
public class Program2 
{
	//Main method
	public static void main(String args[])
	{
		//Variable declaration
		int arrSize,smallestNum,biggestNum;
		
		//Creating scanner object for accepting user inputs
		Scanner obj = new Scanner(System.in);
		
		//Accepting user input for number of inputs to be accepted
		System.out.println("Enter number of integers to be accepted : ");
		arrSize=obj.nextInt();
		
		//Declaring array for storing numbers
		int numberArray[] = new int[arrSize];
		
		System.out.println("Enter the integers to be analyed/stored : ");
		
		//Initializing for loop for accepting and assigning user inputs to array
		for (int i = 0; i < arrSize; i++)
		{
			System.out.println("Enter the value of "+(i+1)+" element : ");
			numberArray[i] = obj.nextInt();
		}
		
		//Initializing value of first element to both variables for further comparison
		smallestNum = biggestNum = numberArray[0];
		
		//Initializing for loop for calculating biggest and smallest number
		for (int i = 0; i < arrSize; i++)
		{
			if (smallestNum > numberArray[i])
			{
				smallestNum = numberArray[i];
			}
			
			if (biggestNum < numberArray[i])
			{
				biggestNum = numberArray[i];
			}

		}
		System.out.println("Smallest number among "+arrSize+" elements is : "+smallestNum);
		System.out.println("Biggest number among "+arrSize+" elements is : "+biggestNum);
		obj.close();
	}
}
