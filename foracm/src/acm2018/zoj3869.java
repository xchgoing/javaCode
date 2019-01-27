package acm2018;

import java.util.Arrays;
import java.util.Scanner;

public class zoj3869
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			for(int a=0;a<n;a++)
			{
				int[] arr=new int[1001];
				int m=s.nextInt();
				int count=0;
				int ace=0;
				for(int b=0;b<m;b++)
				{
					int temp=s.nextInt();
					arr[temp]++;
					if(arr[temp]>count)
					{
						ace=temp;
						count=arr[temp];
					}
				}
				Arrays.sort(arr);
				if(arr[1000]==arr[999])
				{
					System.out.println("Nobody");
				}else
				{
					System.out.println(ace);
				}
			}
		}
	}

}
