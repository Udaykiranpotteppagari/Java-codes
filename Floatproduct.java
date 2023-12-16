// Java program to print multiplication of two floating point numbers
import java.util.*;
public class Floatproduct
{
	public static void main(String args [])
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter first number");
		float num1 = reader.nextFloat();
		System.out.println("Enter second number");
		float num2 = reader.nextFloat();
		float product = num1*num2;
		System.out.println("Product of " + num1 +" and " + num2 +" is " + product);
	}
}
		