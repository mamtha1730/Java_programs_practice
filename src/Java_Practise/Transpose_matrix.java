package Java_Practise;

import java.util.Scanner;

public class Transpose_matrix {

	public static void main(String[] args)
	{

		int m , n , i , j;
		Scanner in = new Scanner(System.in);
	
		System.out.println("Enter row and column of matrix: ");
		m=in.nextInt();
		n=in.nextInt();
		
		int first[][]=new int[m][n];
		int trans[][]=new int[m][n];
		
		System.out.println("Enter the matrix contents: ");
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				first[i][j]=in.nextInt();
		
		
		System.out.println("The first matrix contents are:");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(first[i][j]+" ");
			}
		System.out.println();
	}
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
				trans[j][i] = first[i][j];
		}	
		System.out.println("The transpose matrix contents are:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.print(trans[i][j]+" ");
			}
		System.out.println();
	}
	}
}
