package ÌìÌÝ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tl2t1
{

	static int[] arr;
	public static void main(String[] args)
	{
		List<people> list=new ArrayList<>();
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			list.clear();
			double sum=0;
			int n=s.nextInt();
			double z=s.nextDouble();
			double r=s.nextDouble();
			arr=new int[n];
			for(int a=0;a<n;a++)
			{
				int m=s.nextInt();
				if(m!=0)
				{
					while(m-->0)
					{
						int temp=s.nextInt();
						arr[temp]=a;
					}
				}else
				{
					list.add(new people(s.nextInt(),a));
				}
			}
			for(int a=0;a<list.size();a++)
			{
				people temp=list.get(a);
				int pow=cheak(temp.teacher);
			}
			System.out.println((int)sum);
		}
	}
	public static int cheak(int q)
	{
		int r=1;
		if(q!=0)
		{
			while(true)
			{
				if(arr[q]==0)
				{
					break;
				}else
				{
					q=arr[q];
					r++;
				}
			}
		}
		return r;
	}
}
class people
{
	int beishu;
	int teacher;
	public people(int beishu,int teacher)
	{
		this.beishu=beishu;
		this.teacher=teacher;
	}
}
