package Java_Practise;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		int a, fact=1;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number  :");
		a= in.nextInt();
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println("The factorial calculated is :\t"+fact);

	}

}
