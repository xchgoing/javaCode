package acm2018;

import java.util.Arrays;
import java.util.Scanner;

public class zoj3008
{

	static long[] sushu=new long[101];
	static int[] cishu=new int[101];
	static int c=0;
	static long e;
	static int count=0;
	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			count=0;
			Arrays.fill(sushu, 0);
			Arrays.fill(cishu, 0);
			c=0;
			e=s.nextLong();
			long q=e;
			int w=s.nextInt();
			for(int a=2;a*a<=q;a++)
			{
				if(q%a==0)
				{
					sushu[c]=a;
					while(true)
					{
						q/=a;
						cishu[c]++;
						if(q%a!=0)
						{
							break;
						}
					}
					cishu[c]*=w;
					c++;
				}
			}
			if(q!=1)
			{
				sushu[c]=q;
				cishu[c]=w;
			}
			dfs(0,1);
			System.out.println(count);
		}
	}
	public static void dfs(int deep,long sum)
	{
		if(deep>=c+1)
		{
			count++;
			return;
		}
		for(int a=0;a<=cishu[deep];a++)
		{
			if(a!=0)
			{
				sum*=sushu[deep];
			}
			if(sum>e)break;
			dfs(deep+1,sum);
		}
		return;
	}
}
