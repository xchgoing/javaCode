package javaclass;

import java.util.Scanner;

public class j1117
{

	public static void main(String[] args)
	{
		System.out.println("������·��");
		Scanner s=new Scanner (System.in);
		while(s.hasNextDouble())
		{
			double a=s.nextDouble();
			if(a<0)
			{
				System.out.println("���ң��㱳�ų����ˣ�");
			}
			else if(a==0)
			{
				System.out.println("Ҫ����"+"0"+"Ԫ");
			}else if(a<=2&&a>0)
			{
				System.out.println("Ҫ����"+"6"+"Ԫ");
			}
			else
			{
				System.out.println("Ҫ��"+String.format("%.2f",(6+(a-2)*5))+"Ԫ");
			}
			
		}
	}

}
