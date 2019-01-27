package ÌìÌÝ;

import java.util.Scanner;

public class t7t5
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int q=s.nextInt();
			long An=0;
			long temp=1;
			for(int a=1;a<=q;a++)
			{
				temp*=a;
				An+=temp;
			}
			System.out.println(An);
		}
	}

}
