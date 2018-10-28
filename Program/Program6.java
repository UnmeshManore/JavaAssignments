/**
 * @author Unmesh Manore
 * Program - Print the prime numbers between 2 to 100
 */
public class Program6 
{
	public static void main(String args[]) 
	{
		//Declaring variables
		boolean prime=true;
		
		//Initializing loop to cycle number from 2 to 100
		for (int j = 2;j < 101; j++)
		{
			//Initializing value of prime variable to true after every iteration of j 
			prime=true;
			//Initializing for loop to check if given number is a prime number
			for (int i=2; i < j; i++)
			{
				if ((j%i) == 0)
				{
					System.out.println("Number "+j+" is not a prime number");
					prime=false;
					break;				
				}
			}
			if (prime == true)
			{
				System.out.println("Number "+j+" is a prime number");
			}
		}
	}
}
