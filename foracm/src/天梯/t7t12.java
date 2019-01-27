package ÌìÌİ;

import java.util.Scanner;

public class t7t12
{

	static char[] arr;
	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextLine())
		{
			int count=0;
			String input=s.nextLine();
			arr=new char[input.length()];
			for(int a=0;a<arr.length;a++)
			{
				arr[a]=input.charAt(a);
			}
			for(int a=0;a<arr.length;a++)
			{
				for(int b=a;b<arr.length;b++)
				{
					if(y(a,b)&&count<b-a)
					{
						count=b-a;
					}
				}
			}
			System.out.println(++count);
		}
	}
	
	public static boolean y(int a,int b)
	{
		while(a<b)
		{
			if((int)arr[a]!=(int)arr[b])
			{
				return false;
			}
			++a;--b;
		}
		return true;		
	}
}
