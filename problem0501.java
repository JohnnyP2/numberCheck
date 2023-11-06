import java.util.Scanner;

// Johnny Pedicone

public class problem0501 
{

	public static void main(String[] args) 
	{   
		
		Scanner key = new Scanner(System.in);
		System.out.println("Enter an int, the input ends if it is zero");
		double total = 0;
		int numOfPositive = 0;
		int numOfNegative = 0;
		int numOfRounds = 0; // The amout of times the user has entered a number
		
		int num = key.nextInt();
		if(num == 0) 
		{
			System.out.println("there is no numbers other than zero");	
		}
		 while(num != 0)
		{
			if(num < 0)
			{
				numOfNegative++;
			}else
			{
				numOfPositive++;
			}
			numOfRounds++; // adds one to the counter of the rounds
			total+= num; // creates a total
			System.out.println("Enter an int, the input ends if it is zero");
			num = key.nextInt();
			
		}
		double avg = avgCalc(total, numOfRounds);
		System.out.println("The number of positives is " + numOfPositive);
		System.out.println("The number of negatives is " + numOfNegative);
		System.out.println("The total is " + total);
		System.out.println("The average is " + avg);

		
	}
	public static double avgCalc(double total, int numOfRounds) // calculates the average
	{
		double average = total / numOfRounds;
		
		
		return average;
	}

}
