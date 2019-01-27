package acm2018;

import java.util.Arrays;
import java.util.Scanner;

public class hdu1213
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			for(int a=0;a<n;a++)
			{
				int count=0;
				int q=s.nextInt();
				int w=s.nextInt();
				int[] arr=new int[q];
				Arrays.fill(arr,0);
				for(int b=0;b<w;b++)
				{
					int temp1=s.nextInt();
					int temp2=s.nextInt();
					if((arr[temp1-1]==0&&arr[temp2-1]!=0)||arr[temp1-1]!=0&&arr[temp2-1]==0)
					{
						arr[temp1-1]=Math.max(arr[temp1-1],arr[temp2-1]);
						arr[temp2-1]=Math.max(arr[temp1-1],arr[temp2-1]);
					}else if(arr[temp1-1]==0&&arr[temp2-1]==0)
					{
						count++;
						arr[temp1-1]=b+1;
						arr[temp2-1]=b+1;
					}else if(arr[temp1-1]!=0&&arr[temp2-1]!=0&&arr[temp1-1]!=arr[temp2-1])
					{
						count--;
						int temp=arr[temp1-1];
						int tempq=arr[temp2-1];
						for(int c=0;c<arr.length;c++)
						{
							if(arr[c]==tempq)
							{
								arr[c]=temp;
							}
						}
					}
				}
				for(int b=0;b<q;b++)
				{
					if(arr[b]==0)
					{
						count++;
					}
				}
				System.out.println(count);
			}
		}
	}

}
