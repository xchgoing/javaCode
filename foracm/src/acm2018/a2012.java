package acm2018;

import java.util.Scanner;

public class a2012
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();//��n���洢���Ե�����
			for(int a=0;a<n;a++)//��forѭ�������Ʋ�������
			{
				s.next();//������һ������
				String q=s.next();//��q���洢�ڶ�������
				s.next();//��������������
				System.out.println(q+" will survive");//����ʽ�����
			}
		}
	}
}
