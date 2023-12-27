// Java program to check entered year is leap year or not.
import java.util.*;
public class Leapyear
{
	public static void main(String args[])
	{
		int year;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the Year :");
		year = reader.nextInt();
		reader.close();
		if (year % 400 == 0)
		{
			System.out.println("Entered year " + year + " is a Leap Year.");
		}
		else if (year %4 == 0 && year %100 != 0)
		{
			System.out.println("Entered year " + year + " is a Leap Year");
		}
		else
		{
			System.out.println("Entered year " + year + " is not a Leap Year.");
		}
	}
	
}