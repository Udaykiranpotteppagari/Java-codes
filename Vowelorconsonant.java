// Java program to check entered character is vowel or consonant.
import java.util.*;
class Vowelconsonant 
{
	public static void main(String[] args) 
	{
        	char ch;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a character:");
        	ch = reader.next().charAt(0);
		reader.close();
		boolean isVowel = false;
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
		ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
		{
            		isVowel = true;
        	}
		if (isVowel) 
		{
            		System.out.println("Entered " + ch + " is a vowel.");
       		} 
		else 
		{
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) 
			{
                		System.out.println("Entered " + ch + " is a consonant.");
            		} 
			else 	
			{
                		System.out.println("Invalid input. Please enter an alphabet.");
            		}
        	}
    	}
}
