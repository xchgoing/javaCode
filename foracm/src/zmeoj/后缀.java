package zmeoj;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class บ๓ืบ
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextInt())
		{
			int n=s.nextInt();
			Set<String> set=new HashSet();
			while(n-->0)
			{
				String q=s.next();
				if(q.endsWith(".exe"))
				{
					if(set.add(q))System.out.println(q);
				}
			}
		}
	}

}
