package zuoye;

import java.util.Scanner;

public class zye132
{

	public static void main(String[] args)
	{
		System.out.println("���������18λ���֤");
		Scanner s=new Scanner (System.in);
		while(s.hasNext())
		{
			String q=s.nextLine();
			if(q.length()!=18)
			{
				System.out.println("��������");
			}else
			{
				int a=Integer.valueOf(q.substring(15,16));
				if(a%2==0)
				{
					System.out.println("��ϲ���Ǹ�Ů��");
				}else
				{
					System.out.println("��ϲ���Ǹ��е�");
				}
			}
		}
	}

}
