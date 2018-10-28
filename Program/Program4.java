/**
 * @author Unmesh Manore
 * Program - Print the mathematical tables from 1 to 10
 */
public class Program4 
{
	//Main method
	public static void main(String args[])
	{
		//Declaring variables
		int i;
		
		//Initializing for loops for printing mathematical tables from 1 to 10
		for(i = 1;i < 11; i++ )
		{
			System.out.println("Printing mathematical table of "+i);
			for (int j=1;j < 11;j++)
			{
				System.out.println(i+" * "+j+" = "+(i*j));
			}
			System.out.println("--------------------------");
		}
	}
}
