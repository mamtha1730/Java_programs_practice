package Java_Practise;

import java.util.Scanner;

public class Largest_three_numbers {

	public static void main(String[] args)
	{
		int a , b , c;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first number:");
		a=in.nextInt();
		System.out.println("Enter the second number:");
		b=in.nextInt();
		System.out.println("Enter the third number:");
		c=in.nextInt();
		
		if(a>b && a>c)
			System.out.println("The largest number is a:"+a);
		else if(b>c && b>a)
			System.out.println("The largest number is b:"+b);
		else if(c>a && c>b)
			System.out.println("The largest number is c:"+c);
		

	}

}
