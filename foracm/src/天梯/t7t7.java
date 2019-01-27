package ÌìÌÝ;

import java.util.Scanner;

public class t7t7
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			double q=s.nextInt();
			String w=s.next();
			double e=q%2==0?q/2:q/2+0.5;
			for(int a=0;a<e;a++)
			{
				for(int b=0;b<q;b++)
				{
					System.out.print(w);
				}
				System.out.println();
			}
		}
	}

}
