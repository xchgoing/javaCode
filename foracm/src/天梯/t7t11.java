package ����;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/*
 * reoto ���ִ洢1��1�Ĺ�ϵ
 * refa ����洢��Ӧ��ŵ���Ա�ļ�ͥ��Ա����һά���Լ��ı�ţ��ڶ�ά�Ǽ�ͥ��Ա�ͷ�����Ϣ��reaf[x][100000]��reaf[x][100001]�Ƿ��ӵ������������ ����
 */
public class t7t11
{

	static int[] reoto=new int[10000];
	static int[][] refa=new int[10000][10003];
	static int mianji=0;
	static int ts=0;
	static int count=1;
	static int minout=-1;
	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			Arrays.fill(reoto, -1);
			int n=s.nextInt();
			while(n-->0)
			{
				int Mnumber=s.nextInt();
				int min=Mnumber;
				if(reoto[Mnumber]==-1)reoto[Mnumber]=Mnumber;
				int fa=s.nextInt();
				min=min(Mnumber,fa);
				int mo=s.nextInt();
				min=min(min,mo);
				int k=s.nextInt();
				while(k-->0)
				{
					int temp=s.nextInt();
					if(temp!=-1)
					{
						refa[Mnumber][temp]=1;
						reoto[temp]=Mnumber;
						min=min(min,temp);
					}
				}
				refa[Mnumber][100000]=s.nextInt();
				refa[Mnumber][100001]=s.nextInt();
				refa[Mnumber][100002]=min;
			}
			
			//��Ϣ¼�����
			
			for(int a=0;a<reoto.length;a++)
			{
				if(reoto[a]==a)
				{
					so(a);
					System.out.println(minout+" "+count+" "+ts*1.0/count+" "+mianji*1.0/count);
					mianji=0;
					ts=0;
					count=1;
					minout=-1;
				}
			}
		}
	}
	public static Integer min(int a,int b)
	{
		if(a==-1||b==-1)return a+b+1;
		return Math.min(a, b);
	}
	
	public static void so(int q)
	{
		if(reoto[q]==-1)return;
		mianji+=refa[q][100001];
		ts+=refa[q][100000];
		count++;
		reoto[q]=-1;
		minout=min(minout,refa[q][100002]);
		for(int a=0;a<100000;a++)
		{
			if(refa[q][a]==1)
			{
				so(refa[q][a]);
			}
		}
		return;
	}
}

