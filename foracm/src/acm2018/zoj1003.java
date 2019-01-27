package acm2018;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class zoj1003
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int a=s.nextInt();
			int b=s.nextInt();
			if(a<b)
			{
				a+=b;
				b=a-b;
				a=a-b;
			}//a大b小
			if(a<101&&b<101&&a>0&&b>0)
			{
				System.out.println(a);
				continue;
			}
			if(!(ok(a)&&ok(b))||!ok(b))
			{
				System.out.println(a);
				continue;
			}else if(!ok(a))
			{
				System.out.println(b);
				continue;
			}else
			{
				int temp=qwe(a,b);
//				System.err.println(temp);
				if(isp(temp))
				{
					System.out.println(b);
					continue;
				}else
				{
					System.out.println(a);
				}
			}
		}
	}
	public static boolean isp(int q)//是否是素数
	{
		for(int a=2;a<Math.sqrt(q);a++)
		{
			if(q%a==0)return false;
		}
		return true;
	}
	public static int qwe(int a,int b)//求最大公约数
	{
		int temp=-1;
		while(true)
		{
			temp=a%b;
			if(temp==0)break;
			a=b;
			b=temp;
		}
		return b;
	}
	public static boolean ok(int q)
	{
		int temp=100;
		while(true)
		{
			if(q%temp==0)
			{
				q/=temp;
			}
			temp--;
			if(q==1)return true;
			if(temp==1)return false;
		}
	}

}
