package Java_Practise;

import java.util.Scanner;

public class Floyds_triangle {

	public static void main(String[] args)
	{
		int rows , num=1;
		System.out.println("Enter the number of rows :");
		Scanner in=new Scanner(System.in);
		rows = in.nextInt();
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(num+" ");
				//num=num+2;
			}
			System.out.println();
		}
	}

}
