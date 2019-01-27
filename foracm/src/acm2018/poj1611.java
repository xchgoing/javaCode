package acm2018;

import java.util.Scanner;

public class poj1611
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			int g=s.nextInt();
			if(n==0&&g==0)
			{
				break;
			}
			int[] arr=new int[n];
			for(int a=0;a<arr.length;a++)
			{
				arr[a]=a;
			}
			for(int a=0;a<g;a++)
			{
				int b=s.nextInt();
				int[] atemp=new int[b];
				int temp1=0;//找第一个数的节点
				int temp2=0;//往后找节点
				for(int c=0;c<b;c++)
				{
					atemp[c]=s.nextInt();
					if(c==0)
					{
						temp1=atemp[c];
						while(true)//找第一个数的节点的循环
						{
							if(arr[temp1]==temp1)
							{
								break;
							}
							temp1=arr[temp1];
						}
					}else
					{
						temp2=atemp[c];
						while(true)//找第一个数的节点的循环
						{
							if(arr[temp2]==temp2)
							{
								break;
							}
							temp2=arr[temp2];
						}
						arr[temp2]=temp1;//把往后的数的节点都加到第一个数的节点上
					}
				}
			}
			int zero=0;
			while(true)
			{
				if(arr[zero]==zero)
				{
					break;
				}
				zero=arr[zero];
			}
			int count=1;
			for(int i=0;i<arr.length;i++)
			{
				int temp=i;
				if(arr[temp]!=temp)
				{
					while(true)
					{
						if(arr[temp]==temp)
						{
							break;
						}
						temp=arr[temp];
					}
					if(temp==zero)count++;
				}
			}
			System.out.println(count);
		}
	}

}
