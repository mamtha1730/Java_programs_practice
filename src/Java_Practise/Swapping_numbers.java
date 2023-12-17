package Java_Practise;

import java.util.Scanner;

public class Swapping_numbers {

	public static void main(String[] args)
	{
		int temp , a=10 , b=99;
		Scanner sc = new Scanner(System.in);
		System.out.println("Using third variable-Swapping");
		System.out.println("-----------------------------");
		System.out.println("Before Swapping: a="+a+"\tb="+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping  : a="+a+"\tb="+b);
		
		System.out.println("Swapping without third variable");
		System.out.println("-------------------------------");
		int x=12, y=56;
		System.out.println("Before Swapping : X="+x+"\tY="+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After Swapping : X="+x+"\tY="+y);
	}

}
