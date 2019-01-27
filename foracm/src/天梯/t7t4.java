package ÌìÌİ;

import java.util.Scanner;

public class t7t4
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int a=s.nextInt();
			System.out.println("2^"+a+(int)Math.pow(2, a));
		}
	}
}
