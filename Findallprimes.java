// Java program to find GCD of two numbers.
import java.util.*;
public class Findallprimes
{
	public static void main(String[] args) 
		{
			int num, i, j;
			Scanner reader = new Scanner(System.in);
			System.out.println("Enter the number: ");
        		num = reader.nextInt();
			reader.close();
			System.out.println("Prime numbers from 1 to " + num + " are : ");
			for ( i = 2; i <= num; i++ )
			{
				boolean isprime = true;
				for ( j = 2; j * j <= num; j++ )
				{
					if ( i % j == 0 )
					{
						isprime = false;
						break;
					}
				}
				if ( isprime )
				{
					System.out.print(i + " ");
				}
			}
		}
}
