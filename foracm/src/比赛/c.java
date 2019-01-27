package ±ÈÈü;

import java.util.Arrays;
import java.util.Scanner;

public class c
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			while(n-->0)
			{
				
				int q=s.nextInt();
				int[] arr=new int[q+1];
				Arrays.fill(arr, 1);
				for(int a=1;a<=q;a++)
				{
					for(int b=a;b<q+1;b++)
					{
						if(b%a==0)
						{
							arr[b]=0-arr[b];
						}
					}
				}
				int count=0;
				for(int a=1;a<q+1;a++)
				{
					if(arr[a]==-1)count++;
				}
				System.out.println(count);
			}
		}
	}

}
