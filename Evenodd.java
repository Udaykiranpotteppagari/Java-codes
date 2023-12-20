// Java program to check the entered integer number is odd or even.
import java.io.*;
import java.util.*;
public class Evenodd
{
	public static void main(String args [])
	{
		int num;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the integer number");
		num = reader.nextInt();
		if ( num % 2 == 0 )
		{
			System.out.println("Entered integer number " + num + " is EVEN");
		}
		else
		{
			System.out.println("Entered integer number " + num + " is ODD");
		}
	}
}