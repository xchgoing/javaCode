package zuoye;

import java.util.Scanner;

public class y1124
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int a=(s.nextInt()-1)/3;
			switch(a)
			{
			   case 0:System.out.println("����");break;
			   case 1:System.out.println("�ļ�");break;
			   case 2:System.out.println("�＾");break;
			   case 3:System.out.println("����");break;
			   default:
			   {
			     System.out.println("��Լ�ڶ���");
			   }
			}
		}
	}

}
