package acm2018;

import java.util.Scanner;

public class c2012
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			for(int i=0;i<n;i++)
			{
				int a=s.nextInt();
				int m=s.nextInt();
				if(a==1||m==1)                     //当a或m为1时x==0此时不符合是题目要求的正数
				{                                  //当a或m为1时直接输出1并continue
					System.out.println(1);
					continue;
				}
				int x=0;                          
				for(int q=0;q<m;q++)              //以q为参数循环
				{
					x=(q*a)%m;                    //计算x的值
					if((a*x-1)%m==0)              //如果x符合条件就退出循环
					{
						break;
					}
					x=-1;                         //如果不符合是x的值变为-1
				}
				if(x==-1)                         //若结果为-1说明x不存在，反之则说明x存在，并输出x
				{
					System.out.println("Not Exist");
				}else
				{
					System.out.println(x);
				}
			}
		}
	}
}
/*
 * x=q*a%m
 * n<m(当q==m时q*a%m==0;此后q=m+1与q==1无异)
 * (a*x-1)%m==0*/
