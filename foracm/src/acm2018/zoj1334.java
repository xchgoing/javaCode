package acm2018;

import java.math.BigInteger;
import java.util.Scanner;

public class zoj1334
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNext())
		{
			BigInteger a=new BigInteger(s.next()/*�������*/,s.nextInt()/*��������Ǽ����Ƶ�*/);
			String out=a.toString(s.nextInt()).toUpperCase();//����תΪ��s.next()�����ƴ���out
			if(out.length()>7)out="ERROR";
			System.out.println(String.format("%7s",out));
		}
	}

}
