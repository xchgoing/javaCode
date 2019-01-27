package acm2018;

import java.util.Arrays;
import java.util.Scanner;

public class hdu4055
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextLong())
		{
			int n=s.nextInt();
			for(int a=0;a<n;a++)
			{
				long m=s.nextLong();
				if(m==1)
				{
					System.out.println(s.next());
					continue;
				}
				long[] arr=new long[(int)m];
				long end=1;
				int countf=0;
				int count0=0;
				boolean chose=false;
				for(int b=0;b<m;b++)
				{
					arr[b]=s.nextLong();
					if(arr[b]>0)
					{
						end*=arr[b];
						chose=true;
					}else if(arr[b]<0)
					{
						countf++;
					}else
					{
						count0++;
					}
				}
				Arrays.sort(arr);
				if(countf%2==1)
				{
					for(int b=0;b<countf-1;b++)
					{
						end*=arr[b];
					}
				}
				if(m==2&&count0!=0)end=Math.max(arr[0],arr[1]);
				if(count0==m)
				{
					end=0;
				}
				System.out.println(end);
			}
		}
	}

}