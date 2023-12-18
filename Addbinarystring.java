import java.util.*;
public class Addbinarystring
{
	public static void main(String args [])
	{
		String a, b, result;
		int num1, num2, sum;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the first binary value");
		a = reader.nextLine();
		System.out.println("Enter the second binary value");
		b = reader.nextLine();
		num1 = Integer.parseInt(a, 2);
		num2 = Integer.parseInt(b, 2);
		sum = num1 + num2;
		result = Integer.toBinaryString(sum);
		System.out.println("The binary addition of " + a + " and " + b + " is " + result);
	}
}