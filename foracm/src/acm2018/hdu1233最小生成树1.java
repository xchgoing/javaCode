package acm2018;

import java.util.Arrays;
import java.util.Scanner;

public class hdu1233最小生成树1
{

	static int[] city;
	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int count=0;
			int dis=0;
			int n=s.nextInt();
			if(n==0)break;
			jl[] arr=new jl[n*(n-1)/2];
			city=new int[n+1];
			for(int a=0;a<n+1;a++)
			{
				city[a]=a;
			}
			for(int a=0;a<arr.length;a++)
			{
				arr[a]=new jl(s.nextInt(),s.nextInt(),s.nextInt());
			}
			Arrays.sort(arr);
			for(int a=0;a<arr.length;a++)
			{
				int temp1=arr[a].a;
				int temp2=arr[a].b;
				if(!pd(temp1,temp2))
				{
					city[search(temp2)]=city[search(temp1)];
					count++;
					dis+=arr[a].dis;
					if(count==n-1)
					{
						break;
					}
				}
			}
			System.out.println(dis);
		}
			
	}
	public static boolean pd(int a,int b)
	{
		if(search(a)==search(b))return true;
		else return false;
	}
	public static int search(int a)
	{
		if(city[a]==a)
		{
			return a;
		}else
		{
			city[a]=search(city[a]);
			return city[a];
		}
	}
}
class jl implements Comparable<jl>
{
	int a;
	int b;
	int dis;
	public jl(int q,int w,int e)
	{
		a=q;
		b=w;
		dis=e;
	}
	public int compareTo(jl o)
	{
		return (this.dis-o.dis);
	}
}