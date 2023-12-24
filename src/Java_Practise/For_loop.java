package Java_Practise;

import java.util.Scanner;

public class For_loop {

	public static void main(String[] args)
	{
		char ch;
		Scanner in=new Scanner(System.in);
		for(ch='a';ch<= 'z'; ch++)
		{
			System.out.println(ch);
		}
		
		String names[]= {"sam","mary","betty","lucy"};
		for(String sg: names)
		{
			System.out.println(sg);
		}
		
		int aa[]= { 2,4,99,123};
		for(int i: aa)
		{
			System.out.println(i);
		}

	}

}
