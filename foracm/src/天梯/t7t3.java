package ÌìÌİ;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class t7t3
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		while(s.hasNextLine())
		{
			String q=s.nextLine();
			String w=s.nextLine();
			int[] arrq=new int[q.length()];
			Set<Integer> set=new HashSet<Integer>();
			for(int a=0;a<q.length();a++)
			{
				arrq[a]=(int)q.charAt(a);
			}
			for(int a=0;a<w.length();a++)
			{
				set.add((int)w.charAt(a));
			}
			for(int a=0;a<q.length();a++)
			{
				if(!set.contains(arrq[a]))
				{
					System.out.print((char)arrq[a]);
				}
			}
			System.out.println();
		}
		
		
	}
}
