package zuoye;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class zyy
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (new BufferedInputStream(System.in));
		System.out.println("��������ĳɼ���0����100��");
		while(s.hasNextInt())
		{
			int a=s.nextInt();
			if(a<0||a>100)
			{
				System.out.println("��ķ��������������������롣");
			}else if(a>=90)
			{
				System.out.println("��ĵȼ��ǣ�A");
				System.out.println("���������");
			}else if(a>=80)
			{
				System.out.println("��ĵȼ��ǣ�B");
				System.out.println("�����Ŭ��A����������");
			}else if(a>=70)
			{
				System.out.println("��ĵȼ��ǣ�C");
				System.out.println("�ɼ�Ƿ�ѣ�Ҫѧϰע�ⷽ����");
			}else if(a>=60)
			{
				System.out.println("��ĵȼ��ǣ�D");
				System.out.println("������Χ��С�ı��E");
			}else
			{
				System.out.println("��ĵȼ��ǣ�E");
				System.out.println("�Ҷ�������˼˵����");
			}
		}
	}

}
