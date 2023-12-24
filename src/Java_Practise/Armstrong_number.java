package Java_Practise;

import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) 
	{
		int num , digits=0 , temp , sum=0 , rem;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number:");
		num = in.nextInt();
		//to find number of digits
		temp=num;
		while(temp !=0)
		{
		digits++;
		num = num/10;
		}
		//temp = num;
		while(temp !=0)
		{
		rem= temp%10;
		sum = sum + power(rem,digits);
		temp=temp/10;
	    }

		if(sum==num)
			System.out.println(num+"The number is an armstrong number");
		else
			System.out.println(num+"The number is not an armstrong number");
	}
	static  int  power(int n , int r)
	{
		int i , p=1;
		for(i=1;i<=r;i++)
			p=p*n;
		return p;
	}
}

