package zuoye;

import java.util.Scanner;
public class z112310
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("请输入你要求的阶乘和的最后一个");
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			int sum=0;
			int temp=1;
			for(int a=1;a<=n;a++)
			{
				temp=temp*a;
				sum=sum+temp;
			}
			System.out.println(sum);
			System.out.println(jcdigui(n));
			jcarr(n);
			xunhuanD(n);
		}
	}
	public static void jcarr(int n)
	{
		int arr[]=new int[n];
		for(int a=0;a<n;a++)
		{
			arr[a]=a+1;
			if(a>0)
			{
				arr[a]=arr[a]*arr[a-1];
			}
		}
		for(int a=1;a<n;a++)
		{
			arr[a]=arr[a]+arr[a-1];
		}
		System.out.println(arr[n-1]);
	}
	public static int jcdigui(int n)
	{
		if(n==1)return 1;
		int sum=0;
		int j=1;
		for(int a=1;a<=n;a++)
		{
			j=j*a;
		}
		sum=sum+j+jcdigui(n-1);
		return sum;
	}
	public static void xunhuanD(int n)
	{
		int sum=0;//感觉两层循环和递归思路差不多
		for(int a=1;a<=n;a++)
		{
			int j=1;
			for(int b=1;b<=a;b++)
			{
				j=j*b;
			}
			sum+=j;
		}
		System.out.println(sum);
	}
}

