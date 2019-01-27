package hud;

import java.util.Scanner;

public class hdu2088
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int flag=0;
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			if(n==0)break;
			int sum=0;
			int[] arr=new int[n];
			for(int a=0;a<n;a++)
			{
				arr[a]=s.nextInt();
				sum+=arr[a];
			}
			sum=sum/n;
			int q=0;
			for(int a=0;a<n;a++)
			{
				if(arr[a]<sum)
				{
					q+=(sum-arr[a]);
				}
			}
			if(flag!=0)System.out.println();
			flag++;
			System.out.println(q);
		}
				
	}

}
