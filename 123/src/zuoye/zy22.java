package zuoye;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class zy22
{

	public static void main(String[] args)
	{
		System.out.println("������һ��1��12λ������");
		Scanner s=new Scanner(new BufferedInputStream(System.in));
		while(s.hasNextLong())
		{
			long a=s.nextLong();
			int q=String.valueOf(a).length();
			if(q>12)
			{
				System.out.println("������������������");
			}else
			{
				System.out.print("��ת��Ϊ��");
				for(double w=1;w<=q;w++)
				{
					long e=(a/(long)(Math.pow(10.0, w-1)))%10;
					System.out.print(e);
				}
				System.out.println();
				System.out.println("��"+q+"λ");
			}
		}
    }

}
