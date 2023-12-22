// Java Program to find the LCM of two numbers
import java.util.*;
public class Lcm 
{
	public static void main(String[] args)
	{
		int a, b, res;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the first number");
		a = reader.nextInt();
		System.out.println("Enter the second number");
		b = reader.nextInt();
		res = (a > b) ? a : b;
		while (true) 
		{
			if (res % a == 0 && res % b == 0)
			{
				break;
			}
			res++;
		}
		System.out.println("LCM of " + a + " and " + b
						+ " is " + res);
	}
}
