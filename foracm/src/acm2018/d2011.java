package acm2018;

import java.util.Arrays;
import java.util.Scanner;

public class d2011
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			for(int i=0;i<n;i++)
			{
			long input=s.nextLong();
			System.out.println(answer(input));
			}
		}
		
	}
	public static long answer(long input)
	{
		if(input==1)
		{
			return 1;
		}else if(input==2)
		{
			return 2;
		}else
		{
			return 1+answer(input/2);
		}
	}

}
