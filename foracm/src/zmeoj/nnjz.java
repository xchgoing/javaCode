package zmeoj;

import java.util.Scanner;

public class nnjz
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			int[][] arr=new int[n][n];
			for(int a=0;a<n;a++)
			{
				for(int b=0;b<n;b++)
				{
					arr[a][b]=s.nextInt();
				}
			}
			for(int b=0;b<n-1;b++)
			{
				for(int a=b+1;a<n;a++)
				{
					int temp=arr[a][b];
					arr[a][b]=arr[b][a];
					arr[b][a]=temp;
				}
			}
			for(int a=0;a<n;a++)
			{
				for(int b=0;b<n;b++)
				{
					System.out.print(arr[a][b]);
					if(b!=n-1)System.out.print(" ");
					else System.out.println();
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
