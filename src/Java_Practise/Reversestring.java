package Java_Practise;

import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) 
	{
	   String original,rev="";
	   Scanner in = new Scanner(System.in);
	   System.out.println("Enter the given string :");
	   original = in.nextLine();
	   int len = original.length();
	   for(int i=len-1;i>=0;i--)
	   {
		   rev = rev+original.charAt(i);
	   }
	   System.out.println("The reverse of the given string is: "+rev);

	}

}
