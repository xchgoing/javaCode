package acm2018;

import java.util.Scanner;

public class qiandao1zoj
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			for(int a=0;a<n;a++)
			{
				String q=s.next();
				String w=s.next();
				for(int b=0;b<w.length();b++)
				{
					String temp=w.substring(b, b+1);
					if(b==0)System.out.print(temp.toUpperCase());
					else System.out.print(temp);
				}
				System.out.println(q);
			}
		}
	}

}
