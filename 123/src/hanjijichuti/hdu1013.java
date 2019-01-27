package hanjijichuti;	

import java.util.Scanner;

public class hdu1013
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNext())
		{
			String temp=s.next();
			if(temp.equals("0"))break;
			while(temp.length()>1)
			{
				temp=qwe(temp);
				
			}
			System.out.println(temp);
		}
	}
	public static String qwe(String temp)
	{
		long q=0;
		for(int a=0;a<temp.length();a++)
		{
			q+=temp.charAt(a)-'0';
		}
		temp=String.valueOf(q);
		return temp;
	}
}
