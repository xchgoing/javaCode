package acm2018;

import java.util.Scanner;

public class hdu1076
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			for(int a=0;a<n;a++)
			{
				int now=s.nextInt();
				int count=s.nextInt();
				while(true)
				{
					if((now%4==0&&now%100!=0)||now%400==0)
					{
						count--;
					}
					if(count==0)break;
					now++;
				}
				System.out.println(now);
			}
		}
	}
}
