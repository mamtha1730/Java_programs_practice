package Java_Practise;

import java.util.Scanner;

public class Odd_even {

	public static void main(String[] args)
	{
		int a;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first number:");
		a=in.nextInt();
		if(a%2 == 0)
			System.out.println("The number is even number");
		else
			System.out.println("The number is odd");
		
	}

}
