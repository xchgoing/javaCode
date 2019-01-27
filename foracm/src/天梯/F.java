package ÌìÌÝ;

import java.util.Scanner;

public class F
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			while(n-->0)
			{
				int count=0;
				String input=s.next();
				char[] arr=input.toCharArray();
				for(int a=0;a<arr.length;a++)
				{
					if(arr[a]-'0'>-1&&arr[a]-'0'<10)count++;
				}
				System.out.println(count);
			}
			
		}
	}

}
