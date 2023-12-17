package Java_Practise;

import java.util.Scanner;

public class Fah_to_celcius {

	public static void main(String[] args)
	{
		int fah , celcius;
		System.out.println("Enter the Fahrenheit temperature : \t");
		Scanner in =new Scanner(System.in);
		fah=in.nextInt();
		celcius=(fah - 32)*5/9;
		System.out.println("The converted celcius temperature is "+celcius);
		

	}

}
