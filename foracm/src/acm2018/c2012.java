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
				if(a==1||m==1)                     //��a��mΪ1ʱx==0��ʱ����������ĿҪ�������
				{                                  //��a��mΪ1ʱֱ�����1��continue
					System.out.println(1);
					continue;
				}
				int x=0;                          
				for(int q=0;q<m;q++)              //��qΪ����ѭ��
				{
					x=(q*a)%m;                    //����x��ֵ
					if((a*x-1)%m==0)              //���x�����������˳�ѭ��
					{
						break;
					}
					x=-1;                         //�����������x��ֵ��Ϊ-1
				}
				if(x==-1)                         //�����Ϊ-1˵��x�����ڣ���֮��˵��x���ڣ������x
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
 * n<m(��q==mʱq*a%m==0;�˺�q=m+1��q==1����)
 * (a*x-1)%m==0*/
