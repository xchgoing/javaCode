package ÌìÌÝ×Ü;

import java.util.Arrays;
import java.util.Scanner;

public class L1L032
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(s.hasNextInt())
		{
			int le=s.nextInt();
			String add=s.next();
			s.nextLine();
			String all=s.nextLine();
			char[] arr=new char[le];
			Arrays.fill(arr, add.charAt(0));
			for(int a=le-1;a>-1;a--)
			{
				if(a-le+all.length()>-1)
				arr[a]=all.charAt(a-le+all.length());
			}
			for(int a=0;a<le;a++)
			{
				System.out.print(arr[a]);
			}
			System.out.println();
		}
	}

}
