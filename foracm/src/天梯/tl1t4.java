package ÌìÌÝ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tl1t4
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		List list=new ArrayList<String>();
		while(s.hasNext())
		{
			list.clear();
			String temp="";
			while(true)
			{
				temp=s.next();
				if(temp.equals("."))break;
				else list.add(temp);
			}
			if(list.size()<2)
			{
				System.out.println("Momo... No one is for you ...");
			}else if(list.size()<14)
			{
				System.out.println(list.get(1)+" is the only one for you...");
			}else
			{
				System.out.println(list.get(1)+" and "+list.get(13)+" are inviting you to dinner...");
			}
		}
	}

}
