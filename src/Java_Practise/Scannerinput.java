package Java_Practise;

import java.util.Scanner;

public class Scannerinput {

	public static void main(String[] args)
	{
		int a;
		float b;
		String text;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a integer number: \t");
		a= in.nextInt();
		
		System.out.println("You entered int: \t"+a);
		System.out.println("Enter a float number : \t");
		b =in.nextFloat();
		System.out.println("You entered float: \t"+b);
		System.out.println("Enter a string : \t");
		text= in.next();
		System.out.println("You entered string: \t"+text);
		

	}

}
