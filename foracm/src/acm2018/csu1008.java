package acm2018;

import java.util.Scanner;

public class csu1008
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			int[] arr=new int[n];
			if(n%2==0)
			{
				for(int a=0;a<n;a+=2)
				{
					arr[a]=s.nextInt();
					arr[a+1]=s.nextInt();
					if(arr[a]!=arr[a+1])
					{
						for(int b=a;b>=0&&arr[b]!=arr[b+1];b--)
						{
							arr[b]=arr[b+1];
						}
					}
				}
			}
			int count=0;
			for(int a=0;a<n;a++)
			{
				if(arr[a]==0)count++;
			}
			System.out.println(count);
		}
	}

}
