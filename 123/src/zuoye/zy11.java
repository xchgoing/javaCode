package zuoye;

import java.util.Scanner;
public class zy11
{
	public static void main(String[] args)
	{
		System.out.println("请输入你要求的最后那一项");
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			System.out.println(1);
			System.out.println(1);
			long a=1;
			long b=1;
			for(int i=0;i<n-2;i++)
			{
				System.out.println(a+b);
				b=a+b;
				a=b-a;
			}
			for(int i=1;i<=n;i++)
			{
				System.out.println(fbnq(i));
			}
		}
	}
	public static long fbnq(int n)
	{
		long sum=0;
		if(n==1||n==2)sum=1;
		else
		{
			sum=fbnq(n-1)+fbnq(n-2);
		}
		return sum;
	}
}
