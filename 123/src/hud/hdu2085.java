package hud;

import java.util.Scanner;

public class hdu2085
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			if(n==-1)break;
			if(n==0)
			{
				System.out.println(1+", "+0);
			}else
			{
				long[][] arr=new long[2][n];
				arr[0][0]=3;
				arr[1][0]=1;
				for(int a=1;a<n;a++)
				{
					arr[0][a]=arr[0][a-1]*3+arr[1][a-1]*2;
					arr[1][a]=arr[0][a-1]+arr[1][a-1];
				}
				System.out.println(arr[0][n-1]+", "+arr[1][n-1]);
			}
		}
	}

}
