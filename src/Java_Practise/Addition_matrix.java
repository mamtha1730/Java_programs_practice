package Java_Practise;

import java.util.Scanner;

public class Addition_matrix {

	public static void main(String[] args)
	{
		int m ,n,c,d;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows and column of the matrix:");
		m=in.nextInt();
		n=in.nextInt();
		int first[][]=new int[m][n];
		int second[][]=new int[m][n];
		int sum[][]=new int[m][n];
		
		System.out.println("Enter the elements of first matrix: ");
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				first[i][j]=in.nextInt();
		System.out.println("Enter the elements of second matrix:");		
	    for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				second[i][j]=in.nextInt();
				
				for(int i=0;i<m;i++)
					for(int j=0;j<n;j++)
						sum[i][j]=first[i][j]+second[i][j];
				System.out.println("The sum of two matrix are:");
				for(int i=0;i<m;i++)
				{
					for(int j=0;j<n;j++)
					{
						System.out.print(sum[i][j]+" ");
					}
						System.out.println();
					}
	
			
			
				
	}

}
