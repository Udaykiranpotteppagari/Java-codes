// Java program to swap two numbers
import java.util.*;
public class Swapping
{
	public static void main(String args[])
	{
		int num1, num2, temp;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter first number");
		num1 = reader.nextInt();
		System.out.println("Enter second number");
		num2 = reader.nextInt();
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("Entered first number is " + num2 + " and second number is " + num1);
	}
}