package Java_Practise;

import java.util.Scanner;

public class Subtract_matrix {

	public static void main(String[] args) 
	{
		int m,n,i,j;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter rows and columns of matrix:");
		m=in.nextInt();
		n=in.nextInt();
		
		int first[][]=new int[m][n];
		int second[][]=new int[m][n];
		int sub[][]=new int[m][n];
		
		System.out.println("Enter the contents of first matrix");
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				first[i][j]=in.nextInt();
		
		System.out.println("Enter the contents of second matrix");
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				second[i][j]=in.nextInt();
		
		
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				sub[i][j]=first[i][j]-second[i][j];
		
		System.out.println("The contents of result matrix");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(sub[i][j]+" ");
			}
				System.out.println();
		}
		
		
	}

}
