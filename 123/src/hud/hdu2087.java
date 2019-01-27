package hud;

import java.util.Scanner;

public class hdu2087
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNext())
		{
			String d=s.next();
			if(d.equals("#"))break;
			String x=s.next();
			int count =0;
			String temp="";
			for(int a=0;a<d.length()+1-x.length();a++)
			{
				for(int q=0;q<x.length();q++)
				{
					temp=temp+d.charAt(a+q);
					//System.out.println(temp);
					if(temp.equals(x))
					{
						count++;
					}
				}
				temp="";
			}
			System.out.println(count);
		}
	}
}
