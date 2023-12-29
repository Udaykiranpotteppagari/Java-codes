// Java program to check entered number is neon number or not
import java.util.*;
public class Neonnumber 
{
	public static void main(String[] args) 
	{
		int num, square, sum;
       		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number:");
       		num = reader.nextInt();
		square = num * num;
		sum = 0;
       		while (square != 0) 
		{
           		int digit = square % 10;
           		sum += digit;        
           		square /= 10;     
       		}
		if (sum == num) 	
		{
           		System.out.println(num + " is a Neon Number.");
       		} 
		else 	
		{
           		System.out.println(num + " is not a Neon Number.");
       		}
   	}
}
