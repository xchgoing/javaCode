package Èüºó;

import java.util.Scanner;

public class hdu1108
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int q=s.nextInt();
			int w=s.nextInt();
			int q1=Math.max(q, w);
			int w1=Math.min(q, w);
			int temp=q1;
			while(true)
			{
				temp=q1%w1;
				if(temp==0)
				{
					break;
				}else
				{
					q1=w1;
					w1=temp;
				}
			}
			System.out.println((q*w)/w1);
		}
	}

}
