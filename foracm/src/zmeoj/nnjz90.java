package zmeoj;

import java.util.Scanner;

public class nnjz90
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
			for(int b=0;b<n;b++)
			{
				for(int a=n-1;a>=0;a--)
				{
					System.out.print(arr[a][b]);
					if(a!=0)System.out.print(" ");
					else System.out.println();
				}
			}
			System.out.println();
		}

	}

}
