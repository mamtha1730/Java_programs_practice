package Java_Practise;

import java.util.Scanner;

public class Sub_string_calc {

	public static void main(String[] args)
	{
				String original,sub="";
				Scanner in = new Scanner(System.in);
				System.out.println("Enter the given string :");
				original =in.nextLine();
				int len=original.length();
				for(int i=0;i<len;i++)
				{
					for(int j=1;j<=len-i;j++)
					{
						sub=original.substring(i,i+j);
						System.out.println(sub);
					}
				}
			}

		}


