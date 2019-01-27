package acm2018;

import java.util.Scanner;

public class c2011
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			for(int a=0;a<n;a++)
			{
				int m=s.nextInt();
				String temp=s.next();
				String[] arr=new String[m];
				int i=-1;
				for(int b=0;b<m;b++)
				{
					arr[b]=s.next();
					if(arr[b].equals(temp))i=b;
				}
				System.out.println(arr[(i+(m/2))%m]);
			}
		}
	}
}
