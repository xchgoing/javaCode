package acm2018;

import java.util.Scanner;

public class zoj2001
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			if(n==0)break;
			for(int a=0;a<n;a++)                       
			{
				int q=reverse(s.next());
				int w=reverse(s.next());
				System.out.println(reverse(String.valueOf(q+w)));
			}
		}
	}
	public static  int reverse(String q)
	{
		StringBuffer w=new StringBuffer(q);
		q=w.reverse().toString();
		return Integer.valueOf(q);
	}
}
