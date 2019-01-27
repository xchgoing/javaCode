package acm2018;

import java.util.Scanner;

public class zoj2091
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			int[] arr=new int[n];
			for(int a=0;a<n;a++)
			{
				arr[a]=s.nextInt();
			}
			double max=-99999;
			double sum=0;
			for(int a=n-1;a>=0;a--)
			{
				sum+=arr[a];
				double temp=sum/(n-a);
//				System.out.println(temp+"="+sum+"/"+(n-a));
				if(temp>max)
				{
					max=temp;
				}
			}
			System.out.println(String.format("%.6f",max));
		}
	}

}
