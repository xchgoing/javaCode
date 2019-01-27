package 赛后;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 牛客小白月赛签到
{
	static int count=0;
	static List<String> list=new ArrayList<String>();
	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNext())
		{
			list.clear();
			count=0;
			int n=s.nextInt();
			while(n-->0)
			{
				String q=s.next();
				add(q);
			}
			System.out.println(count);
		}
	}
	public static void add(String q)
	{
		System.out.println(list.toString()+"  "+count);
		if(list.contains(q))
		{
			count++;
			q=String.valueOf(Integer.valueOf(q)*2);
			add(q);
		}else
		{
			list.add(q);
		}
	}

}
