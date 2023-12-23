// Java program to find the greatest of three numbers by using ternary operator.
import java.util.*;
public class Biggestofthree
{
	public static void main(String args[])
		{
			int a, b, c, res;
			Scanner reader = new Scanner(System.in);
    			System.out.println("Enter the first number :");
    			a = reader.nextInt();
    			System.out.println("Enter the second number :");
    			b = reader.nextInt();
    			System.out.println("Enter the third number :");
    			c = reader.nextInt();
    			reader.close();
    			res = ( a > b ? ( a > c ? a : c ) : ( b > c ? b : c ));
    			System.out.println("Greatest number among three is " + res);
  		}
}