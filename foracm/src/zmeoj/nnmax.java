package zmeoj;

import java.util.Scanner;

public class nnmax
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
				int max=Integer.MIN_VALUE;
				int min=Integer.MAX_VALUE;
				for(int b=0;b<n;b++)
				{
					arr[a][b]=s.nextInt();
					if(arr[a][b]<min)
					{
						min=arr[a][b];
					}
					if(arr[a][b]>max)
					{
						max=arr[a][b];
					}
				}
				System.out.println("row "+(a+1)+" max "+max+" min "+min);
			}
			System.out.println();
			
			
		}

	}

}
