package acm2018;

import java.util.*;
import java.io.*;
import java.math.*;
public class test
{
	public static void main(String[] args) 
	{
		final int LEN=1000005;//����������
		final int MAX=100;//int���20�����ң�������Լ5�����5���ڵ�����
		int[] prime=new int[MAX];//�洢�Ķ���������������
		boolean[] isp=new boolean[MAX];//�Ƿ��������ı�����Ĭ�ϲ���
		int count=0;//����������ǰ�ҵ��ڼ��������ˣ��������ܸ���
		
		for(int i=2;i<MAX;i++)//��2��Maxһ��һ��ɸѡ
		{
			if(isp[i]==false)//���i���������ı�������������
			{
				 
				prime[count]=i;//prime�洢�ҵ���count������
				count++;
			}
			
			//��Ե�ǰ��i�����Ѿ��ҵ���count������ȥ��ɸѡ
			for(int j=0;j<count&& i*prime[j]<MAX;j++)
			{
				isp[i*prime[j]]=true;
				if(i%prime[j]==0)//���i����������������˳�
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