package 赛后;

import java.util.Scanner;

public class 牛客练习赛19E
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			int[][] arr=new int[n][2];
			for(int a=0;a<n;a++)
			{
				arr[a][0]=s.nextInt();
				arr[a][1]=s.nextInt();
			}
			int count=n;
			for(int a=0;a<n;a++)
			{
				int temp=arr[a][0];
				for(int b=0;b<n;b++)
				{
					if(b==a)continue;
					if(arr[b][1]==temp)
					{
						count--;
						break;
					}
				}
			}
			System.out.println(count);
		}
	}
}
