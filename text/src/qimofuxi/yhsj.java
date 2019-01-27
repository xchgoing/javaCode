package qimofuxi;

import java.util.Scanner;

public class yhsj
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int q=s.nextInt();
			int[][] arr=new int[q][];
			for(int a=0;a<q;a++)
			{
				arr[a]=new int[a+1];
				for(int b=0;b<arr[a].length;b++)
				{
					if(b==0||b==arr[a].length-1)
					{
						arr[a][b]=1;
					}
					else
					{
						arr[a][b]=arr[a-1][b-1]+arr[a-1][b];
					}
					System.out.print(arr[a][b]+" ");
				}
				System.out.println();
			}
		}
	}
}
