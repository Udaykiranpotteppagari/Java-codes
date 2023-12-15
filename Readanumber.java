// Java program to take an integer as a input and print output
import java.util.*;
public class Readanumber
{
	public static void main(String[] args)
        {
         	Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = reader.nextInt(); 
		System.out.println("Entered number is "+num);
	}
}
