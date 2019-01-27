package hud;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class hud2052
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (new BufferedInputStream(System.in));
		while(s.hasNextLine())
		{
			String sr=s.nextLine();
			if(sr.equals("EOF"))break;
			String[] arr=sr.split(" ");
			int a=Integer.valueOf(arr[0]);
			int b=Integer.valueOf(arr[1]);
			hen(a);
			for(int q=0;q<b;q++)
			{
				shu(a);
			}
			hen(a);
			System.out.println();
		}

	}
	public static void hen(int a)
	{
		System.out.print("+");
		for(int q=0;q<a;q++)
		{
			System.out.print("-");
		}
		System.out.println("+");
	}
	public static void shu(int a)
	{
		System.out.print("|");
		for(int q=0;q<a;q++)
		{
			System.out.print(" ");
		}
		System.out.println("|");
	}

}
