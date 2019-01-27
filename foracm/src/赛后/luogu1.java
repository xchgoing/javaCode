package Èüºó;

import java.util.Scanner;

public class luogu1
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			int[] arr=new int[n+1];
			arr[0]=0;
			long sum=0;
			for(int a=1;a<=n;a++)
			{
				arr[a]=s.nextInt();
				sum+=arr[a];
			}
			if(sum%2==0)
			{
				System.out.println("Bob");
			}else
			{
				System.out.println("Alice");
			}
		}
	}
}
