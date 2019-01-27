package ������;

import java.util.Arrays;
import java.util.Scanner;

public class D
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		long timeall=0;
		p[] ps=new p[n];
		long pl=0;
		for(int a=0;a<n;a++)
		{
			ps[a]=new p(s.nextInt(),s.nextInt());
			timeall+=ps[a].time;
			pl+=ps[a].tire;
		}
		for(int a=0;a<n;a++)
		{
			ps[a].delect=(timeall-ps[a].time)*ps[a].tire;
		}
		Arrays.sort(ps,(a,b)->(a.delect==b.delect?b.tire-a.tire:b.delect-a.delect)<0?-1:1);
		
		long min=0;
		int i=0;
		int o=0;
		long sum=0;
		for(int a=0;a<n;a++)
		{
			min=Long.MIN_VALUE;
			pl-=ps[a].tire;
			sum+=pl*ps[a].time;
			o=i;
//			System.out.println(sum);
			timeall-=ps[a].time;
			for(int b=0;b<n;b++)
			{
				if(ps[b].delect!=-1)
				{
					if(b==o)ps[b].delect=-1;
					else {
						ps[b].delect=(timeall-ps[b].time)*ps[b].tire;
						if(ps[b].delect>min)
						{
							min=ps[b].delect;
							i=b;
						}else if(ps[b].delect==min)
						{
							if(ps[b].tire>ps[i].tire)
								i=b;
						}
					}
				}
			}
			print(ps);
		}
		System.out.println(sum);
		
	}
	
	public static void print(p[] ps)
	{
		for(int a=0;a<ps.length;a++)
		{
			System.out.print(ps[a].delect+" ");
		}
		System.out.println();
	}

	
}
class p
{
	long time;
	long tire;
	long delect;
	p(long q,long b)
	{
		time=q;
		tire=b;
	}
} 
