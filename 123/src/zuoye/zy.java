package zuoye;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class zy
{

	public static void main(String[] args)
	{
		System.out.println("������һ��һ��ʮ��λ������");
		Scanner s=new Scanner( new BufferedInputStream(System.in));
		while(s.hasNext())
		{
			String q=s.next();
			if(q.length()>12)
			{
				System.out.println("������������������");
			}else
			{
				StringBuffer  w=new StringBuffer(q);
				w=w.reverse();
				System.out.println("��ת��Ϊ��"+w);
				System.out.println("Ϊ"+q.length()+"λ��");
			}
		}
    }

}
