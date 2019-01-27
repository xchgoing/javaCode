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
			BigInteger a=new BigInteger(s.next()/*输入的数*/,s.nextInt()/*输入的数是几进制的*/);
			String out=a.toString(s.nextInt()).toUpperCase();//将数转为（s.next()）进制存入out
			if(out.length()>7)out="ERROR";
			System.out.println(String.format("%7s",out));
		}
	}

}
