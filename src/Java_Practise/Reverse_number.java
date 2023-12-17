package Java_Practise;

import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args)
	{
		int num,rev=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number :");
		num= in.nextInt();
		while(num !=0)
		{
			rev =( rev *10) +(num %10);
			num=num / 10;
		}
		System.out.println("The reverse of the num is :\t"+rev);
	}

}
