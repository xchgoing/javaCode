package acm2018;

import java.util.*;
import java.io.*;
import java.math.*;
public class test
{
	public static void main(String[] args) 
	{
		final int LEN=1000005;//区间最大距离
		final int MAX=100;//int最大20亿左右，开根号约5万，求出5万内的素数
		int[] prime=new int[MAX];//存储的都是素数，递增的
		boolean[] isp=new boolean[MAX];//是否是素数的倍数，默认不是
		int count=0;//用来计数当前找到第几个素数了，素数的总个数
		
		for(int i=2;i<MAX;i++)//从2到Max一个一个筛选
		{
			if(isp[i]==false)//如果i不是素数的倍数（是素数）
			{
				 
				prime[count]=i;//prime存储找到第count个素数
				count++;
			}
			
			//针对当前的i，用已经找到的count个素数去做筛选
			for(int j=0;j<count&& i*prime[j]<MAX;j++)
			{
				isp[i*prime[j]]=true;
				if(i%prime[j]==0)//如果i能整除这个素数就退出
				{
					break;
				}
			}
		}
		for(int x=0;x<isp.length;x++)
		{
			if(isp[x])
			System.out.print(x+" ");
			
		}
	}
}