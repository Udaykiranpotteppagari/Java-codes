// Java program to find the greatest of three numbers using if else.
import java.util.*;
public class Greatestofthree
{
	public static void main(String args [])
	{
		int a,b,c;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the first number");
		a = reader.nextInt();
		System.out.println("Enter the second number");
		b = reader.nextInt();
		System.out.println("Enter the third number");
		c = reader.nextInt();
		if ( a > b && a > c )
		{
			System.out.println( a + " is the greatest among three entered numbers.");
		}
		else if ( b > a && b > c )
		{
			System.out.println( b + " is the gretest among three entered numbers.");
		}
		else
		{
			System.out.println( c + " is the greatest among three entered numbers.");
		}
	}
}

