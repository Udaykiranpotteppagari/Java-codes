// Java program to find GCD of two numbers.
import java.util.*;
public class Gcd 
{
	public static void main(String[] args) 
		{
			int a, b, temp, res;
			Scanner reader = new Scanner(System.in);
			System.out.println("Enter the first number: ");
        		a = reader.nextInt();
			System.out.println("Enter the second number: ");
        		b = reader.nextInt();
			reader.close();
			res = findGCD(a, b);
			System.out.println("The GCD of " + a + " and " + b + " is: " + res);
		}
	public static int findGCD(int a, int b) 
	{
        	while (b != 0) 
		{
            		int temp = b;
            		b = a % b;
            		a = temp;
        	}
        	return a;
    	}
}
