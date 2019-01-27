package zmeoj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ³ÇÊÐ³©Í¨
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			List<String> list=new ArrayList<String>();
			while(n-->0)
			{
				String q=s.next();
				String w=s.next();
				boolean find=false;
				for(int a=0;a<list.size();a++)
				{
					if(list.get(a).contains(q))
					{
						String temp=list.get(a)+w;
						list.remove(a);
						list.add(temp);
						find=true;
						break;
					}else if(list.get(a).contains(w))
					{
						String temp=list.get(a)+q;
						list.remove(a);
						list.add(temp);
						find=true;
						break;
					}
				}
				if(!find)list.add(q+w);
			}
			String q=s.next();
			String w=s.next();
			String out="NO";
			for(int a=0;a<list.size();a++)
			{
				if(list.get(a).contains(q)&&list.get(a).contains(w))
				{
					out="OK";
					break;
				}
			}
			System.out.println(out);
		}
		
	}

}
