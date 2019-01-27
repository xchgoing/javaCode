package acm2018;

import java.util.Scanner;

public class zoj1337
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int count=0;
		while(s.hasNextInt())
		{
			count=0;
			int n=s.nextInt();
			if(n==0)break;
			int[] arr=new int[n];
			for(int a=0;a<n;a++)
			{
				arr[a]=s.nextInt();
			}
			double temp=n*(n-1)/2;
			for(int a=0;a<n-1;a++)
			{
				for(int b=a+1;b<n;b++)
				{
					if(qwe(arr[a],arr[b])==1)
					{
						count++;
					}
				}
			}
			if(count==0)
			{
				System.out.println("No estimate for this data set.");
			}else
			{
				System.out.println(String.format("%.6f",Math.sqrt(temp*6/count)));
			}
		}
	}
	public static int qwe(int n,int m)
	{
		int a=Math.max(n, m);
		int b=Math.min(m, n);
		int temp=0;
		while(a%b!=0)
		{
			a=a%b;
			temp=a;
			a=b;
			b=temp;
//			System.out.println(a+" "+b);
		}
		return b;
	}
}
