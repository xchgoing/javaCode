package ������;

import java.util.Arrays;
import java.util.Scanner;

public class A
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		long pl=0;
		p[] ps=new p[n];
		for(int a=0;a<n;a++)
		{
			ps[a]=new p(s.nextInt(),s.nextInt());
			pl+=ps[a].tire;
		}
		for(int a=0;a<n;a++)
		{
			ps[a].need=(pl-ps[a].tire)*ps[a].time;
		}
		Arrays.sort(ps,(a,b)->(a.need==b.need?b.tire-a.tire:a.need-b.need)<0?-1:1);
		long min=Long.MAX_VALUE;
		long sum=0;
		int i=0;
		int o=0;
		for(int a=0;a<n;a++)
		{
			min=Long.MAX_VALUE;
			sum+=ps[i].need;
			o=i;
			for(int b=0;b<n;b++)
			{
				if(ps[b].need!=-1)
				if(b==o)ps[b].need=-1;
				else {
					ps[b].need-=ps[o].tire*ps[b].time;
					if(ps[b].need<min){
						min=ps[b].need;
						i=b;
					}else if(ps[b].need==min)
					{
						if(ps[i].tire<ps[b].tire)
						{
							min=ps[b].tire;
							i=b;
						}else if(ps[i].tire==ps[b].tire)
						{
							if(ps[i].time>ps[n].time)
								i=b;
						}
					}
				}
			}
		}

		System.out.println(sum);
	}
	
//	public static void print(p[] arr)
//	{
//		for(int a=0;a<arr.length;a++)
//		{
//			System.out.print(arr[a].need+" ");
//		}
//		System.out.println();
//	}

}
//class p
//{
//	long time;
//	long tire;
//	long need;
//	p(long q,long b)
//	{
//		time=q;
//		tire=b;
//	}
//}
