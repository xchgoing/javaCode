package acm2018;

import java.util.Scanner;

public class zoj1133
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			if(n==0)break;
			int a=n;
			while(true)
			{
				a++;
				if(isp(a))continue;
				if(sum(a)==chen(a))
				{
					System.out.println(a);
					break;
				}
			}
		}
	}
	public static boolean isp(int a)
	{
		boolean out=true;
		for(int b=2;b<=Math.sqrt(a);b++)
		{
			if(a%b==0)
			{
				out=false;
				break;
			}
		}
		return out;
	}
	public static int sum(int a)
	{
		int sum=0;
		while(a>0)
		{
			sum+=a%10;
			a/=10;
		}
		return sum;
	}
	public static int chen(int a)
	{
		int sum=0;
		int b=2;
		while(b*b<=a)
		{
			if(a%b==0)
			{
				sum+=sum(b);
				a/=b;
				b--;
			}
			b++;
		}
			sum+=sum(a);
		return sum;
	}
}