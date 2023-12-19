// Java program to add two complex numbers
import java.util.*;
public class Addcomplex
{
	public static void main(String args [])
	{
		double real1, imag1, real2, imag2, sumreal, sumimag;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the value of first real number");
		real1 = reader.nextDouble();	
		System.out.println("Enter the value of first imag number");
		imag1 = reader.nextDouble();
		System.out.println("Enter the value of second real number");
		real2 = reader.nextDouble();
		System.out.println("Enter the value of second imag number");
		imag2 = reader.nextDouble();
		sumreal = real1 + real2;
		sumimag = imag1 + imag2;
		System.out.println("\nThe sum of entered numbers is " + sumreal + " + " + sumimag + " i ");
	}
}