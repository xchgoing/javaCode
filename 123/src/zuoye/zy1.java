package zuoye;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class zy1
{

	public static void main(String[] args)
	{
		System.out.println("������һ��һ��ʮ��λ����");
		Scanner s=new Scanner(new BufferedInputStream(System.in));
		while(s.hasNext())
		{
			String q=s.next();
			if(q.length()>12)
			{
				System.out.println("������������������");
			}else
			{
				char[] qs=q.toCharArray();
				for(int a=0;a<q.length()/2;a++)
				{
					char w=qs[a];
					qs[a]=qs[q.length()-a-1];
					qs[q.length()-a-1]=w; 
				}
				String w=String.valueOf(qs);
				System.out.println("��ת��Ϊ��"+w);
				System.out.println("Ϊ"+q.length()+"λ��");
			}
		}

	}

}
