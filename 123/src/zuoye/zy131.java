package zuoye;

import java.util.Scanner;

public class zy131
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("����4������������վ�����1û�еľ�����0");
		System.out.println("��Ｆ��");
		System.out.println("����������");
		System.out.println("ţ��������");
		System.out.println("������ﹷ");
		while(s.hasNext())
		{
			String q=s.next();
			String[] arr={"��","ţ","��","��","��","��","��","��","��","��","��","��"};
			if(Integer.parseInt(q, 2)<1||Integer.parseInt(q, 2)>12)
			{
				System.out.println("����");
			}
			System.out.println("����"+arr[Integer.parseInt(q, 2)-1]);
		}
	}

}
