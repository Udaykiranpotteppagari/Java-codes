// Java program to check the entered number is Armstrong number or not.
import java.util.*;
public class Armstrong
{
	public static void main(String[] args) 
	{
		int num, originalnum, sum, rem, n; 
        	Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number:");
        	num = reader.nextInt();
		originalnum = num;
        	sum = 0;
        	n = 0;
        	while (originalnum != 0) 
		{
            		originalnum /= 10;
            		++n;
        	}
		originalnum = num;
		while (originalnum != 0) 
		{
            		rem = originalnum % 10;
			int power = 1;
            		for (int i = 1; i <= n; i++) 
			{
                		power *= rem;
            		}
			sum += power;
			originalnum /= 10;
		}
		if (sum == num) 
		{
            		System.out.println(num + " is an Armstrong number.");
        	} 
		else 
		{
            		System.out.println(num + " is not an Armstrong number.");
        	}
    	}
}
