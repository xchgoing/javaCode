package zuoye;

import java.util.Scanner;

public class zuoye7
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		try
		{
			while(true)
			{
				int temp=s.nextInt();
				if(temp<0||temp>100)
				{
					System.out.println("�������,����������");
					continue;
				}
				temp=temp/10;
				switch(temp)
				{
				   case 10:
				   case 9:System.out.println("��ĳɼ���"+"A"+"��������");break;
				   case 8:System.out.println("��ĳɼ���"+"B"+"�Ӱ��Ϳ쵽A��");break;
				   case 7:System.out.println("��ĳɼ���"+"C"+"�㲻��Ŭ����");break;
				   case 6:System.out.println("��ĳɼ���"+"D"+"�����ˣ���Ҫ����");break;
				   default:System.out.println("��ĳɼ���"+"E"+"�Լ����");
				}
			}
		}	
		catch(Exception ex)
		{
			System.out.println("�����");
			String temp=s.next();
		}
			
	}
}


