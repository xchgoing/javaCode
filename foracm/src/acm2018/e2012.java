package acm2018;

import java.util.Arrays;
import java.util.Scanner;
public class e2012
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			for(int a=0;a<n;a++)
			{
				int m=s.nextInt();
				char[] arr=new char[12];//���ڴ���ĸ
				int[] arr2=new int[12];//���ڴ����
				String q=s.next();
				for(int c=0;c<12;c++)//������ĸ
				{
					arr[c]=q.charAt(c);
				}
				Arrays.sort(arr);//��ΪҪ��ĸ˳���������������
				for(int b=0;b<m-1;b++)//�ַ�����ѭ��
				{
					q=s.next();//���ַ���
					for(int c=0;c<12;c++)//����q�Ľ�ȡ
					{
						for(int d=0;d<12;d++)//����arr��ѭ��
						{
							if(arr[d]==q.charAt(c)&&arr2[d]==b)//�Ƚϲ���ֻ��֮ǰһֱ���ظ����ұ���û�б��ӹ��Ĳſ��Դ�����һ
							{
								arr2[d]++;//������һ
								break;
							}
						}
					}
				}
				for(int c=0;c<12;c++)//���������ҳ��ظ��Ĳ����
				{
					if(arr2[c]==m-1)
					{
						System.out.print(arr[c]);
					}
				}
				System.out.println();
			}
		}
	}
}
//���ֵ�˳�����
//ע��
//���룺AAAAAABBBBBB
//   BBBBBBBBBBBB
//�����BBBBBB
//�����
